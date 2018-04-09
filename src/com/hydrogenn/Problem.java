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
    
    String name, project, problem;
    
    public Problem(String name, String project, String problem) {
        this.name = name;
        this.project = project;
        this.problem = problem;
    }
    
    @Override
    public String toString() {
        return name + ": " + problem;
    }
    
}
