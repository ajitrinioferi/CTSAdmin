/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afa.login_gui;

import javax.swing.JOptionPane;

/**
 *
 * @author ajitrinioferi
 */
public class LogInAdm extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public LogInAdm() {
        initComponents();
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
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        idkshit = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        Label_title = new javax.swing.JLabel();
        ico_title = new javax.swing.JLabel();
        ico_Exit = new javax.swing.JLabel();
        Label_password = new javax.swing.JLabel();
        PasswordField_password = new javax.swing.JPasswordField();
        Label_username = new javax.swing.JLabel();
        TextField_username = new javax.swing.JTextField();
        btn_LogIn = new javax.swing.JButton();
        ico_password = new javax.swing.JLabel();
        ico_username = new javax.swing.JLabel();
        Label_Copyright = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(433, 264));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 102, 0));

        idkshit.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout idkshitLayout = new javax.swing.GroupLayout(idkshit);
        idkshit.setLayout(idkshitLayout);
        idkshitLayout.setHorizontalGroup(
            idkshitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        idkshitLayout.setVerticalGroup(
            idkshitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepanelLayout.createSequentialGroup()
                .addComponent(idkshit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(idkshit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 240));

        toppanel.setBackground(new java.awt.Color(0, 255, 51));
        toppanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        toppanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_title.setBackground(new java.awt.Color(204, 204, 204));
        Label_title.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Label_title.setForeground(new java.awt.Color(255, 255, 255));
        Label_title.setText("CTS Administrator");
        toppanel.add(Label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        ico_title.setForeground(new java.awt.Color(255, 255, 255));
        ico_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_enter_104px_2.png"))); // NOI18N
        toppanel.add(ico_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -36, 120, 140));

        ico_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_delete_30px_1.png"))); // NOI18N
        ico_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_ExitMouseClicked(evt);
            }
        });
        toppanel.add(ico_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        bg.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 470, 70));

        Label_password.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_password.setForeground(new java.awt.Color(255, 255, 255));
        Label_password.setText("password");
        bg.add(Label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        PasswordField_password.setBackground(new java.awt.Color(0, 0, 0));
        PasswordField_password.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        PasswordField_password.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PasswordField_password.setOpaque(false);
        bg.add(PasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 230, 30));

        Label_username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_username.setForeground(new java.awt.Color(255, 255, 255));
        Label_username.setText("username");
        bg.add(Label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        TextField_username.setBackground(new java.awt.Color(0, 0, 0));
        TextField_username.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TextField_username.setForeground(new java.awt.Color(255, 255, 255));
        TextField_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_username.setOpaque(false);
        bg.add(TextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 230, 30));

        btn_LogIn.setBackground(new java.awt.Color(153, 255, 255));
        btn_LogIn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btn_LogIn.setForeground(new java.awt.Color(255, 255, 255));
        btn_LogIn.setText("Log In");
        btn_LogIn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        btn_LogIn.setContentAreaFilled(false);
        btn_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogInActionPerformed(evt);
            }
        });
        bg.add(btn_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 110, 100));

        ico_password.setForeground(new java.awt.Color(255, 255, 255));
        ico_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_key_30px.png"))); // NOI18N
        bg.add(ico_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 40, 40));

        ico_username.setForeground(new java.awt.Color(255, 255, 255));
        ico_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_male_user_30px_1.png"))); // NOI18N
        bg.add(ico_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 40));

        Label_Copyright.setBackground(new java.awt.Color(204, 204, 204));
        Label_Copyright.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Label_Copyright.setForeground(new java.awt.Color(102, 102, 102));
        Label_Copyright.setText("Developed by AFA Inc.");
        bg.add(Label_Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogInActionPerformed
        // TODO add your handling code here:
        TextField_username.getText();
        if ((TextField_username.getText().equals("superadmin")) && (PasswordField_password.getText().equals("porsche"))) {
            JOptionPane.showMessageDialog(null, "Log In Succesfully");
            this.dispose();
            StartMenu x = new StartMenu();
            x.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Log In Succesfully");
            this.dispose();
        }
    }//GEN-LAST:event_btn_LogInActionPerformed

    private void ico_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ico_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(LogInAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInAdm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Copyright;
    private javax.swing.JLabel Label_password;
    private javax.swing.JLabel Label_title;
    private javax.swing.JLabel Label_username;
    private javax.swing.JPasswordField PasswordField_password;
    private javax.swing.JTextField TextField_username;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JLabel ico_Exit;
    private javax.swing.JLabel ico_password;
    private javax.swing.JLabel ico_title;
    private javax.swing.JLabel ico_username;
    private javax.swing.JPanel idkshit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
