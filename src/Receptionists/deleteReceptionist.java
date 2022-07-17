package Receptionists;

import Admins.ReceptionistManagement;
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
public class deleteReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public deleteReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Receptionist_id", "Joining Date", "Name", "Age", "Gender", "Blood Group", "Email", "Phone Number", "Address", "Status", "Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        rDTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select receptionist_id,joining,name,age,gender,blood,email,phone,address,status,username,password from receptionist";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[12];
            while (rs.next()) {
                columnData[0] = rs.getInt("receptionist_id");
                columnData[1] = rs.getString("joining");
                columnData[2] = rs.getString("name");
                columnData[3] = rs.getInt("age");
                columnData[4] = rs.getString("gender");
                columnData[5] = rs.getString("blood");
                columnData[6] = rs.getString("email");
                columnData[7] = rs.getString("phone");
                columnData[8] = rs.getString("status");
                columnData[9] = rs.getString("username");
                columnData[10] = rs.getString("password");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rDeleteField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rDTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rDeletebtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Receptionist !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name of Receptionist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 152, -1, -1));

        rDeleteField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rDeleteField.setForeground(new java.awt.Color(0, 204, 204));
        rDeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDeleteFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rDeleteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 150, 216, -1));

        rDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rDTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 234, 884, 143));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-return-64.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 41, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shutdown-64.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 41, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Delete Receptionist");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 41, -1, -1));

        rDeletebtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        rDeletebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rDeletebtn.setText("Delete");
        rDeletebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        rDeletebtn.setOpaque(true);
        rDeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rDeletebtnMouseClicked(evt);
            }
        });
        getContentPane().add(rDeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 447, 201, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bluebg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        ReceptionistManagement rm = new ReceptionistManagement();
        rm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDeleteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDeleteFieldActionPerformed

    private void rDeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rDeletebtnMouseClicked
        connection = Connector.ConnectDb();
        String search = rDeleteField.getText();
        if(search.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter Receptionist Name");
            return ;
        }
        String searchsql="SELECT COUNT(*) as cnt FROM receptionist WHERE name ='" + search + "'";
        try {
            ps = connection.prepareStatement(searchsql);
            rs = ps.executeQuery();
           int cnt=0;
            while (rs.next()) {
                cnt = rs.getInt("cnt");
            }
            if(cnt==0){
                JOptionPane.showMessageDialog(null, "Receptionist name " + search + " not found");
            return ;
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            return ;
        }
        
        String sql = "Delete from receptionist where name ='" + search + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            ps = connection.prepareStatement(searchsql);
            ps.execute();
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            connection.close();
            JOptionPane.showMessageDialog(null, "Receptionist " + search + " has been deleted");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_rDeletebtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new deleteReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rDTable;
    private javax.swing.JTextField rDeleteField;
    private javax.swing.JLabel rDeletebtn;
    // End of variables declaration//GEN-END:variables

}
