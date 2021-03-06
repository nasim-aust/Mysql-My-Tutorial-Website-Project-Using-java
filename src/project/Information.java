/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nasim
 */
public class Information extends javax.swing.JFrame {
    
    
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static String s;

    /**
     * Creates new form content
     */
    public Information() {
        initComponents();
        connection = MyDatabaseHandler.setConnection();
        Update_table();
    }
    
    void Update_table(){
        
        try{
        String sql = "select * from information";
        pst = connection.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        TableInformation.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableInformation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtFName = new javax.swing.JTextField();
        TxtLName = new javax.swing.JTextField();
        TxtBDate = new javax.swing.JTextField();
        TxtGender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CmdInsert = new javax.swing.JButton();
        CmdDelete = new javax.swing.JButton();
        CmdUpdate = new javax.swing.JButton();
        TxtCreationDate = new javax.swing.JTextField();
        TxtAccessId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableInformation.setModel(new javax.swing.table.DefaultTableModel(
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
        TableInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableInformation);

        jLabel1.setText("UserId");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("BirthDate");

        jLabel5.setText("Gender");

        jLabel6.setText("Information Table");

        CmdInsert.setText("insert");
        CmdInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdInsertActionPerformed(evt);
            }
        });

        CmdDelete.setText("delete");
        CmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDeleteActionPerformed(evt);
            }
        });

        CmdUpdate.setText("update");
        CmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Creation Date");

        jLabel8.setText("Access Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CmdInsert)
                                        .addGap(38, 38, 38)
                                        .addComponent(CmdDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CmdUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtAccessId, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 9, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtLName)
                                .addGap(14, 14, 14)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                .addComponent(TxtBDate, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(TxtCreationDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TxtCreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtAccessId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmdUpdate)
                            .addComponent(CmdDelete)
                            .addComponent(CmdInsert))))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableInformationMouseClicked
        // TODO add your handling code here:
        
        try{
            int row = TableInformation.getSelectedRow();
            String table_click = (TableInformation.getModel().getValueAt(row,0).toString());
            
            String sql = "select * from information where user_id = "+table_click+" ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String add1 = rs.getString("user_id");
                TxtId.setText(add1);
                
                String add2 = rs.getString("first_name");
                TxtFName.setText(add2);
                
                String add3 = rs.getString("last_name");
                TxtLName.setText(add3);
                
                String add4 = rs.getString("birth_date");
                TxtBDate.setText(add4);
                
                String add5 = rs.getString("gender");
                TxtGender.setText(add5);
                
                String add6 = rs.getString("creation_date");
                TxtCreationDate.setText(add6);
                
                String add7 = rs.getString("access_id");
                TxtAccessId.setText(add7);
                
                //String add5 = rs.getString("s_id");
                //txt_s_id.setText(add5);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
        Update_table();
    }//GEN-LAST:event_TableInformationMouseClicked

    private void CmdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdInsertActionPerformed
        // TODO add your handling code here:
        try{
            
            String query = "INSERT INTO information(user_id,first_name,last_name,birth_date,gender,creation_date,access_id) VALUES(?,?,?,?,?,?,?)";
            
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtFName.getText());
            pStatement.setString(3, TxtLName.getText());
            pStatement.setString(4, TxtBDate.getText());
            pStatement.setString(5, TxtGender.getText());
            pStatement.setString(6, TxtCreationDate.getText());
            pStatement.setString(7, TxtAccessId.getText());
           
            pStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        
        
    }//GEN-LAST:event_CmdInsertActionPerformed

    private void CmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDeleteActionPerformed
        // TODO add your handling code here:
        
        String query = "DELETE FROM information where user_id =?";
        
        try{
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            
            
            pStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully deleted");
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_CmdDeleteActionPerformed

    private void CmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdUpdateActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String query = "UPDATE information set user_id = ?, first_name = ?, last_name = ?,birth_date= ?,gender =?,creation_date=?,access_id=? where user_id = ? ";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtFName.getText());
            pStatement.setString(3, TxtLName.getText());
            pStatement.setString(4, TxtBDate.getText());
            pStatement.setString(5, TxtGender.getText());
            pStatement.setString(6, TxtCreationDate.getText());
            pStatement.setString(7, TxtAccessId.getText());
            pStatement.setString(8, TxtId.getText());
            
            
            System.out.println(query);
            pStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully updated");
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        
    }//GEN-LAST:event_CmdUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDelete;
    private javax.swing.JButton CmdInsert;
    private javax.swing.JButton CmdUpdate;
    private javax.swing.JTable TableInformation;
    private javax.swing.JTextField TxtAccessId;
    private javax.swing.JTextField TxtBDate;
    private javax.swing.JTextField TxtCreationDate;
    private javax.swing.JTextField TxtFName;
    private javax.swing.JTextField TxtGender;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
