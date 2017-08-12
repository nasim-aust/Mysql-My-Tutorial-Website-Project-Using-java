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
public class Course extends javax.swing.JFrame {

    
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public static String s;
    /**
     * Creates new form content
     */
    public Course() {
        initComponents();
        connection = MyDatabaseHandler.setConnection();
        Update_table();
    }
    
    void Update_table(){
        
        try{
        String sql = "select * from course";
        pst = connection.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        TableCourse.setModel(DbUtils.resultSetToTableModel(rs));
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
        TableCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtName = new javax.swing.JTextField();
        TxtDept = new javax.swing.JTextField();
        TxtHour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CmdInsert = new javax.swing.JButton();
        CmdDelete = new javax.swing.JButton();
        CmdUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCourse);

        jLabel1.setText("Course Id");

        jLabel2.setText("Name");

        jLabel3.setText("Department");

        jLabel4.setText("Hour");

        jLabel6.setText("Course Table");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CmdUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(62, 62, 62)
                                .addComponent(TxtHour, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtDept, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(TxtName)
                                    .addComponent(TxtId, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CmdDelete)
                                    .addComponent(CmdInsert))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void TableCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCourseMouseClicked
        // TODO add your handling code here:
        
        try{
            int row = TableCourse.getSelectedRow();
            String table_click = (TableCourse.getModel().getValueAt(row,0).toString());
            
            String sql = "select * from course where course_id = "+table_click+" ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String add1 = rs.getString("course_id");
                TxtId.setText(add1);
                
                String add2 = rs.getString("course_name");
                TxtName.setText(add2);
                
                String add3 = rs.getString("course_dept");
                TxtDept.setText(add3);
                
                String add4 = rs.getString("course_hour");
                TxtHour.setText(add4);
                
                
                
                //String add5 = rs.getString("s_id");
                //txt_s_id.setText(add5);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
        Update_table();
        
    }//GEN-LAST:event_TableCourseMouseClicked

    private void CmdInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdInsertActionPerformed
        // TODO add your handling code here:
        
        
        try{
            
            String query = "INSERT INTO course(course_id,course_name,course_dept,course_hour) VALUES(?,?,?,?)";
            
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtName.getText());
            pStatement.setString(3, TxtDept.getText());
            pStatement.setString(4, TxtHour.getText());
            
           
            pStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_CmdInsertActionPerformed

    private void CmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDeleteActionPerformed
        // TODO add your handling code here:
        String query = "DELETE FROM course where course_id =?";
        
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
            
            String query = "UPDATE course set course_id = ?, course_name = ?, course_dept = ?,course_hour= ? where course_id = ? ";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, TxtId.getText());
            pStatement.setString(2, TxtName.getText());
            pStatement.setString(3, TxtDept.getText());
            pStatement.setString(4, TxtHour.getText());
            
            pStatement.setString(5, TxtId.getText());
            
            
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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDelete;
    private javax.swing.JButton CmdInsert;
    private javax.swing.JButton CmdUpdate;
    private javax.swing.JTable TableCourse;
    private javax.swing.JTextField TxtDept;
    private javax.swing.JTextField TxtHour;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
