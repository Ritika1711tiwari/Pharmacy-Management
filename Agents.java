/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalportal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ritika Tiwari
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        selectMod();
    }

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    //java.util.Date MDate,EDate;
    // java.sql.Date Mfd , Exp;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String generateOTP(int otpLength) {
Random random = new Random();
StringBuilder sb = new StringBuilder();
for (int i = 0; i < otpLength; i++) {
sb.append(random.nextInt(10));
}
String otp = sb.toString();
return otp;
}
   
    public void sendOTP(String message, String number, String apiKey) {
try {
// String apiKey =
// "Kl9jOVP5AFy6coZpM3UETvgeWXBGYD2iSt1mCxf47q0RJhQrb8yTAEIqae3jswOgUzo2MB7tR0LJmYSf";
String sendId = "TXTIND";
String language = "english";
String route = "v3";

message = URLEncoder.encode(message, "UTF-8"); // Important Step

String myUrl = "https://www.fast2sms.com/dev/bulkV2?authorization=" + apiKey + "&sender_id=" + sendId
+ "&message=" + message + "&language=" + language + "&route=" + route + "&numbers=" + number;

URL url = new URL(myUrl);
HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

con.setRequestMethod("GET");

con.setRequestProperty("User-Agent", "Mozilla/5.0");
con.setRequestProperty("cache-control", "no-cache");

int responseCode = con.getResponseCode();
System.out.println("Response Code : " + responseCode);
StringBuffer response = new StringBuffer();

BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

while (true) {
String line = br.readLine();

if (line == null) {
break;
}

response.append(line);
}

System.out.println(response);

} catch (Exception e) {
System.out.println(e);
}
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        aname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        aage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agentstable = new javax.swing.JTable();
        aphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPanel.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("OTP");
        JPanel.add(jLabel5);
        jLabel5.setBounds(370, 130, 109, 38);

        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        JPanel.add(add);
        add.setBounds(133, 304, 95, 34);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ID");
        JPanel.add(jLabel1);
        jLabel1.setBounds(12, 84, 109, 38);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("GENDER");
        JPanel.add(jLabel7);
        jLabel7.setBounds(360, 180, 109, 38);

        aid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        aid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aidActionPerformed(evt);
            }
        });
        JPanel.add(aid);
        aid.setBounds(158, 89, 173, 28);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-rounded-left-30.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        JPanel.add(jLabel11);
        jLabel11.setBounds(10, 0, 40, 40);

        pin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPanel.add(pin);
        pin.setBounds(480, 140, 173, 28);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("AGE");
        JPanel.add(jLabel4);
        jLabel4.setBounds(12, 178, 109, 38);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("AGENTS List");
        JPanel.add(jLabel2);
        jLabel2.setBounds(260, 350, 206, 38);

        update.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        JPanel.add(update);
        update.setBounds(430, 300, 120, 34);

        aname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPanel.add(aname);
        aname.setBounds(158, 133, 173, 28);

        gender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select Gender-----", "Male", "Female" }));
        JPanel.add(gender);
        gender.setBounds(480, 190, 176, 28);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("NAME");
        JPanel.add(jLabel3);
        jLabel3.setBounds(12, 128, 109, 38);

        delete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        JPanel.add(delete);
        delete.setBounds(263, 304, 120, 34);

        aage.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPanel.add(aage);
        aage.setBounds(158, 183, 173, 28);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Manage AGENTS");
        JPanel.add(jLabel9);
        jLabel9.setBounds(260, 20, 206, 38);

        agentstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "PHONE", "PASS", "GENDER"
            }
        ));
        agentstable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        agentstable.setRowHeight(25);
        agentstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(agentstable);

        JPanel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 400, 670, 220);

        aphone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPanel.add(aphone);
        aphone.setBounds(480, 90, 173, 28);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("PHONE");
        JPanel.add(jLabel6);
        jLabel6.setBounds(370, 80, 109, 38);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("SEND OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JPanel.add(jButton1);
        jButton1.setBounds(490, 240, 130, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");
        JPanel.add(jLabel8);
        jLabel8.setBounds(0, 0, 670, 1390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(672, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectMod() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb", "root", "Ritika@1910");
            st = con.createStatement();
            rs = st.executeQuery("select * from agentstb");
            agentstable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Enter Details....");
            //e.printStackTrace();
        }
    }


    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
        int age=Integer.parseInt(aage.getText());
        String name=aname.getText();
        int id=Integer.parseInt(aid.getText());
        String phone=aphone.getText();
        String pinn=pin.getText();
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Enter all details");
        }
        

    }//GEN-LAST:event_addActionPerformed

    private void aidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aidActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed
String otpmessage=generateOTP(4);
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
//        MDate = medmfd.getDate();
//        Mfd = new java.sql.Date(MDate.getTime());
//        EDate = medexp.getDate();
//        Exp = new java.sql.Date(EDate.getTime());
for(int i=0;i<aphone.getText().length();i++){
    if(aphone.getText().charAt(i)>=48 && aphone.getText().charAt(i)<=57){
        
    }
}
if(aid.getText().isEmpty()||aname.getText().isEmpty() || pin.getText().isEmpty() || aage.getText().isEmpty() ||aphone.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Kindly fill all details");
}
else{
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb", "root", "Ritika@1910");
            PreparedStatement pt = con.prepareStatement("insert into agentstb values(?,?,?,?,?,?)");
            pt.setInt(1, Integer.valueOf(aid.getText()));
            pt.setString(2, aname.getText());
            pt.setInt(3, Integer.valueOf(aage.getText()));
            pt.setString(4, aphone.getText());
            // pt.setDate(5,Mfd);
            // pt.setDate(6, Exp);
            pt.setString(5, pin.getText());
            pt.setString(6, gender.getSelectedItem().toString());
            int row = pt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Member Successfully Added...");
            con.close();
            selectMod();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        if (aid.getText().isEmpty() || aname.getText().isEmpty() || aage.getText().isEmpty() || aphone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information...");
        } else {
            try {
//                 MDate = medmfd.getDate();
//        Mfd = new java.sql.Date(MDate.getTime());
//        EDate = medexp.getDate();
//        Exp = new java.sql.Date(EDate.getTime());
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb", "root", "Ritika@1910");
                String updatequery = "update agentstb set a_name = '" + aname.getText() + "'" + ",a_age = " + aage.getText() + "" + ",a_phone = " + aphone.getText() + "" + ",a_gender = " + gender.getSelectedItem().toString() + "" + "where a_id = " + aid.getText();
                st = con.createStatement();
                st.executeUpdate(updatequery);
                JOptionPane.showMessageDialog(this, "Medicine Updated Successfully...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void agentstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentstableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) agentstable.getModel();
        int MyIndex = agentstable.getSelectedRow();
        aid.setText(model.getValueAt(MyIndex, 0).toString());
        aname.setText(model.getValueAt(MyIndex, 1).toString());
        aage.setText(model.getValueAt(MyIndex, 2).toString());
        aphone.setText(model.getValueAt(MyIndex, 3).toString());
        aname.setText(model.getValueAt(MyIndex, 4).toString());

    }//GEN-LAST:event_agentstableMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        if (aid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Agent Id To be Deleted.....");

        } else {
            try {
//                MDate = medmfd.getDate();
//                Mfd = new java.sql.Date(MDate.getTime());
//                EDate = medexp.getDate();
//                Exp = new java.sql.Date(EDate.getTime());
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicaldb", "root", "Ritika@1910");
                String id = aid.getText();
                String query = "Delete from agentstb where a_id=" + id;
                st = con.createStatement();
                st.executeUpdate(query);
                selectMod();
                JOptionPane.showMessageDialog(this, "Agent Deleted Successfully...");
            } catch (SQLException e) {
                // Logger.getLogger(Medcine.class.getName()).log(Level.SEVERE, null, ex);
                // e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Enter Id....");
            }

        }
    }//GEN-LAST:event_deleteMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(aphone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Mobile Number");
        }
        else{
            

            System.out.println(otpmessage);
            String apiKey = "4TaN1yODQp9PHrLcu3EsClemjWIRbdw0oM7U8AXB2KSZfnxGhgMvP94SbxpgjauAGHTolRcQtE5NiUL2";
            String number = aphone.getText();
            sendOTP("Hey this message is send by Medicine project developed by M.G.R..........Your OTP is : " + otpmessage, number,
                apiKey);
            System.out.println("Done");

            JOptionPane.showMessageDialog(this, "Send OTP Mobile Number");
        }
      

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField aage;
    private javax.swing.JButton add;
    private javax.swing.JTable agentstable;
    private javax.swing.JTextField aid;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField aphone;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pin;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
