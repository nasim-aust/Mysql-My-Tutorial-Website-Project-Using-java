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
public class ContentCourse extends javax.swing.JFrame {

    
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static String s;
    /**
     * Creates new form content
     */
    public ContentCourse() {
        initComponents();
        connection = MyDatabaseHandler.setConnection();
        Update_table();
    }
    
    void Update_table(){
        
        try{
        String sql = "select * from content_course";
        pst = connection.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        TableContentCourse.setModel(DbUtils.resultSetToTableModel(rs));
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
        TableContentCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtCourseName = new javax.swing.JTextField();
        TxtContentName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CmdInsert = new javax.swing.JButton();
        CmdDelete = new javax.swing.JButton();
        CmdUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableContentCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        TableContentCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableContentCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableContentCourse);

        jLabel1.setText("Id");

        jLabel2.setText("Course Name");

        jLabel3.setText("Content Name");

        jLabel6.setText("Content Course Table");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtContentName, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(TxtCourseName)
                            .addComponent(TxtId))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmdUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CmdDelete)
                                .addComponent(CmdInsert)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtContentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CmdInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdUpdate)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableContentCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableContentCourseMouseClicked
        // TODO add your handling code here:
        
        try{
            int row = TableContentCourse.getSelectedRow();
            String table_click = (TableContentCourse.getModel().getValueAt(row,0).toString());
            
            String sql = "select * from content_course where content_course_id = "+table_click+" ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String add1 = rs.getString("content_course_id");
                TxtId.setText(add1);
                
                String add2 = rs.getString("course_name");
                TxtCourseName.setText(add2);
                
                String add3 = rs.getString("content_name");
                TxtContentName.setText(add3);
                
                
                
                //String add5 = rs.getString("s_id");
                //txt_s_id.setText(add5);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
        Update_table();
        
    }//GEN-LAST:event_TableContentCourseMouseClicked

    private void CmdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdInsertActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String query = "INSERT INTO content_course(content_course_id,course_name,content_name) VALUES(?,?,?)";
            
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtCourseName.getText());
            pStatement.setString(3, TxtContentName.getText());
            
           
            pStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
        
    }//GEN-LAST:event_CmdInsertActionPerformed

    private void CmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDeleteActionPerformed
        // TODO add your handling code here:
        String query = "DELETE FROM content_course where content_course_id =?";
        
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
            
            String query = "UPDATE content_course set content_course_id = ?, course_name = ?, content_name = ? where content_course_id = ? ";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtCourseName.getText());
            pStatement.setString(3, TxtContentName.getText());
            
            pStatement.setString(4, TxtId.getText());
            
            
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
            java.util.logging.Logger.getLogger(ContentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContentCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContentCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDelete;
    private javax.swing.JButton CmdInsert;
    private javax.swing.JButton CmdUpdate;
    private javax.swing.JTable TableContentCourse;
    private javax.swing.JTextField TxtContentName;
    private javax.swing.JTextField TxtCourseName;
    private javax.swing.JTextField TxtId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
