/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.Serializable;

/**
 *
 * @author Joshua Davenport
 */
public class Problem implements Serializable {
    
    String name, project, problem;
//    boolean rickRoll;
//    
//    public void rickRoll() {
//        
//    }
    
    public Problem(String name, String project, String problem) {
        this.name = name;
        this.project = project;
        this.problem = problem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    @Override
    public String toString() {
        return name + ": " + problem;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Problem) {
            Problem otherProblem = (Problem) o;
            return otherProblem.getName().equals(getName()) &&
                    otherProblem.getProject().equals(getProject()) &&
                    otherProblem.getProblem().equals(getProblem());
        } else return false;
    }
    
    @Override
    public int hashCode() {
        return getName().hashCode() + getProject().hashCode() + getProblem().hashCode();
    }
    
}
