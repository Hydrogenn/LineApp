/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerClient {

    private LineHandlerClientGUI gui;
    private Socket client;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    public LineHandlerClient(LineHandlerClientGUI gui) {
        this.gui = gui;
    }
    
    public void connect(String ip, int port) throws IOException {
        client = new Socket(ip, port);
        
        out = new ObjectOutputStream(client.getOutputStream());
        in = new ObjectInputStream(client.getInputStream());
    }
    
    public void disconnect() throws IOException {
        
        out.writeObject(Protocol.CLIENT_END);
        client.close();
        out = null;
        in = null;
    }
    
    public void send(Problem problem) {
        
        try {
            
            out.writeObject(Protocol.CLIENT_PROBLEM);
            
            out.writeObject(problem);
            
        } catch (IOException ex) {
            Logger.getLogger(LineHandlerServerGUI.class.getName()).log(Level.SEVERE, null, ex);
            gui.log("Could not send the message!");
        }
        
        update();
        
    }
    
    public void remove(Problem problem) {
        
        try {
            
            out.writeObject(Protocol.CLIENT_SOLVED);
            
            out.writeObject(problem);
            
        } catch (IOException ex) {
            Logger.getLogger(LineHandlerServerGUI.class.getName()).log(Level.SEVERE, null, ex);
            gui.log("Could not send the message!");
        }
        
        update();
        
    }
    
    public void update() {
        
        try {
            
            out.writeObject(Protocol.CLIENT_UPDATE);
            
            gui.setLine((DefaultTreeModel) in.readObject());
            
        } catch (IOException | ClassNotFoundException ex) {
            gui.log("Could not find where you are in the line!");
        }
        
    }
    
    public void getProjects() {
        
        try {
            
            out.writeObject(Protocol.CLIENT_PROJECTS);
            
            gui.setProjects((List<String>) in.readObject());
        
        } catch (IOException | ClassNotFoundException ex) {
            gui.log("Could not find where you are in the line!");
        }
        
    }
    
}
