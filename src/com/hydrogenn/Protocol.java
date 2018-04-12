/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

/**
 *
 * @author Joshua Davenport
 */
public enum Protocol {
    
    CLIENT_PROBLEM(ProtocolSide.CLIENT),
    CLIENT_SOLVED(ProtocolSide.CLIENT),
    CLIENT_UPDATE(ProtocolSide.CLIENT),
    CLIENT_END(ProtocolSide.CLIENT);
    
    ProtocolSide protocolSide;
    
    private Protocol(ProtocolSide protocolSide) {
        this.protocolSide = protocolSide;
    }
    
    public ProtocolSide getProtocolSide() {
        return protocolSide;
    }
    
    public enum ProtocolSide {
        CLIENT, SERVER;
    }
    
}
