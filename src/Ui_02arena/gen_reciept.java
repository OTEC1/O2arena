/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui_02arena;

import DB_connection.Session;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class gen_reciept extends javax.swing.JInternalFrame {

    /**
     * Creates new form add_records
     */
    
   private  StringBuilder builder = new StringBuilder();
   
  
   private Object items,quatities,prices,sub_total;
   
   private static  String   cart="",id,eid,q,price_trimed,deliver;
   
   private  long l;
   
  //Pending  Update
   private  int p, del=2;


   
   
    public gen_reciept() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI b= (BasicInternalFrameUI)this.getUI();
        b.setNorthPane(null);
        setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        
    
        LocalDate dates = LocalDate.now();
        date.setText(dates.toString());
        
        
        if(new Session().getUser() != null)
                  Sign_in_user.setText(new Session().getUser().toString());
        
        

        
         
        
    }

    
    
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        Sub_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Sign_in_user = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        item_count = new javax.swing.JTextField();
        delivery = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pane = new javax.swing.JTextPane();
        drinks_list = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 700));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("   Receipt Preview");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 172, 48));

        jButton2.setText("Print");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 520, 99, -1));

        jButton3.setText("Queue ");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 100, -1));

        jButton4.setText("Reset");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 94, -1));

        quantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFocusLost(evt);
            }
        });
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 110, -1));

        Sub_total.setEditable(false);
        Sub_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sub_totalActionPerformed(evt);
            }
        });
        getContentPane().add(Sub_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Sub Total");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Sales Person:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 67, 141, -1));

        Sign_in_user.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sign_in_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(Sign_in_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 67, 230, 17));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("items");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 301, -1, -1));

        phone.setToolTipText("");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 160, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Item Count");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        item_count.setEditable(false);
        item_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_countActionPerformed(evt);
            }
        });
        getContentPane().add(item_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 160, -1));

        delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery Section", "Delivery within Egbe <br/> /liasu     #700", "Delivery within Agodo                        #500" }));
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });
        getContentPane().add(delivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 230, -1));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 20));

        pane.setEditable(false);
        jScrollPane2.setViewportView(pane);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 260, 470));

        drinks_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grills  list \t\t", "CatFish Barbeque     with  <br/>Potatoes & Salad       #3000", "CatFish Peppersoup  with <br/>Potatoes & Salad      #3000", "Croaker Fish   with Plantain <br/> & salad & Chips     #4000", "Peppered Snails    with<br/>    Fried Plantain               #2000", "Fried Pepper drum stick & <br/>Fried Plantain sauce #2000", "Grilled Chicken with Chips<br/> Potato & salad           #2000", "Chicken Pepper soup                                                        #1500", "Grilled Titus with Roasted Plantain                                 #2500", "Indomie with 2 fried Eggs                                                  #1000", "Indomie  with Turkey or Chicken                                      #1500", "Shawama   fully loaded                                                      #1000", "Spagetti and Chicken                                                         #2000", "Nkowbi                                                                                  #1000", "Gizzard                                                                                   #1000\t", "Asun                                                                                       #500", "Assorted Meat                                                                      #500 \t" }));
        drinks_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinks_listActionPerformed(evt);
            }
        });
        getContentPane().add(drinks_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 420, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Date:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void Sub_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sub_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sub_totalActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void item_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_countActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        clear();
         pane.setText("");
         pane.removeAll();
         builder.delete(0, builder.length()).trimToSize();
         Sub_total.setText("");
         item_count.setText("");
         
         if(cart.trim().length()>0)
             clear_all(cart);
         
         cart=""; 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
      if(new Session().getUser()==null && new Session().getAuth()==null)
               new Container().message("Pls Sign in");
      else{
        
        Object  d=drinks_list.getSelectedItem();
        List list = new ArrayList();
        
        
        if(d.equals("Drinks list") | quantity.getText().trim().length()<=0 && phone.getText().trim().length()<=0)
            new Container().message("Pls fill out items");
        else{  
            
           

          
                 q = quantity.getText();
                 p=d.toString().indexOf("#");
                 price_trimed = String.valueOf(d).substring(p+1);
                 l=Integer.parseInt(q)*Integer.parseInt(price_trimed.trim());
              
                
               
                         if(Sub_total.getText().length()<=0){
                                Sub_total.setText(String.valueOf(l));
                                item_count.setText("1");
                            }
                        else{
                            Sub_total.setText(String.valueOf(l+Long.valueOf(Sub_total.getText())));
                            item_count.setText(String.valueOf(1+Integer.valueOf(item_count.getText())));
                        }
                         
                
                
                if(d.toString().length()>0){
                    StringBuilder bu = new StringBuilder(String.valueOf(d));
                    bu=   bu.delete(p, d.toString().length());
                    builder.append(item_count.getText().concat(". ".concat(bu.toString())));
                     list.add(bu.toString());
                }
                
                if(q.length()>0){                  
                    builder.append("<br/>Quantity: ".concat(q).trim().concat("."));
                     list.add(q);
                }
                
                
                
                if(price_trimed.length()>0){
                    builder.append("  Price:   ".concat(price_trimed).concat("<br/> Sub Total: ".concat(String.valueOf(l)).concat("<br><br/>")));
                     list.add(price_trimed);
                     list.add(String.valueOf(l));
                }
                
             
            try {
                pane_add_up(builder);
            } catch (BadLocationException ex) {
                Logger.getLogger(gen_reciept.class.getName()).log(Level.SEVERE, null, ex);
            }
                eid =   send_to_db(list);
                quantity.setText("");
      
             
      }
      }
      
    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


          if(new Session().getUser()==null)
              new Container().message("Pls Sign in");
         else
             if(phone.getText().trim().length()<=0 )
            new Container().message("Pls enter client Phone no:");
          else{
         
              
         
                          
              try {
                  
                  
//                    if(del!=2){
//                        int pos=deliver.indexOf("#");
//                        String pos1 = String.valueOf(pos).substring(p+1);
//                         Sub_total.setText(String.valueOf(Integer.parseInt(Sub_total.getText())+Integer.parseInt(pos1.trim())));
//                         builder.append("<h5 style=\"  text-align:left; color:black;  margin-top:10px;   \">Order: ".concat(deliver).trim().concat("</h5>"));
//                   }
                           
                  builder.append("<h3 style=\"  text-align:left; color:black;  margin-top:10px;   \">Total: ".concat(Sub_total.getText()).trim().concat("</h3>"));
                   builder.append("<h5 style=\"  text-align:left; color:black;  margin-top:10px;   \">ID: ".concat(eid).trim().concat("</h5>"));
                  
          
                  
                  pane_add_up(builder);
                  update_db(Sign_in_user.getText());
                  
                    //EditorPanePrinter editorPanePrinter = new EditorPanePrinter(pane, new Paper(), new Insets(18,0,0,18));
                   //HashPrintRequestAttributeSet attr = new HashPrintRequestAttributeSet();
                  //attr.add(new MediaPrintableArea(0f, 0f, pane.getWidth()/72f, pane.getHeight()/72f, MediaPrintableArea.INCH));       
                  //PrinterJob job = PrinterJob.getPrinterJob();    
                 //job.setPrintService(ps);
                 //job.setPrintable(this);
                //job.setJobName(jobName);
                
                
                    StyledDocument doc2 = (StyledDocument) pane.getDocument();
                    Style style2 = doc2.addStyle("StyleName", null);
                    StyleConstants.setIcon(style2, new javax.swing.ImageIcon(getClass().getResource("/resources/template1.png")));
                    doc2.insertString(doc2.getLength(), "invisible text", style2);
                    
                  
                  boolean bool =pane.print();
                  
                  if(bool){
                      new Container().message("Printing Done");
                      update_user_phone(phone.getText(),cart);
                      clear();   cart="";
                      del=1;
                  }
                  else
                      new Container().message("Error Occured");
              } catch (PrinterException | BadLocationException ex) {
                  Logger.getLogger(gen_reciept.class.getName()).log(Level.SEVERE, null, ex);
              }
                    
  
                
        }
          
          
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed

//        String  string = quantity.getText();
//        int l= string.length();       
//        if(evt.getKeyChar() >= '0' && evt.getKeyChar()<='9')
//            quantity.setEditable(true);
//       else
//            quantity.setEditable(false);
        
    }//GEN-LAST:event_quantityKeyPressed

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
      
    }//GEN-LAST:event_quantityKeyReleased

    private void quantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusLost
      
    }//GEN-LAST:event_quantityFocusLost

    private void quantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFocusGained
         quantity.setEditable(true);
    }//GEN-LAST:event_quantityFocusGained

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed

         deliver = delivery.getSelectedItem().toString();
        if(!deliver.equals("Delivery Section"))
             del=1;
        else
            del=2;
                  
          
    }//GEN-LAST:event_deliveryActionPerformed

    private void drinks_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinks_listActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinks_listActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sign_in_user;
    private javax.swing.JTextField Sub_total;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> delivery;
    private javax.swing.JComboBox<String> drinks_list;
    private javax.swing.JTextField item_count;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane pane;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables

        private void clear() {
              quantity.setText("");     
              phone.setText("");
              Sub_total.setText("");
              item_count.setText("");
              pane.setText("");
              builder.delete(0, builder.length()).trimToSize();
    }
    

    
    
    
    
    
    
        private void pane_add_up(StringBuilder builder) throws BadLocationException {
            

            
               pane.setLayout(null);
                         
                  pane.setContentType("text/html");
                  pane.setText("<html>"
                        +"<div style=\"margin:0px;  padding:0px; \"   >"  
                        + "  <h3  style=\"  text-align:left; color:black;  margin-top:-20px;  \"  ><b>YOUR RECEIPT COPY</b> </h3>  "
                         +"  <h3 style=\"  text-align:left; color:black;  margin-top:-20px;   \"><b>Date: "+date.getText()+"</b></h3>"
                        + " <div>"

                                
                           
                        + "<div   style=\"background-color: white;  font-size: 10.5pt;  text-align:left; color:black;  margin:0px;  padding:0px;  \"  width=\"100%;\"   \"><b>"+builder.toString()+"</b></div>"
                        + "<br></br/>"
                         + "</html>");   
                  
                  
                             
     
              
//                        ImageIcon icon =  new ImageIcon (getClass().getResource("/resources/header.png"));
//                         JLabel label = new JLabel(icon);
//                         label.setBounds(0,0,50,50);
//                         pane.insertIcon (label.getIcon());
                  
                  
                  
 
            
                       
                         
                      
        }

        
        
        
        
        
        
    private void update_db(String text) {
        Connection con = new DB_connection.ConnectDb().getConnection();
       try {
           PreparedStatement ps= con.prepareStatement("select * from sales_day where days ='"+date.getText()+"'");
           ResultSet rs=ps.executeQuery();
           if(rs.next())
               pass_on(rs.getString("counts"));
           else
               insert_into(text);
       } catch (SQLException ex) {
           Logger.getLogger(gen_reciept.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    
    
    
    
    
        private void pass_on(String counts) {
              Connection con = new DB_connection.ConnectDb().getConnection();
              
              int z= Integer.parseInt(counts);
              int p=z+1;
       try {
           PreparedStatement ps= con.prepareStatement("update   sales_day set counts='"+p+"' where days ='"+date.getText()+"'");
           ps.execute();
       }
       catch(SQLException ex){System.out.println(ex);}
        
    }

        
        
        
    private void insert_into(String text) {
        
          Connection con = new DB_connection.ConnectDb().getConnection();
              
       try {
           
           
           PreparedStatement ps= con.prepareStatement("insert into   sales_day (days,counts,users) values (?,?,?)");
           ps.setString(1, date.getText());
           ps.setString(2, "1");
           ps.setString(3, text);
           ps.execute();
           
           
       }
       catch(SQLException ex){System.out.println(ex);}
    }

    
    
   
    private String  send_to_db(List list) {
        
        for(int x=0; x<list.size(); x++){
            
         
             if(x==0)
                items = list.get(0);
              if(x==1)
                quatities = list.get(1);
              if(x==2)
                   prices = list.get(2);
              if(x==3)
                sub_total = list.get(3);        
        }
        
        
                if(items.toString().trim().length()>0 && quatities.toString().trim().length()>0 && prices.toString().trim().length()>0 && sub_total.toString().trim().length()>0)
                     id= send_out(items,quatities,prices, sub_total);
        
            
                return  id;
       }
    
    
    
    private String send_out( Object items, Object quatities, Object prices,Object sub_total) {
       
        if(cart .trim().length()<=0){
            cart =String.valueOf(System.currentTimeMillis()).concat(String.valueOf(System.nanoTime()));
        }
        
        Connection con = new DB_connection.ConnectDb().getConnection();
       try {
           PreparedStatement ps = con.prepareStatement("insert into item_sold(carts,items,quatities,prices,sub_total,phone,users,dates)  values(?,?,?,?,?,?,?,?)");
           ps.setString(1, String.valueOf(cart));
           ps.setString(2, (String)items);
           ps.setString(3, (String)quatities);
           ps.setString(4, (String)prices);
           ps.setString(5, (String)sub_total);
           ps.setString(6, "0");
           ps.setString(7, Sign_in_user.getText());
           ps.setString(8,date.getText());
           ps.execute();
       } catch (SQLException ex) {
           System.out.println(ex);
       }
            
       
       return  cart;
       
    }

    
        private void clear_all(String cart) {
                
        Connection con = new DB_connection.ConnectDb().getConnection();
       try {
           PreparedStatement ps = con.prepareStatement("delete from  item_sold where carts like  '%"+cart+"%' ");
           ps.execute();
       }catch(SQLException ex)
       {
           System.out.println(ex);
       }
       }
    


     private void update_user_phone(String text, String cart) {
         
                Connection con = new DB_connection.ConnectDb().getConnection();
       try {
           PreparedStatement ps = con.prepareStatement("update   item_sold  set phone='"+text+"' where carts like  '%"+cart+"%' ");
           ps.execute();
       }catch(SQLException ex)
       {
           System.out.println(ex);
       }
        
    }
        
    
    
    
//          if(new Session().getUser()==null && new Session().getAuth()==null)
//             new Container().message("Pls Sign in");
//     else{
//        
//        Object  d=drinks_list.getSelectedItem();
//        
//        if(d.equals("Drinks list") | quantity.getText().trim().length()<=0)
//            new Container().message("Pls fill out items");
//        else{  
//            
//            String n = name.getText();
//            String q = quantity.getText();
//            String p = price.getText();
//            
//            long l=Integer.parseInt(q)*Integer.parseInt(p);
//            
//           List list =  new ArrayList<>();
//            
//             if(n.length()>0)
//                list.add("\n    Customer  Name:  \t\t  "+n);
//                builder.append("\n    Customer  Name:  \t\t  ".concat(n));
//            if(d.toString().length()>0)
//                list.add("\n Item: "+d+"");
//                builder.append("\n Item: ".concat((String)d));
//            
//            
//              if(q.length()>0)
//                list.add("\tQuantity: "+q+"");
//                 builder.append("\tQuantity: ".concat(q));
//       
//              
//                  
//             if(p.length()>0)
//                 list.add("\t Price:   "+p.trim()+"   \tSub total: "+l+"");
//                  builder.append("\t Price:   ".concat(p).concat("   \tSub total: ".concat(String.valueOf(l))));
//             
//            
//            
//           for(int i=0; i<list.size(); i++){
//                StyledDocument style = (StyledDocument) pane.getDocument();
//                Style style2=style.addStyle("StyleName", null);
//               StyleConstants.setIcon(style2, frameIcon);
//              pane.setText((String) list.get(i));
//                 
//            }
//            
//            if(sub_total.getText().length()<=0){
//                  sub_total.setText(String.valueOf(l));
//                   item_count.setText("1");
//            }
//            else{
//              sub_total.setText(String.valueOf(l+Long.valueOf(sub_total.getText())));
//              item_count.setText(String.valueOf(1+Integer.valueOf(item_count.getText())));
//            }
//            clear();
// 
//        }
//   }
// 
    
    
    
    
    //                    StyledDocument    style1 = (StyledDocument) pane.getDocument();
//                    Style     style2=style1.addStyle("StyleName", null);
//                      StyleConstants.setIcon(style2,new javax.swing.ImageIcon(getClass().getResource("/resources/template.png")));
//                      
//                      try {
//
//                       style1.insertString(style1.getLength(), "invisible text", style2);
//                      
//
//                      } catch (BadLocationException ex) {
//                   Logger.getLogger(gen_reciept.class.getName()).log(Level.SEVERE, null, ex);
//                     
//                }

   




    
}
