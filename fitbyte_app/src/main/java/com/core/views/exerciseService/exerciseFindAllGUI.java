/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.views.exerciseService;

import com.core.DAO.ExerciseDAO;
import java.awt.BorderLayout;
import java.util.ArrayList;
//from   ww w .  java  2 s. co m
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.core.DAO.PlateDAO;
import com.core.models.Exercise;
import com.core.models.Plate;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class exerciseFindAllGUI extends javax.swing.JPanel {

    /**
     * Creates new form exerciseFindAllGUI
     */
    public exerciseFindAllGUI() {
        
        JScrollPane scroll;     
   String col[] = {"Ejercicio_ID","Descripcion_Ejercicio", "Calorias Quemadas"};
   ArrayList<Exercise> exerciseList = ExerciseDAO.findAll();
   DefaultTableModel tableModel = new DefaultTableModel(col, 0);
   JTable jTable1 = new JTable(tableModel);
   scroll = new JScrollPane(jTable1);
   jTable1.repaint();
   for (int i = 0; i < exerciseList.size(); i++){
   int exerciseID = exerciseList.get(i).getExerciseID();
   String exerciseDescription  = exerciseList.get(i).getExerciseDescription();
   int exerciseBurnt= exerciseList.get(i).getBurntHourCalorieExercise();
   

   Object[] data = {exerciseID, exerciseDescription, exerciseBurnt};

  tableModel.addRow(data);

}
  add(scroll, BorderLayout.CENTER);
    setSize(600, 300);
    setVisible(true);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exerciseFindAllPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Lista de todos los Ejercicios");

        javax.swing.GroupLayout exerciseFindAllPanelLayout = new javax.swing.GroupLayout(exerciseFindAllPanel);
        exerciseFindAllPanel.setLayout(exerciseFindAllPanelLayout);
        exerciseFindAllPanelLayout.setHorizontalGroup(
            exerciseFindAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exerciseFindAllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(533, Short.MAX_VALUE))
        );
        exerciseFindAllPanelLayout.setVerticalGroup(
            exerciseFindAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exerciseFindAllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exerciseFindAllPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exerciseFindAllPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exerciseFindAllPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}