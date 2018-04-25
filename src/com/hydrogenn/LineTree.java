/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Joshua Davenport
 */
public class LineTree extends JTree {
    
    DefaultTreeModel model;
    DefaultMutableTreeNode root;
    
    public LineTree() {
        
        DefaultTreeCellRenderer renderer = generateTreeRenderer();
        
        setCellRenderer(renderer);
        
        model = (DefaultTreeModel) getModel();
        root =  new DefaultMutableTreeNode("Problems");
        model.setRoot(root);
        
    }
    
    public void addProblem(Object o) {
        root.add(new DefaultMutableTreeNode(o));
    }
    
    public void resolveProblems() {
        for (TreePath path : getSelectionPaths()) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) (path.getLastPathComponent());
            model.removeNodeFromParent(node);
        }
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
    
}
