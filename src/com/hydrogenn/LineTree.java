/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import javax.swing.DropMode;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Joshua Davenport
 */
public class LineTree extends JTree implements Serializable {
    
    HashMap<String, DefaultMutableTreeNode> projects = new HashMap<>();
    HashMap<Problem, DefaultMutableTreeNode> problems = new HashMap<>();
    
    DefaultTreeModel model;
    DefaultMutableTreeNode root;
    DefaultMutableTreeNode other;
    
    public LineTree() {
        
        DefaultTreeCellRenderer renderer = generateTreeRenderer();
        
        setCellRenderer(renderer);
        
        model = (DefaultTreeModel) getModel();
        root =  new DefaultMutableTreeNode("Problems");
        other = new DefaultMutableTreeNode("(Other)");
        model.setRoot(root);
        root.add(other);
        
    }
    
    public void addProject(String project) {
        DefaultMutableTreeNode projectNode = new DefaultMutableTreeNode(project);
        root.add(projectNode);
        projects.put(project, projectNode);
        updateUI();
    }
    
    public void addProblem(Problem problem) {
        //TODO add problem to correct project
        DefaultMutableTreeNode problemNode = new DefaultMutableTreeNode(problem);
        projects.getOrDefault(problem.getProject(), other).add(problemNode);
        problems.put(problem, problemNode);
        updateUI();
    }
    
    public void recallProblem(Problem problem) {
        if (problems.containsKey(problem)) {
            projects.getOrDefault(problem.getProject(), other).remove(problems.get(problem));
            problems.remove(problem);
        }
        updateUI();
    }
    
    public void resolveProblems() {
        for (TreePath path : getSelectionPaths()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) (path.getLastPathComponent());
            model.removeNodeFromParent(node);
        }
        updateUI();
    }
    
    private DefaultTreeCellRenderer generateTreeRenderer() {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setOpenIcon(null);
        renderer.setClosedIcon(null);
        renderer.setLeafIcon(null);
        return renderer;
    }
    
    public void updateModel(DefaultTreeModel model) {
        setModel(model);
    }

    List<String> getProjects() {
        return new ArrayList(projects.keySet());
    }

    boolean isProjectSelected() {
        if (getSelectionPaths().length == 0) return false;
        for (TreePath path : getSelectionPaths()) {
            if (problems.containsValue((DefaultMutableTreeNode) path.getLastPathComponent())) return false;
        }
        return true;
    }

    boolean isProblemSelected() {
        TreePath[] selectionpath = getSelectionPaths();
        if (selectionpath.length == 0) return false;
        for (TreePath path : selectionpath) {
            if (projects.containsValue((DefaultMutableTreeNode) path.getLastPathComponent())) return false;
        }
        return true;
    }
    
    private void adjustSinglePriority(boolean increasing) {
        
        //TODO remove object and insert in the right spot
        
        
    }

    void adjustPriority(boolean increasing) {
        if (!isProjectSelected()) return;
        TreePath[] selectionPath = getSelectionPaths();
        
        for (TreePath path : selectionPath) {
            adjustSinglePriority(increasing);
        }
        
    }
    
}
