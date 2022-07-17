package Receptionists;

import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adija
 */
public class chooseDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public chooseDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        Object columns[] = {"Doctor_id", "Joining Date", "Name", "Age", "Gender", "Blood Group", "Department", "Phone Number", "Email Address", "Status", "Address", "Room number", "Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        apTable.setModel(defaultTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        apTable = new javax.swing.JTable();
        dSearchbox = new javax.swing.JComboBox<>();
        doctorhind = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dASearchbtn = new javax.swing.JLabel();
        dASearchbtn1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose Docotor !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Department");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 128, -1));

        apTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(apTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 866, 161));

        dSearchbox.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        dSearchbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Medicine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Haematology", "Microbiology" }));
        getContentPane().add(dSearchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 175, 200, 30));

        doctorhind.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        doctorhind.setText("Select a Doctor and Press Next");
        getContentPane().add(doctorhind, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 268, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel12.setText("Set Appointment");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 271, 59));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-return-64.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 36, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shutdown-64.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 36, -1, -1));

        dASearchbtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        dASearchbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dASearchbtn.setText("Search");
        dASearchbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        dASearchbtn.setOpaque(true);
        dASearchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dASearchbtnMouseClicked(evt);
            }
        });
        getContentPane().add(dASearchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 175, 97, 30));

        dASearchbtn1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        dASearchbtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dASearchbtn1.setText("Next");
        dASearchbtn1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        dASearchbtn1.setOpaque(true);
        dASearchbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dASearchbtn1MouseClicked(evt);
            }
        });
        getContentPane().add(dASearchbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 215, 38));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bluebg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dASearchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dASearchbtnMouseClicked
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = (String) dSearchbox.getSelectedItem();
         if(searchKey.equals("Select Department")){
            JOptionPane.showMessageDialog(null, "Please select Department");
            return;
        }
        String sql = "select doctor_id,date,name,age,gender,blood,dept,phone,email,status,address,room,username from doctor where dept = '" + searchKey + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[13];
            while (rs.next()) {
                columnData[0] = rs.getInt("doctor_id");
                columnData[1] = rs.getString("date");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getInt("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("blood");
                columnData[6] = rs.getString("dept");
                columnData[7] = rs.getString("phone");
                columnData[8] = rs.getString("email");
                columnData[9] = rs.getString("status");
                columnData[10] = rs.getString("address");
                columnData[11] = rs.getInt("room");
                columnData[12] = rs.getString("username");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_dASearchbtnMouseClicked

    private void dASearchbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dASearchbtn1MouseClicked
        int row = apTable.getSelectedRow();
         if(row==-1){
            JOptionPane.showMessageDialog(null, "Please select a Doctor first");
            return;
        }
        int docID = Integer.parseInt(apTable.getValueAt(row, 0).toString());
         String doc_name = (apTable.getValueAt(row, 2).toString());
        String demail = (apTable.getValueAt(row, 8).toString());
        int room = Integer.parseInt(apTable.getValueAt(row,11).toString());
        choosePatient cPatient = new choosePatient();
        cPatient.doctorID = docID;
        cPatient.doctorRoom = room;
        cPatient.doctorEmail = demail;
        cPatient.doctor_name=doc_name;
        cPatient.setVisible(true);
        dispose();

    }//GEN-LAST:event_dASearchbtn1MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        ReceptionistActivity rActivity = new ReceptionistActivity();
        rActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new chooseDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable apTable;
    private javax.swing.JLabel dASearchbtn;
    private javax.swing.JLabel dASearchbtn1;
    private javax.swing.JComboBox<String> dSearchbox;
    private javax.swing.JLabel doctorhind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
