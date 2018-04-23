/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hydrogenn;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerServerGUI extends javax.swing.JFrame {

    private List<Problem> problemList = new ArrayList<>();
    private DefaultListModel listModel = new DefaultListModel();

    /** Creates new form GraphicsHandler */
    public LineHandlerServerGUI() {
        LineHandlerServer server = new LineHandlerServer(this);
        
        server.start();
        initComponents();
        
        lineList.setModel(listModel);
        updateLineLabel();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solveTypeField = new javax.swing.JTextField();
        solveProblemButton = new javax.swing.JButton();
        logPanel = new javax.swing.JPanel();
        logLabel = new javax.swing.JLabel();
        linePane = new javax.swing.JScrollPane();
        lineList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        solveTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveTypeFieldActionPerformed(evt);
            }
        });

        solveProblemButton.setText("Solve Problem");
        solveProblemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveProblemButtonActionPerformed(evt);
            }
        });

        logLabel.setForeground(new java.awt.Color(153, 153, 153));
        logLabel.setText("LineMaster™");
        logLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        lineList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "If you see this, it's an error!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        linePane.setViewportView(lineList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(solveProblemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solveTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addGap(261, 261, 261))
                    .addComponent(linePane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solveTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solveProblemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linePane, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solveTypeFieldActionPerformed

    private void solveProblemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveProblemButtonActionPerformed
        if (problemList.size() > 0) {
            List<String> problemNames = Problem.getProjects(problemList);
            if (problemNames.contains(solveTypeField.getText())) {
                for (Problem problem : problemList) {
                    if (problem.getProject().equalsIgnoreCase(solveTypeField.getText())) {
                        problemList.remove(problem);
                        updateLineLabel();
                        return;
                    }
                }
            } else {
                log("That project doesn't exist! (It has to be the exact name, ignoring case.)");
            }
        } else {
            log("There's nothing to remove!");
        }
    }//GEN-LAST:event_solveProblemButtonActionPerformed

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
    private javax.swing.JList<String> lineList;
    private javax.swing.JScrollPane linePane;
    private javax.swing.JLabel logLabel;
    private javax.swing.JPanel logPanel;
    private javax.swing.JButton solveProblemButton;
    private javax.swing.JTextField solveTypeField;
    // End of variables declaration//GEN-END:variables
  
    void log(String string) {
        logLabel.setForeground(Color.BLACK);
        logLabel.setText(string);
    }

    void addLine(Problem problem) {
        problemList.add(problem);
        updateLineLabel();
    }
    
    void removeLine(Problem problem) {
        problemList.remove(problem);
        updateLineLabel();
    }

    List<Problem> getList() {
        return problemList;
    }

    public void updateLineLabel() {
//        for (String listItem : Problem.updateLineLabel(problemList)) {
//            lineList.setText(Problem.updateLineLabel(problemList));
//        }
//TODO
    }

}
