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
class Problem {
    
    String name, problem;
    
    public Problem(String name, String problem) {
        this.name = name;
        this.problem = problem;
    }
    
    @Override
    public String toString() {
        return name + ": " + problem;
    }
    
}
