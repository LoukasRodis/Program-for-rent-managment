/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class SearchScreen extends javax.swing.JFrame {

    /**
     * Creates new form SearchScreen
     */
    public SearchScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Connection conn1,conn2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Plhrofories = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        calculation = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_addApparment = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Plhrofories.setColumns(20);
        Plhrofories.setRows(5);
        Plhrofories.setEnabled(false);
        jScrollPane1.setViewportView(Plhrofories);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Πληροφορίες");

        jLabel2.setText("Κωδικός Πολ.");

        jButton1.setText("Αναζήτηση");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table);

        calculation.setText("Υπολογισμός Εξόδων");
        calculation.setEnabled(false);
        calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculationActionPerformed(evt);
            }
        });

        Menu_addApparment.setText("Επιλογές");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Αρχική");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu_addApparment.add(jMenuItem2);

        jMenuBar1.add(Menu_addApparment);

        jMenu1.setText("Προσθήκη");

        jMenuItem1.setText("Πολυκατοικίας");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Αναζήτηση");

        jMenuItem3.setText("Πολυκατοικιας");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Διαχειριστή");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(kod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calculation))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SN = kod.getText();

        String QR1 = "SELECT * FROM Apparments WHERE Appartment_Code like '" + SN + "'";
        String QR2 = "SELECT * FROM AppSpecifications WHERE Serial_NUM like '" + SN + "'";
        String QR3 = "SELECT Appartment_Number,IOnoma,IEpitheto,EOnoma,EEpitheto,Orofos,Tetragwnika,elevator,isogeio FROM AppSpecifications WHERE Serial_NUM like '" + SN + "'";

        PreparedStatement p, p1, p2;

        try {
            String url = "jdbc:sqlite:C:/Users/public.user/Desktop/loukas ergasia/Προγραμμα Διαχειρησης Κοινοχρηστων/Database1.db";
            conn1 = (Connection) DriverManager.getConnection(url);
            p = conn1.prepareStatement(QR1);
            p1 = conn1.prepareStatement(QR2);
            p2 = conn1.prepareStatement(QR3);

            ResultSet res1 = p.executeQuery();
            ResultSet res2 = p1.executeQuery();
            ResultSet res3 = p2.executeQuery();

            if (res1.next() == res2.next()) {
                String A_Fname = res1.getString("Admin_FName");
                String A_Lname = res1.getString("Admin_LName");
                String Address = res1.getString("Address");
                String tetragwnika = res1.getString("Sum_square_meters");
                String app_num = res1.getString("Number_of_Apprtments");
                String poli = res1.getString("Poli");
                String TK = res1.getString("TK");

                table.setModel(DbUtils.resultSetToTableModel(res3));

                String sinolikoTxt = "Όνομα Διαχειριστή: " + A_Fname + "\nΕπίθετο Διαχειριστή: " + A_Lname + "\nΔιέθυνση: " + Address +"\nΠόλη και ταχυδρομικός κωδ. "+poli+" "+TK+"\nΣυνολικά τετραγωνικά πολυκατικοίας: " + tetragwnika + "\nΔιαμερίσματα: " + app_num;

                Plhrofories.setText(sinolikoTxt);
                conn1.close();
                calculation.setEnabled(true);
            }
            //p.setString(1, kod.getText());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ΔΕΝ υπάρχει πολυκατοικία με τον αριθμό " + SN + "!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculationActionPerformed
        String AN = kod.getText();
        String QR1 = "SELECT * FROM Apparments WHERE Appartment_Code like '" + AN + "'";
        String QR2 = "SELECT * FROM AppSpecifications WHERE Serial_NUM like '" + AN + "'";

        PreparedStatement p, p1;

        try {
            String url = "jdbc:sqlite:C:/Users/public.user/Desktop/loukas ergasia/Προγραμμα Διαχειρησης Κοινοχρηστων/Database1.db";
            conn2 = (Connection) DriverManager.getConnection(url);
            p = conn2.prepareStatement(QR1);
            p1 = conn2.prepareStatement(QR2);

            ResultSet res1 = p.executeQuery();
            ResultSet res2 = p1.executeQuery();

            if (res1.next() == res2.next()) {
                new CalculationScreen(AN).setVisible(true);
                SearchScreen.this.setVisible(false);
                conn2.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ΔΕΝ υπάρχει πολυκατοικία με τον αριθμό " + AN + "!");
        }


    }//GEN-LAST:event_calculationActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MainScreen frame2 = new MainScreen();
        frame2.setVisible(true);
        SearchScreen.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Add_Apparment frame2 = new Add_Apparment();
        frame2.setVisible(true);
        SearchScreen.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        SearchScreen frame3 = new SearchScreen();
        frame3.setVisible(true);
        SearchScreen.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Search_for_Admin frame4 = new Search_for_Admin();
        frame4.setVisible(true);
        SearchScreen.this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_addApparment;
    private javax.swing.JTextArea Plhrofories;
    private javax.swing.JButton calculation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kod;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
