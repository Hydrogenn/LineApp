/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.util.List;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerServerGUI extends javax.swing.JFrame {
    
    /** Creates new form GraphicsHandler */
    public LineHandlerServerGUI() {
        LineHandlerServer server = new LineHandlerServer(this);
        
        server.start();
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solveButton = new javax.swing.JButton();
        logLabel = new javax.swing.JLabel();
        projectName = new javax.swing.JTextField();
        addProjectButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTree = new com.hydrogenn.LineTree();
        ascendButton = new javax.swing.JButton();
        descendButton = new javax.swing.JButton();
        removeProjectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        solveButton.setText("Solve Problems");
        solveButton.setEnabled(false);
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        logLabel.setForeground(new java.awt.Color(153, 153, 153));
        logLabel.setText("LineMaster™");
        logLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        projectName.setText("PrintChallenge0");

        addProjectButton.setText("Add Project");
        addProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save Class");

        loadButton.setText("Load Class");

        lineTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                lineTreeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lineTree);

        ascendButton.setText("Increase Priority");
        ascendButton.setEnabled(false);
        ascendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendButtonActionPerformed(evt);
            }
        });

        descendButton.setText("Decrease Priority");
        descendButton.setEnabled(false);
        descendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendButtonActionPerformed(evt);
            }
        });

        removeProjectButton.setText("Remove Project");
        removeProjectButton.setEnabled(false);
        removeProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProjectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addProjectButton)
                                .addGap(64, 64, 64)
                                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeProjectButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ascendButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descendButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ascendButton, descendButton, removeProjectButton, solveButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addProjectButton, loadButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProjectButton)
                    .addComponent(projectName)
                    .addComponent(loadButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solveButton)
                    .addComponent(ascendButton)
                    .addComponent(descendButton)
                    .addComponent(removeProjectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        lineTree.resolveProblems();
    }//GEN-LAST:event_solveButtonActionPerformed

    private void addProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectButtonActionPerformed
        lineTree.addProject(projectName.getText());
    }//GEN-LAST:event_addProjectButtonActionPerformed

    private void rickRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rickRollActionPerformed

//        try {
//            Desktop desktop = java.awt.Desktop.getDesktop();
//            URI oURL = new URI("https://www.youtube.com/watch?v=hVPE47krnMY");
//            desktop.browse(oURL);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_rickRollActionPerformed
    private void lineTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_lineTreeValueChanged
        //TODO update the buttons based on what is selected
        
        boolean isProjectSelected = lineTree.isProjectSelected();
        boolean isProblemSelected = lineTree.isProblemSelected();
        
        solveButton.setEnabled(isProblemSelected);
        removeProjectButton.setEnabled(isProjectSelected);
        ascendButton.setEnabled(isProjectSelected);
        descendButton.setEnabled(isProjectSelected);
        
    }//GEN-LAST:event_lineTreeValueChanged

    private void removeProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProjectButtonActionPerformed
        
    }//GEN-LAST:event_removeProjectButtonActionPerformed

    private void ascendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendButtonActionPerformed
        lineTree.adjustPriority(true);
    }//GEN-LAST:event_ascendButtonActionPerformed

    private void descendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendButtonActionPerformed
        lineTree.adjustPriority(false);
    }//GEN-LAST:event_descendButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LineHandlerServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineHandlerServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineHandlerServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineHandlerServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineHandlerServerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProjectButton;
    private javax.swing.JButton ascendButton;
    private javax.swing.JButton descendButton;
    private javax.swing.JScrollPane jScrollPane2;
    private com.hydrogenn.LineTree lineTree;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel logLabel;
    private javax.swing.JTextField projectName;
    private javax.swing.JButton removeProjectButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton solveButton;
    // End of variables declaration//GEN-END:variables
  
    void log(String string) {
        logLabel.setForeground(Color.BLACK);
        logLabel.setText(string);
    }

    void addLine(Problem problem) {
        lineTree.addProblem(problem);
    }
    
    void removeLine(Problem problem) {
        lineTree.recallProblem(problem);
    }
    
    DefaultTreeModel getProblems() {
        return lineTree.model;
    }

    public List<String> getProjects() {
        return lineTree.getProjects();
    }

}
