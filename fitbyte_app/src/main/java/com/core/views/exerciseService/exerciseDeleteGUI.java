/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.views.exerciseService;

import com.core.DAO.ExerciseDAO;

/**
 *
 * @author Kevin
 */
public class exerciseDeleteGUI extends javax.swing.JPanel {

    /**
     * Creates new form exerciseDeleteGUI
     */
    public exerciseDeleteGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exerciseDeletePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exerciseDeleteID = new javax.swing.JTextField();
        exerciseDeleteButton = new javax.swing.JButton();

        jLabel1.setText("Borrar Ejercicio (NO SE PUEDE DESHACER)");

        jLabel2.setText("Ingresa la ID del ejercicio a borrar");

        exerciseDeleteButton.setText("Confirmar Borrado");
        exerciseDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exerciseDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exerciseDeletePanelLayout = new javax.swing.GroupLayout(exerciseDeletePanel);
        exerciseDeletePanel.setLayout(exerciseDeletePanelLayout);
        exerciseDeletePanelLayout.setHorizontalGroup(
            exerciseDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exerciseDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exerciseDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exerciseDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exerciseDeleteID)
                    .addComponent(exerciseDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        exerciseDeletePanelLayout.setVerticalGroup(
            exerciseDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exerciseDeletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(exerciseDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(exerciseDeleteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(exerciseDeleteButton)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exerciseDeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exerciseDeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exerciseDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exerciseDeleteButtonActionPerformed
      int exerciseID = Integer.parseInt(exerciseDeleteID.getText());
         if(ExerciseDAO.delete(exerciseID)>0){
                exerciseDeletePanel.removeAll();
                exerciseDeletePanel.setVisible(false);}    
    }//GEN-LAST:event_exerciseDeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exerciseDeleteButton;
    private javax.swing.JTextField exerciseDeleteID;
    private javax.swing.JPanel exerciseDeletePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
