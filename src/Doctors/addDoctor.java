package Doctors;

import Admins.doctorManagement;
import Main.Connector;
import Main.Hospital;
import Main.EmailValidator;
import Main.EmailSystem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author adija
 */
public class addDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;

    public addDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dBloodField = new javax.swing.JTextField();
        dGenderField = new javax.swing.JComboBox<>();
        dAgeField = new javax.swing.JTextField();
        dNameField = new javax.swing.JTextField();
        dDateField = new javax.swing.JTextField();
        dUserField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        clearPbtn = new javax.swing.JLabel();
        addDctorbtn = new javax.swing.JLabel();
        dRoomField = new javax.swing.JTextField();
        dAddressField = new javax.swing.JTextField();
        dStatusField = new javax.swing.JComboBox<>();
        dEmailField = new javax.swing.JTextField();
        dPhoneField = new javax.swing.JTextField();
        dDeptField = new javax.swing.JComboBox<>();
        dPassField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Doctor");
        setMinimumSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setText("Add Doctor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 152, 55));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-return-64.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shutdown-64.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel11.setText("Username");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 96, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Joining Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel6.setText("Blood group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 98, -1));

        dBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBloodFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dBloodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 149, 22));

        dGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        dGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 149, 25));

        dAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAgeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 149, 22));

        dNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 149, 22));

        dDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dDateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 149, 22));

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 149, 22));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel15.setText("Password");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 80, -1));

        Gender.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Gender.setText("Department");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Phone Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setText("Maritial Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 80, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel14.setText("Ward/Room no");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 140, -1));

        clearPbtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        clearPbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearPbtn.setText("Clear");
        clearPbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });
        getContentPane().add(clearPbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 170, 30));

        addDctorbtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addDctorbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addDctorbtn.setText("Add");
        addDctorbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });
        getContentPane().add(addDctorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 180, 30));

        dRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRoomFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dRoomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 149, 22));

        dAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAddressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 149, 22));

        dStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        dStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dStatusFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 152, 25));

        dEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 152, 22));

        dPhoneField.setText("+91");
        dPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPhoneFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 152, 22));

        dDeptField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Medicine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Haematology", "Microbiology" }));
        dDeptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dDeptFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dDeptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 152, 22));
        getContentPane().add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 149, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bluebg.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        doctorManagement dManagement = new doctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void dDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dDateFieldActionPerformed

    private void dNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameFieldActionPerformed

    private void dAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAgeFieldActionPerformed

    private void dPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dPhoneFieldActionPerformed

    private void dAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAddressFieldActionPerformed

    private void dRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRoomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dRoomFieldActionPerformed

    private void dGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderFieldActionPerformed

    }//GEN-LAST:event_dGenderFieldActionPerformed

    private void dStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dStatusFieldActionPerformed

    }//GEN-LAST:event_dStatusFieldActionPerformed

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
      
        connection = Connector.ConnectDb();
    
            String date = dDateField.getText();
            String name = dNameField.getText();
            String ageString = dAgeField.getText();
            String gender = (String) dGenderField.getSelectedItem();
            String blood = dBloodField.getText();
            String dept = (String) dDeptField.getSelectedItem();
            String phone = dPhoneField.getText();
            String email = dEmailField.getText();
            String status = (String) dStatusField.getSelectedItem();
            String address = dAddressField.getText();
            String roomString = dRoomField.getText();
            String user = dUserField.getText();
            String pass = String.valueOf(dPassField.getPassword());
           
            if(date.equals("") || name.equals("") || blood.equals("") 
                    || phone.equals("") || email.equals("") || address.equals("")
                    || user.equals("") || pass.equals("")|| ageString.equals("")||roomString.equals("")||gender.equals("")
                    ||dept.equals("")|| status.equals("")){
               
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
        
            String sql = "insert into doctor(date,name,age,gender,blood,dept,phone,email,status,address,room,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, name);
                prp.setInt(3, age);
                prp.setString(4, gender);
                prp.setString(5, blood);
                prp.setString(6, dept);
                prp.setString(7, phone);
                prp.setString(8, email);
                prp.setString(9, status);
                prp.setString(10, address);
                prp.setInt(11, room);
                prp.setString(12, user);
                prp.setString(13, pass);
                prp.execute();
                 JOptionPane.showMessageDialog(null, "Data Saved");
                String subject="Hospital Management System Registration successful";
                String mailBody1="Hello, " +name+ System.lineSeparator()+"You have been successfully registered as Doctor in Hospital Management System";
                EmailSystem.SendMail(email, subject, mailBody1);
              
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        dDateField.setText("");
        dNameField.setText("");
        dAgeField.setText("");
        dDeptField.setSelectedIndex(0);
        dPhoneField.setText("+91");
        dAddressField.setText("");
        dRoomField.setText("");
        dGenderField.setSelectedIndex(0);
        dStatusField.setSelectedIndex(0);
        dUserField.setText("");
        dPassField.setText("");
        dEmailField.setText("");
        dBloodField.setText("");
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void dBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBloodFieldActionPerformed

    private void dEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailFieldActionPerformed

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    private void dDeptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dDeptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dDeptFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JTextField dAddressField;
    private javax.swing.JTextField dAgeField;
    private javax.swing.JTextField dBloodField;
    private javax.swing.JTextField dDateField;
    private javax.swing.JComboBox<String> dDeptField;
    private javax.swing.JTextField dEmailField;
    private javax.swing.JComboBox<String> dGenderField;
    private javax.swing.JTextField dNameField;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dPhoneField;
    private javax.swing.JTextField dRoomField;
    private javax.swing.JComboBox<String> dStatusField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
