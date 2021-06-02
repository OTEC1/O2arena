 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui_02arena;

import auth_package.Sign_in;
import DB_connection.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Container extends javax.swing.JFrame {

    /**
     * Creates new form Container
     */
    
    
   private  boolean check;

      
    private int counts;
    
    
    public Container() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
       pane.add(new gen_reciept()).show();
        if(new Session().getUser()!=null){
             LocalDate dates = LocalDate.now();
              report(dates);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/store.png"))); // NOI18N
        jLabel5.setText("        Print Reciept");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addContainerGap(610, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 119, 200, 680));

        pane.setPreferredSize(new java.awt.Dimension(800, 700));

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 1100, 580));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(900, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 120));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setText("O2 arena Recording Software");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user1.png"))); // NOI18N
        jLabel6.setToolTipText("Create Account");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("X");
        jLabel1.setToolTipText("Click to Exit");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       new Sign_in().show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        if(new Session().getUser()!=null   && new Session().getAuth() !=null){
            pane.removeAll();
            pane.add(new gen_reciept()).show();
        }else
        direct();
    }//GEN-LAST:event_jLabel5MouseClicked

    int k;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        k= 2;
        if(k == 2){
            
              LocalDate dates = LocalDate.now();
              
                 if(new Session().getUser()!=null){
                    int x= Integer.parseInt(return_update(dates));
                    report_update(dates,x);
                 }
                 
               System.exit(0);
              
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Container.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Container().setVisible(true);
            }
        });
    }
    
    
    
    public void message(String x){
        JOptionPane.showMessageDialog(null, x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane pane;
    // End of variables declaration//GEN-END:variables

    private void direct() {
         message("Pls sign in");
            
    }
    
    
    
//        private boolean ok(String toString) {
//            
//           Connection con = new DB_connection.ConnectDb().getConnection();
//            try {
//           PreparedStatement ps = con.prepareStatement("select max(id) as ma from start_up ");
//           ResultSet rs= ps.executeQuery();
//           
//          if(rs.next()){
//              System.out.println(rs.getString("ma"));
//              
//              if(rs.getString("ma").equals(toString)) 
//                  decision=true;
//             else
//                  decision = false;
//              
//          }
//          
//       
//              
//            }
//            catch(SQLException ex)
//            {
//                System.out.println(ex);
//            
//            }
//            
//            return  decision;
//        }


        

    
        private boolean another(String date) {
      
           Connection con = new DB_connection.ConnectDb().getConnection();
            try {
           PreparedStatement ps = con.prepareStatement("select * from start_up where times='"+date+"'");
           ResultSet rs= ps.executeQuery();
           
          if(rs.next()){
              check = true;
              counts  = Integer.parseInt(rs.getString("counts"));
          }
          else
              check = false;
              
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            
            }
            return  check;
    }
        
        
        
        
    private void report(LocalDate dates) {
        if(!another(dates.toString())){
        Connection con = new DB_connection.ConnectDb().getConnection();
            try {
           PreparedStatement ps = con.prepareStatement("insert into start_up(times,counts,users)  values(?,?,?)");
           ps.setString(1, dates.toString());
           ps.setString(2, "1");
           ps.setString(3, (String) new Session().getUser());
           ps.execute();
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            
            }
        }
        else{
             Connection con = new DB_connection.ConnectDb().getConnection();
            try {
                counts=counts+1;
                PreparedStatement ps = con.prepareStatement("update   start_up  set counts='"+counts+"'  where times='"+dates+"'");
           ps.execute();
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
    }
    
    
    
    
    
    private String return_update(LocalDate dates) {
      String ass=null;
      Connection con = new DB_connection.ConnectDb().getConnection();
            try {
           PreparedStatement ps = con.prepareStatement("select  counts from  start_up  where times ='"+dates.toString()+"'");
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                    ass = rs.getString("counts");
                    
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            
            }  return ass;
       
       }

    
    
    
    private void report_update(LocalDate dates, int x) {
        int p=x+1;
          Connection con = new DB_connection.ConnectDb().getConnection();
            try {
                
                PreparedStatement ps = con.prepareStatement("update  start_up set counts='"+String.valueOf(p)+"'  where times ='"+dates.toString()+"'");
                ps.execute();
                
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            
            }  }


    
    
    
}
