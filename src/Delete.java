
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Delete extends javax.swing.JFrame {

    Connection connection;
    ResultSet rs;
    PreparedStatement pst;
    static String add3;
    static String a1;

    /**
     * Creates new form Login
     */
    public Delete() {
        initComponents();
        connection = ConnectMSSQL.connectDB();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel5.setBackground(new Color(0, 0, 0, 0));
        jLabel5.setBackground(new Color(0, 0, 0, 80));

        jTextField3.setBackground(new Color(0, 0, 0, 0));

        jTextField8.setBackground(new Color(0, 0, 0, 0));

        jTextField16.setBackground(new Color(0, 0, 0, 0));

        jTextField19.setBackground(new Color(0, 0, 0, 0));
        jTextField4.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Update Review");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 150, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\mag.png")); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Delete Review");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 150, -1));

        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Game ID");
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 40));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator7.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\delete-button.png")); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Game Title");
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 220, 40));

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        jTextField8.setText("Game ID");
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 120, 40));

        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(153, 153, 153));
        jTextField16.setText("Rating<=10");
        jTextField16.setBorder(null);
        jTextField16.setOpaque(false);
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
        });
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 120, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\mplus.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 500, 50, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\delete-button.png")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jTextField19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setText("Review");
        jTextField19.setBorder(null);
        jTextField19.setOpaque(false);
        jTextField19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField19FocusGained(evt);
            }
        });
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 950, 40));

        jSeparator19.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator19.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator19.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 120, 20));

        jSeparator20.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator20.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator20.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 120, 20));

        jSeparator23.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator23.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator23.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 960, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 3));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 220, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\icons8_circled_chevron_left_48px.png")); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 60, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*Every user review associated to each game needs to be deleted before deleteng the game itself.");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 550, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Game");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\home.png")); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\close.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\fullround.png")); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -20, 1210, 740));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\1_a5NKkiU55ENlSE2l8Al6YA.jpeg")); // NOI18N
        jLabel6.setText("jLabel4");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 420, 150));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\3.1\\Lab\\db\\IGDB\\images\\backleft.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -20, 1140, 740));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1348, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Login ob = new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        // TODO add your handling code here:
        //  jTextField8.setText("");
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusGained
        // TODO add your handling code here:
        //jTextField19.setText("");
    }//GEN-LAST:event_jTextField19FocusGained

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        String sql1 = "Delete from Company where GameId in (select GameId from Game where GameTitle=?)";
        try {
            pst = connection.prepareStatement(sql1);
            pst.setString(1, jTextField3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Company Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String sql2 = "Delete from Soldon_rel where GameId in (select GameId from Game where GameTitle=?)";
        try {
            pst = connection.prepareStatement(sql2);
            pst.setString(1, jTextField3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Marketplace Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String sql3 = "Delete from Supports_rel where GameId in (select GameId from Game where GameTitle=?)";
        try {
            pst = connection.prepareStatement(sql3);
            pst.setString(1, jTextField3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Platform Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String sql = "Delete from Game where GameTitle=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, jTextField3.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Game Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        String sql1 = "Delete from Review where GameId=? and UserId=?";
        try {
            pst = connection.prepareStatement(sql1);
            pst.setString(1, jTextField8.getText());
            pst.setString(2, add3);
            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String sql2 = "Insert into Review(UserId, GameId, Rating, ReviewPost) values (?,?,?,?) ";

        try {

            pst = connection.prepareStatement(sql2);
            pst.setString(1, add3);
            pst.setString(2, jTextField8.getText());
            pst.setString(3, jTextField16.getText());
            pst.setString(4, jTextField19.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Review Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        // TODO add your handling code here:
        //jTextField16.setText("");
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

        String sql = "select UserId from USERS where UserName=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, Login1.add1);
            rs = pst.executeQuery();
            if (rs.next()) {
                add3 = rs.getString("UserId");
                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "UserName not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }

        String sql1 = "Delete from Review where GameId=? and UserId=?";
        try {
            pst = connection.prepareStatement(sql1);
            pst.setString(1, jTextField4.getText());
            pst.setString(2, add3);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Review Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        String sql11 = "select UserId from USERS where UserName=?";
        try {
            pst = connection.prepareStatement(sql11);
            pst.setString(1, Login1.add1);
            rs = pst.executeQuery();
            if (rs.next()) {
                add3 = rs.getString("UserId");
                rs.close();
                pst.close();

            } else {
                JOptionPane.showMessageDialog(null, "UserName not found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }

        String a1 = jTextField8.getText();

        String sql = "select * from Review where GameId='" + a1 + "' and UserId=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, add3);
            rs = pst.executeQuery();
            if (rs.next()) {
                jTextField16.setText(rs.getString(3));
                jTextField19.setText(rs.getString(4));
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect GameID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Games().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
