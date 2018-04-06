/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerServer extends Thread {
    
    LineHandlerGUI gui;
    
    LineHandlerServer(LineHandlerGUI gui) {
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
                
                DataInputStream in = new DataInputStream(server.getInputStream());
                
                String name, problem;
                
                name = in.readUTF();
                problem = in.readUTF();
                
                gui.addLine(name, problem);
                
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Added to list!");
                
                server.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(LineHandlerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
