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
class Problem implements Serializable {
    
    String name, project, problem;
    
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
            Problem problem = (Problem) o;
            return problem.getName().equals(this.getName()) &&
                    problem.getProject().equals(this.getProject()) &&
                    problem.getProblem().equals(this.getProject());
        } else return false;
    }
    
}
