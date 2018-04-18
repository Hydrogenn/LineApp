/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    
    public static String updateLineLabel(List<Problem> problemList) {
        if (problemList.size() > 0) {
            String lineLabelText = "<html>";
            for (String project : getProjects(problemList)) {
                lineLabelText += "<h3>" + project + "</h3>";
                Iterator<Problem> iter = problemList.stream().filter(problem -> problem.getProject().equals(project)).iterator();
                while (iter.hasNext()) {
                    lineLabelText += iter.next().toString() + "<br>";
                }
            }
            lineLabelText += "</html>";
            return (lineLabelText);
        } else {
            return ("No one is in line.");
        }
    }
    
    public static List<String> getProjects(List<Problem> problemList) {
        List<String> projects = new ArrayList<>();
        for (Problem problem : problemList) {
            if (!projects.contains(problem.getProject())) {
                projects.add(problem.getProject());
            }
        }
        return projects;
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
