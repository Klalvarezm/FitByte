/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.views.consumption;

import com.mycompany.fitbyte_app.ConnectionProvider;
import core.DAO.ExerciseDAO;
import core.DAO.User_CoachDAO;
import core.DAO.IngredientDAO;
import core.DAO.PlateDAO;
import core.DAO.ConsumptionDAO;
import core.models.Consumption;
import core.models.Exercise;
import core.models.User_Coach;
import core.models.Ingredient;
import core.models.Plate;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import user.DAO.UserDAO;
import user.models.User;
import com.mycompany.fitbyte_app.MainView;
import core.DAO.plateIngredientDAO;
import core.models.plateIngredient;
import core.views.HomeView;
import java.sql.Date;
import core.views.consumption.UserPane;
import core.views.consumption.ConsumptionCreate;
/**
 *
 * @author Diego
 */
public class ConsumptionView extends javax.swing.JFrame {
    private static User current_user;
    /**
     * Creates new form ConsumptionView
     */
    public ConsumptionView(User user) {
        this.current_user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        if (!isCoach()){
            UserPane userPane = new UserPane(current_user);
            mainPane.setVisible(false);
            mainPane.removeAll();
            mainPane.add(userPane);
            mainPane.setVisible(true);
            
        } else{
            CoachPane cp = new CoachPane(current_user);
            mainPane.setVisible(false);
            mainPane.removeAll();
            mainPane.add(cp);
            mainPane.setVisible(true);
            
        }
    }
    private boolean isCoach(){
        return current_user.getType().equalsIgnoreCase("Entrenador");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mainPane = new javax.swing.JPanel();
        createBTM = new javax.swing.JButton();
        backBTM = new javax.swing.JButton();

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

        jLabel1.setText("Consumos:");

        mainPane.setLayout(new java.awt.GridBagLayout());

        createBTM.setText("Crear Consumo");
        createBTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBTMActionPerformed(evt);
            }
        });

        backBTM.setText("Volver");
        backBTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBTM)
                        .addGap(18, 18, 18)
                        .addComponent(createBTM)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBTM)
                    .addComponent(backBTM))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTMActionPerformed
        HomeView home = new HomeView(current_user);
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_backBTMActionPerformed

    private void createBTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBTMActionPerformed
        ConsumptionCreate cCreate = new ConsumptionCreate(current_user);
        this.dispose();
        cCreate.setVisible(true);
    }//GEN-LAST:event_createBTMActionPerformed

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
            java.util.logging.Logger.getLogger(ConsumptionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumptionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumptionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumptionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumptionView(current_user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTM;
    private javax.swing.JButton createBTM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPane;
    // End of variables declaration//GEN-END:variables
}
