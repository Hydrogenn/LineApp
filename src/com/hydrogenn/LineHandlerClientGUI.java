/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//make leave line button
package com.hydrogenn;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author Joshua Davenport
 */
public class LineHandlerClientGUI extends javax.swing.JFrame {
    private final static int TIME = 1;

    List<Problem> line = new ArrayList<>();
    
    LineHandlerClient client = new LineHandlerClient(this);
    
    //private final static int TIME = 5000;
    
    private Timer timer;
    /** Creates new form LineHandlerClient */
    public LineHandlerClientGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.")

     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        helpButton = new javax.swing.JButton();
        problemPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        projectLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        projectTextField = new javax.swing.JTextField();
        problemLabel = new javax.swing.JLabel();
        problemTextField = new javax.swing.JTextField();
        customServerPanel = new javax.swing.JPanel();
        ipTextField = new javax.swing.JTextField();
        ipLabel = new javax.swing.JLabel();
        portTextField = new javax.swing.JTextField();
        portLabel = new javax.swing.JLabel();
        serverCheckbox = new javax.swing.JCheckBox();
        lineStatusPane = new javax.swing.JScrollPane();
        lineStatusText = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        sourceButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpButton.setText("Send Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        problemPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Problem Information"));

        nameLabel.setText("Name:");
        nameLabel.setToolTipText("Your name, so Mr. Jones knows who to help.");

        projectLabel.setText("Project:");
        projectLabel.setToolTipText("The project you are having a problem with.");

        nameTextField.setText("Name");
        nameTextField.setToolTipText("Your name, so Mr. Jones knows who to help.");

        projectTextField.setText("PrintChallenge0");
        projectTextField.setToolTipText("The project you are having a problem with.");

        problemLabel.setText("Problem:");
        problemLabel.setToolTipText("Some information about the problem you are having.");

        problemTextField.setToolTipText("Some information about the problem you are having.");
        problemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout problemPanelLayout = new javax.swing.GroupLayout(problemPanel);
        problemPanel.setLayout(problemPanelLayout);
        problemPanelLayout.setHorizontalGroup(
            problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectLabel)
                    .addComponent(nameLabel)
                    .addComponent(problemLabel))
                .addGap(23, 23, 23)
                .addGroup(problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(problemPanelLayout.createSequentialGroup()
                        .addComponent(problemTextField)
                        .addGap(8, 8, 8))
                    .addComponent(nameTextField)
                    .addComponent(projectTextField))
                .addContainerGap())
        );
        problemPanelLayout.setVerticalGroup(
            problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problemPanelLayout.createSequentialGroup()
                .addGroup(problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(problemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(problemLabel)))
        );

        customServerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Server IP Address"));
        customServerPanel.setToolTipText("Determines which computer is the teacher's. The last value used is used as default.");
        customServerPanel.setEnabled(false);

        ipTextField.setText("127.0.0.1");
        ipTextField.setEnabled(false);

        ipLabel.setText("IP Address:");
        ipLabel.setEnabled(false);

        portTextField.setText("5000");
        portTextField.setEnabled(false);

        portLabel.setText("Port:");
        portLabel.setEnabled(false);

        javax.swing.GroupLayout customServerPanelLayout = new javax.swing.GroupLayout(customServerPanel);
        customServerPanel.setLayout(customServerPanelLayout);
        customServerPanelLayout.setHorizontalGroup(
            customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customServerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipLabel)
                    .addComponent(portLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portTextField)
                    .addComponent(ipTextField))
                .addContainerGap())
        );
        customServerPanelLayout.setVerticalGroup(
            customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customServerPanelLayout.createSequentialGroup()
                .addGroup(customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customServerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel)))
        );

        serverCheckbox.setSelected(true);
        serverCheckbox.setText("Use Last Server");
        serverCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverCheckboxActionPerformed(evt);
            }
        });

        lineStatusPane.setToolTipText("");

        lineStatusText.setText("You are not in line.");
        lineStatusText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lineStatusPane.setViewportView(lineStatusText);

        refreshButton.setText("Refresh");
        refreshButton.setEnabled(false);
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel Help");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        sourceButton.setText("Source");
        sourceButton.setEnabled(false);
        sourceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customServerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(problemPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lineStatusPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serverCheckbox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sourceButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, helpButton, refreshButton, sourceButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(problemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customServerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lineStatusPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(helpButton)
                    .addComponent(cancelButton)
                    .addComponent(sourceButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//I HEV IDEA: MAKE THE PROBLEMS ON THE HOST IN CHECKLIST FORM OR MAKE IT HAVE LINKS ON THE SIDE TO RESOLVE AND REMOVE THEM FROM LSIT
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        
        Problem problem = new Problem(nameTextField.getText(), projectTextField.getText(), problemTextField.getText());
        try {
            client.connect(ipTextField.getText(), Integer.parseInt(portTextField.getText()));
            client.send(problem);
            client.disconnect();
        } catch (IOException ex) {
            log("Unable to connect to server.");
        }
        cancelButton.setEnabled(true);
        helpButton.setEnabled(false);
        refreshButton.setEnabled(true);

        //freeze();
        
        
    }//GEN-LAST:event_helpButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void serverCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverCheckboxActionPerformed
        customServerPanel.setEnabled(!serverCheckbox.isSelected());
        for (Component component : customServerPanel.getComponents()) {
            component.setEnabled(!serverCheckbox.isSelected());
        }
    }//GEN-LAST:event_serverCheckboxActionPerformed

    private void problemTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_problemTextFieldActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        Problem problem = new Problem(nameTextField.getText(), projectTextField.getText(), problemTextField.getText());
        try {
            client.connect(ipTextField.getText(), Integer.parseInt(portTextField.getText()));
            client.update();
            client.disconnect();
        } catch (IOException ex) {
            log("Unable to connect to server.");
        }
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        
        Problem problem = new Problem(nameTextField.getText(), projectTextField.getText(), problemTextField.getText());
        try {
            client.connect(ipTextField.getText(), Integer.parseInt(portTextField.getText()));
            client.remove(problem);
            client.disconnect();
        } catch (IOException ex) {
            log("Unable to connect to server.");
        }
        cancelButton.setEnabled(false);
        helpButton.setEnabled(true);
        refreshButton.setEnabled(false);
        
        //freeze();
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void sourceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LineHandlerClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineHandlerClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineHandlerClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineHandlerClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineHandlerClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel customServerPanel;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane lineStatusPane;
    private javax.swing.JLabel lineStatusText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField portTextField;
    private javax.swing.JLabel problemLabel;
    private javax.swing.JPanel problemPanel;
    private javax.swing.JTextField problemTextField;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JTextField projectTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JCheckBox serverCheckbox;
    private javax.swing.JButton sourceButton;
    // End of variables declaration//GEN-END:variables

    void setLine(List<Problem> line) {
        this.line = line;
    }

    void log(String publicMessage) {
        System.out.println(publicMessage);
    }
    
    void updateLineText() {
        String lineText = "";
        for (Problem problem : line) {
            lineText += problem.toString() + "<br>";
        }
        lineStatusText.setText(lineText);
    }

    private void freeze() {
        helpButton.setEnabled(false);
        timer.start();
        helpButton.setEnabled(true);
    }
    
}
