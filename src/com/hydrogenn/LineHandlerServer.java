/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerServer extends Thread {
    
    LineHandlerServerGUI gui;
    
    LineHandlerServer(LineHandlerServerGUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void run() {
        
        while (true) {
            createServer();
        }
        
    }

    private void createServer() {
        try {
            
            ServerSocket socketServer = new ServerSocket(5000);
            
            try (Socket server = socketServer.accept()) {
                gui.log("Recieved a request from " + server.getRemoteSocketAddress());
                
                ObjectInputStream in = new ObjectInputStream(server.getInputStream());
                ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
                
                Protocol messageType = (Protocol) in.readObject();
                
                switch (messageType) {
                
                    case CLIENT_PROBLEM:
                        getProblem(server);
                        break;
                    case CLIENT_SOLVED:
                        removeProblem(server);
                    case CLIENT_UPDATE:
                        sendLine(server);
                    default:
                        if (messageType.getProtocolSide() == Protocol.ProtocolSide.CLIENT) {
                            gui.log("This server has a malformed protocol");
                        } else {
                            out.writeUTF("This client has a malformed protocol");
                        }
                }
                
                out.writeObject(gui.getList());
                
                server.close();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LineHandlerServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(LineHandlerServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getProblem(Socket server) throws IOException {
                
        ObjectInputStream in = new ObjectInputStream(server.getInputStream());
        
        String name, project, problem;

        name = in.readUTF();
        project = in.readUTF();
        problem = in.readUTF();

        gui.addLine(new Problem(name, project, problem));
        
        sendLine(server);
        
    }
    
    private void removeProblem(Socket server) throws IOException {
        
        ObjectInputStream in = new ObjectInputStream(server.getInputStream());
        
        String name, project, problem;

        name = in.readUTF();
        project = in.readUTF();
        problem = in.readUTF();

        gui.removeLine(new Problem(name, project, problem));
        
        sendLine(server);
        
    }
    
    private void sendLine(Socket server) throws IOException {
           
        ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
        
        out.writeObject(gui.getList());
        
        response(server, true);
        
    }
    
    private void response(Socket server, boolean success) throws IOException {
                
        ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
        
        out.writeBoolean(success);
        
    }
    
}
