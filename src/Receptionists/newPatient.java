package Receptionists;

import Main.Hospital;
import Main.Connector;
import Main.EmailSystem;
import Main.EmailValidator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author adija
 */
public class newPatient extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public newPatient() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pDateField = new javax.swing.JTextField();
        pNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pAddressField = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        pPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pDiseaseField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pRoomField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pGenderField = new javax.swing.JComboBox<>();
        pStatusField = new javax.swing.JComboBox<>();
        pEmailField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        clearPbtn = new javax.swing.JLabel();
        addDctorbtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Patient !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 130, 80, -1));

        pDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDateFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 149, -1));

        pNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 223, 143, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 221, 52, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 277, 52, -1));

        pAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAgeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 279, 149, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 333, 78, -1));

        pAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 132, 149, -1));

        Gender.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gender.setText("Address");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 130, 135, -1));

        pPhoneField.setText("+91");
        pPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPhoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 152, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 174, 135, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Maritial Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 221, 135, -1));

        pDiseaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDiseaseFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pDiseaseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 279, 149, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Disease Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 277, 142, -1));

        pRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pRoomFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pRoomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 335, 149, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ward/Room no");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 333, 142, -1));

        pGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        pGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGenderFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 334, 149, 25));

        pStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        pStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pStatusFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 222, 152, 25));

        pEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pEmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 390, 149, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Patient");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 37, 264, 47));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-return-64.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shutdown-64.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(992, 20, -1, -1));

        clearPbtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        clearPbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearPbtn.setText("Clear");
        clearPbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        clearPbtn.setOpaque(true);
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });
        jPanel1.add(clearPbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 453, 133, 35));

        addDctorbtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addDctorbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addDctorbtn.setText("Add");
        addDctorbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        addDctorbtn.setOpaque(true);
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });
        jPanel1.add(addDctorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 453, 129, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 388, 144, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bluebg.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 546));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        ReceptionistActivity rActivity = new ReceptionistActivity();
        rActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void pDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pDateFieldActionPerformed

    private void pNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameFieldActionPerformed

    private void pAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAgeFieldActionPerformed

    private void pAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAddressFieldActionPerformed

    private void pPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPhoneFieldActionPerformed

    private void pDiseaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDiseaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pDiseaseFieldActionPerformed

    private void pRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pRoomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pRoomFieldActionPerformed

    private void pGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGenderFieldActionPerformed

    }//GEN-LAST:event_pGenderFieldActionPerformed

    private void pStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pStatusFieldActionPerformed

    }//GEN-LAST:event_pStatusFieldActionPerformed

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
        connection = Connector.ConnectDb();
        if (connection != null) {
            String date = pDateField.getText();
            String name = pNameField.getText();
            String ageString = pAgeField.getText();
            String gender = (String) pGenderField.getSelectedItem();
            String address = pAddressField.getText();
            String phone = pPhoneField.getText();
            String status = (String) pStatusField.getSelectedItem();
            String disease = pDiseaseField.getText();
            String roomString = pRoomField.getText();
            String email = pEmailField.getText();
            
               if(date.equals("") || name.equals("") || 
                       phone.equals("") || email.equals("") || address.equals("")
                   || ageString.equals("")||roomString.equals("")||gender.equals("")
                    || status.equals("")||disease.equals("")){
               
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                return ;
            }
            int age=0,room=0;
           try{  age=Integer.parseInt(ageString);
                 room=Integer.parseInt(roomString);
           }
           catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter numerical value in room and age !");
                return ;
            }
           EmailValidator emailValidator = new EmailValidator();
         if(!emailValidator.validate(email.trim())) {
                 JOptionPane.showMessageDialog(null, "Please enter email id in correct format!");
                return ;
             }
        
            String sql = "insert into patient(date,name,age,gender,address,phone,status,disease,room,email) values (?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, name);
                prp.setInt(3, age);
                prp.setString(4, gender);
                prp.setString(5, address);
                prp.setString(6, phone);
                prp.setString(7, status);
                prp.setString(8, disease);
                prp.setInt(9, room);
                prp.setString(10, email);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
                 String subject="Hospital Management System Registration successful";
                String mailBody1="Hello, " +name+ System.lineSeparator()+"You have been successfully registered as Patient in Hospital Management System";
                EmailSystem.SendMail(email, subject, mailBody1);
                
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        pDateField.setText("");
        pNameField.setText("");
        pAgeField.setText("");
        pAddressField.setText("");
        pPhoneField.setText("");
        pDiseaseField.setText("");
        pRoomField.setText("");
        pEmailField.setText("");
        pGenderField.setSelectedIndex(0);
        pStatusField.setSelectedIndex(0);
        pEmailField.setText("");
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void pEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pEmailFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new newPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pAddressField;
    private javax.swing.JTextField pAgeField;
    private javax.swing.JTextField pDateField;
    private javax.swing.JTextField pDiseaseField;
    private javax.swing.JTextField pEmailField;
    private javax.swing.JComboBox<String> pGenderField;
    private javax.swing.JTextField pNameField;
    private javax.swing.JTextField pPhoneField;
    private javax.swing.JTextField pRoomField;
    private javax.swing.JComboBox<String> pStatusField;
    // End of variables declaration//GEN-END:variables
}
