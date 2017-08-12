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
public class comment extends javax.swing.JFrame {

    
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static String s;
    /**
     * Creates new form comment
     */
    public comment() {
        initComponents();
        connection = MyDatabaseHandler.setConnection();
        Update_table();
    }
    
    void Update_table(){
        
        try{
        String sql = "select * from comment";
        pst = connection.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        TableComment.setModel(DbUtils.resultSetToTableModel(rs));
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
        TableComment = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CmdInsert = new javax.swing.JButton();
        CmdDelete = new javax.swing.JButton();
        CmdUpdate = new javax.swing.JButton();
        TxtId = new javax.swing.JTextField();
        TxtCommentData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableComment.setModel(new javax.swing.table.DefaultTableModel(
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
        TableComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCommentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableComment);

        jLabel1.setText("id");

        jLabel2.setText("Comment Data");

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

        jLabel3.setText("Comment Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CmdInsert)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCommentData, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(TxtId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CmdDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CmdUpdate)
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtCommentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmdInsert)
                            .addComponent(CmdDelete)
                            .addComponent(CmdUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCommentMouseClicked
        // TODO add your handling code here:
        
         try{
            int row = TableComment.getSelectedRow();
            String table_click = (TableComment.getModel().getValueAt(row,0).toString());
            
            String sql = "select * from comment where id = "+table_click+" ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String add1 = rs.getString("id");
                TxtId.setText(add1);
                
                String add2 = rs.getString("comment_data");
                TxtCommentData.setText(add2);
                
                
                
                //String add5 = rs.getString("s_id");
                //txt_s_id.setText(add5);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
        Update_table();
        
    }//GEN-LAST:event_TableCommentMouseClicked

    private void CmdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdInsertActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String query = "INSERT INTO comment(id,comment_data) VALUES(?,?)";
            
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtCommentData.getText());
            
           
            pStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        
    }//GEN-LAST:event_CmdInsertActionPerformed

    private void CmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDeleteActionPerformed
        // TODO add your handling code here:
        String query = "DELETE FROM comment where id =?";
        
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
            
            String query = "UPDATE comment set id = ?, comment_data = ? where id = ? ";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtCommentData.getText());
            
            pStatement.setString(3, TxtId.getText());
            
            
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
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDelete;
    private javax.swing.JButton CmdInsert;
    private javax.swing.JButton CmdUpdate;
    private javax.swing.JTable TableComment;
    private javax.swing.JTextField TxtCommentData;
    private javax.swing.JTextField TxtId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
