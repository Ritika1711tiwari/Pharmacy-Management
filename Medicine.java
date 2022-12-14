/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalportal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Ritika Tiwari
 */
public class Medicine extends javax.swing.JFrame {

    /**
     * Creates new form Medicine
     */
    public Medicine() {
        initComponents();
        selectMod();
        getCompany();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    java.util.Date MDate,EDate;
    java.sql.Date Mfd , Exp;
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        medexp = new com.toedter.calendar.JDateChooser();
        add = new javax.swing.JButton();
        e1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        medid = new javax.swing.JTextField();
        medqty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        medname = new javax.swing.JTextField();
        medmfd = new com.toedter.calendar.JDateChooser();
        medcomp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        medprice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("QUANTITY");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 222, 109, 38);

        medexp.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.add(medexp);
        medexp.setBounds(600, 160, 176, 36);

        add.setBackground(new java.awt.Color(204, 102, 255));
        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/crearte Account.png"))); // NOI18N
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(78, 300, 110, 40);

        e1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        e1.setForeground(new java.awt.Color(0, 0, 0));
        e1.setText("EXPDATE");
        jPanel2.add(e1);
        e1.setBounds(480, 160, 109, 38);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-window-30.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(760, 0, 30, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(12, 84, 109, 38);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("MFDDATE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(480, 90, 109, 38);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-rounded-left-30.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 0, 40, 40);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("COMPANY");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(480, 220, 109, 38);

        medid.setBackground(new java.awt.Color(255, 255, 255));
        medid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        medid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidActionPerformed(evt);
            }
        });
        jPanel2.add(medid);
        medid.setBounds(158, 89, 173, 28);

        medqty.setBackground(new java.awt.Color(255, 255, 255));
        medqty.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(medqty);
        medqty.setBounds(158, 227, 173, 28);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PRICE");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 178, 109, 38);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Medicine List");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(320, 410, 206, 38);

        update.setBackground(new java.awt.Color(204, 102, 255));
        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-data-transfer-30 (2).png"))); // NOI18N
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(550, 300, 150, 40);

        medname.setBackground(new java.awt.Color(255, 255, 255));
        medname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(medname);
        medname.setBounds(158, 133, 173, 28);

        medmfd.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.add(medmfd);
        medmfd.setBounds(600, 90, 176, 38);

        medcomp.setBackground(new java.awt.Color(255, 255, 255));
        medcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(medcomp);
        medcomp.setBounds(600, 230, 176, 24);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MEDNAME");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(12, 128, 109, 38);

        delete.setBackground(new java.awt.Color(204, 102, 255));
        delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-macos-close-30.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(300, 300, 150, 40);

        medprice.setBackground(new java.awt.Color(255, 255, 255));
        medprice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(medprice);
        medprice.setBounds(158, 183, 173, 28);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 51, 255));
        jLabel9.setText("Manage Medicine");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(290, 20, 206, 38);

        medicinetable.setBackground(new java.awt.Color(204, 153, 255));
        medicinetable.setForeground(new java.awt.Color(0, 0, 0));
        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MED_NAME", "MED_PRICE", "QUANTITY", "MFD_DATE", "EXP_DATE", "COMPANY"
            }
        ));
        medicinetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinetable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 440, 800, 220);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medicine.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(798, 657));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
     private void selectMod(){
        
       try{
           con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb","root","Ritika@1910");
           st = con.createStatement();
           rs = st.executeQuery("select * from medicinetb");
           medicinetable.setModel(DbUtils.resultSetToTableModel(rs));
       } 
       catch(SQLException e){
           JOptionPane.showMessageDialog(this, "Enter Details....");
           //e.printStackTrace();
       }
    }
     
     
     public void getCompany(){
         try{
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb","root","Ritika@1910");
              st = con.createStatement();
              rs = st.executeQuery("select * from companytb");
              while(rs.next()){
                  String mycomp = rs.getString("comp_name");
                  medcomp.addItem(mycomp);
              }
              
         } catch (SQLException ex) {
            Logger.getLogger(Medicine.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     
     
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:

        MDate = medmfd.getDate();
        Mfd = new java.sql.Date(MDate.getTime());
        EDate = medexp.getDate();
        Exp = new java.sql.Date(EDate.getTime());

        try{
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb","root","Ritika@1910");
            PreparedStatement pt = con.prepareStatement("insert into medicinetb values(?,?,?,?,?,?,?)");
            pt.setInt(1,Integer.valueOf(medid.getText()));
            pt.setString(2,medname.getText());
            pt.setInt(3,Integer.valueOf(medprice.getText()));
            pt.setInt(4,Integer.valueOf(medqty.getText()));
            pt.setDate(5,Mfd);
            pt.setDate(6, Exp);
            pt.setString(7,medcomp.getSelectedItem().toString());
            int row = pt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicine Successfully Added...");
            con.close();
            selectMod();

        }
        catch(SQLException e){

        }
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void medidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        if(medid.getText().isEmpty()||medname.getText().isEmpty()||medprice.getText().isEmpty()||medqty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information...");
        }else{
            try{
                 MDate = medmfd.getDate();
        Mfd = new java.sql.Date(MDate.getTime());
        EDate = medexp.getDate();
        Exp = new java.sql.Date(EDate.getTime());
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb","root","Ritika@1910");
                String updatequery = "Update medicinetb set med_name = '"+medname.getText()+"'"+",med_price = "+medprice.getText()+""+",med_qty = "+medqty.getText()+""+",med_mfd = '"+Mfd+"'"+",med_exp = '"+Exp+"'"+",med_comp = '"+medcomp.getSelectedItem().toString()+"'"+"where med_id = "+medid.getText();
                st = con.createStatement();
                st.executeUpdate(updatequery);
                JOptionPane.showMessageDialog(this, "Medicine Updated Successfully...");
                con.close();
            selectMod();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateMouseClicked

    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        if(medid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter The Medicine To be Deleted.....");

        }
        else{
            try {
//                MDate = medmfd.getDate();
//                Mfd = new java.sql.Date(MDate.getTime());
//                EDate = medexp.getDate();
//                Exp = new java.sql.Date(EDate.getTime());
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb","root","Ritika@1910");
                String id = medid.getText();
                String query = "Delete from medicinetb where med_id="+id;
                st = con.createStatement();
                st.executeUpdate(query);
                selectMod();
                JOptionPane.showMessageDialog(this, "Medicine Deleted Successfully...");
            } catch (SQLException e) {
                // Logger.getLogger(Medcine.class.getName()).log(Level.SEVERE, null, ex);
                // e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Enter Id....");
            }

        }

    }//GEN-LAST:event_deleteMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void medicinetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinetableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) medicinetable.getModel();
        int MyIndex = medicinetable.getSelectedRow();
        medid.setText(model.getValueAt(MyIndex, 0).toString());
        medname.setText(model.getValueAt(MyIndex, 1).toString());
        medprice.setText(model.getValueAt(MyIndex, 2).toString());
        medqty.setText(model.getValueAt(MyIndex, 3).toString());
//        medmfd.(model.getValueAt(MyIndex, 4).toString());
//        medexp.setText(model.getValueAt(MyIndex, 3).toString());
//        medcomp.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_medicinetableMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
         new Welcome().setVisible(true);
               this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medcomp;
    private com.toedter.calendar.JDateChooser medexp;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextField medid;
    private com.toedter.calendar.JDateChooser medmfd;
    private javax.swing.JTextField medname;
    private javax.swing.JTextField medprice;
    private javax.swing.JTextField medqty;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
