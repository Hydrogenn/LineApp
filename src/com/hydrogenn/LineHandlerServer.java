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
    
    
                
    ObjectInputStream in;
    ObjectOutputStream out;
    
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
            Socket server = socketServer.accept();
            
            try {
                
                gui.log("Recieved a request from " + server.getRemoteSocketAddress());
                
                in = new ObjectInputStream(server.getInputStream());
                out = new ObjectOutputStream(server.getOutputStream());
                
                Protocol messageType;
                
                infoLoop:
                while (true) {
                    
                    messageType = (Protocol) in.readObject();
                
                    switch (messageType) {

                        case CLIENT_PROBLEM:
                            getProblem(server);
                            break;
                        case CLIENT_SOLVED:
                            removeProblem(server);
                            break;
                        case CLIENT_UPDATE:
                            sendLine(server);
                            break;
                        case CLIENT_END:
                            break infoLoop;
                    }

                }
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LineHandlerServer.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            server.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LineHandlerServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getProblem(Socket server) throws IOException, ClassNotFoundException {
        
        Problem problem = (Problem) in.readObject();

        gui.addLine(problem);
        
    }
    
    private void removeProblem(Socket server) throws IOException, ClassNotFoundException {

        Problem problem;

        problem = (Problem) in.readObject();

        gui.removeLine(problem);
        
    }
    
    private void sendLine(Socket server) throws IOException {
        
        out.writeObject(gui.getList());
        
    }
    
}
