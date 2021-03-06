/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afa.login_gui;

/**
 *
 * @author ajitrinioferi
 */
public class ScheduleMenu extends javax.swing.JFrame {

    /**
     * Creates new form ScheduleMenu
     */
    public ScheduleMenu() {
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

        bg = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        Label_SubTitle = new javax.swing.JLabel();
        Label_Title = new javax.swing.JLabel();
        ico_title = new javax.swing.JLabel();
        Panel_AddSchedule = new javax.swing.JPanel();
        ico_Add = new javax.swing.JLabel();
        Label_AddSchedule = new javax.swing.JLabel();
        Panel_DeleteSchedule = new javax.swing.JPanel();
        ico_Delete = new javax.swing.JLabel();
        Label_DeleteSchedule = new javax.swing.JLabel();
        Panel_EditSchedule = new javax.swing.JPanel();
        ico_Edit = new javax.swing.JLabel();
        Label_EditSchedule = new javax.swing.JLabel();
        Label_Copyright = new javax.swing.JLabel();
        ico_LogOut = new javax.swing.JLabel();
        ico_Exit = new javax.swing.JLabel();
        ico_Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(345, 187));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopPanel.setBackground(new java.awt.Color(0, 255, 51));

        Label_SubTitle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_SubTitle.setForeground(new java.awt.Color(255, 255, 255));
        Label_SubTitle.setText("Schedule Menu");

        Label_Title.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Label_Title.setForeground(new java.awt.Color(255, 255, 255));
        Label_Title.setText("CTS Administrator");

        ico_title.setForeground(new java.awt.Color(255, 255, 255));
        ico_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_enter_104px_2.png"))); // NOI18N

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addComponent(ico_title, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_SubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ico_title, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Label_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_SubTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(TopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 675, 89));

        Panel_AddSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Panel_AddSchedule.setPreferredSize(new java.awt.Dimension(145, 145));
        Panel_AddSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_AddScheduleMouseClicked(evt);
            }
        });

        ico_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_plus_math_52px_2.png"))); // NOI18N

        Label_AddSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Label_AddSchedule.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_AddSchedule.setForeground(new java.awt.Color(255, 255, 255));
        Label_AddSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_AddSchedule.setText("Add Schedule");

        javax.swing.GroupLayout Panel_AddScheduleLayout = new javax.swing.GroupLayout(Panel_AddSchedule);
        Panel_AddSchedule.setLayout(Panel_AddScheduleLayout);
        Panel_AddScheduleLayout.setHorizontalGroup(
            Panel_AddScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AddScheduleLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(ico_Add)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(Panel_AddScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_AddSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_AddScheduleLayout.setVerticalGroup(
            Panel_AddScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AddScheduleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_AddSchedule)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(Panel_AddSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 120));

        Panel_DeleteSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Panel_DeleteSchedule.setPreferredSize(new java.awt.Dimension(145, 145));
        Panel_DeleteSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_DeleteScheduleMouseClicked(evt);
            }
        });

        ico_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_delete_52px_1_1.png"))); // NOI18N

        Label_DeleteSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Label_DeleteSchedule.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_DeleteSchedule.setForeground(new java.awt.Color(255, 255, 255));
        Label_DeleteSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_DeleteSchedule.setText("Delete Schedule");

        javax.swing.GroupLayout Panel_DeleteScheduleLayout = new javax.swing.GroupLayout(Panel_DeleteSchedule);
        Panel_DeleteSchedule.setLayout(Panel_DeleteScheduleLayout);
        Panel_DeleteScheduleLayout.setHorizontalGroup(
            Panel_DeleteScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DeleteScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_DeleteSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Panel_DeleteScheduleLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ico_Delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_DeleteScheduleLayout.setVerticalGroup(
            Panel_DeleteScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DeleteScheduleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ico_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_DeleteSchedule)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bg.add(Panel_DeleteSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, 120));

        Panel_EditSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Panel_EditSchedule.setPreferredSize(new java.awt.Dimension(145, 145));
        Panel_EditSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_EditScheduleMouseClicked(evt);
            }
        });

        ico_Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_edit_52px.png"))); // NOI18N

        Label_EditSchedule.setBackground(new java.awt.Color(51, 51, 51));
        Label_EditSchedule.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Label_EditSchedule.setForeground(new java.awt.Color(255, 255, 255));
        Label_EditSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_EditSchedule.setText("Edit Schedule");

        javax.swing.GroupLayout Panel_EditScheduleLayout = new javax.swing.GroupLayout(Panel_EditSchedule);
        Panel_EditSchedule.setLayout(Panel_EditScheduleLayout);
        Panel_EditScheduleLayout.setHorizontalGroup(
            Panel_EditScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EditScheduleLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(ico_Edit)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(Panel_EditScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_EditSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_EditScheduleLayout.setVerticalGroup(
            Panel_EditScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EditScheduleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ico_Edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_EditSchedule)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bg.add(Panel_EditSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 120));

        Label_Copyright.setBackground(new java.awt.Color(204, 204, 204));
        Label_Copyright.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Label_Copyright.setForeground(new java.awt.Color(204, 204, 204));
        Label_Copyright.setText("Developed by AFA Inc.");
        bg.add(Label_Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 126, 22));

        ico_LogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_logout_rounded_left_30px.png"))); // NOI18N
        ico_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_LogOutMouseClicked(evt);
            }
        });
        bg.add(ico_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        ico_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_delete_30px.png"))); // NOI18N
        ico_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_ExitMouseClicked(evt);
            }
        });
        bg.add(ico_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        ico_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_back_30px.png"))); // NOI18N
        ico_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_BackMouseClicked(evt);
            }
        });
        bg.add(ico_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_AddScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_AddScheduleMouseClicked
        // TODO add your handling code here:
        AddSchedule x = new AddSchedule();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_AddScheduleMouseClicked

    private void Panel_DeleteScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteScheduleMouseClicked
        // TODO add your handling code here:
        DeleteSchedule x = new DeleteSchedule();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_DeleteScheduleMouseClicked

    private void Panel_EditScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EditScheduleMouseClicked
        // TODO add your handling code here:
        EditSchedule x = new EditSchedule();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_EditScheduleMouseClicked

    private void ico_LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_LogOutMouseClicked
        // TODO add your handling code here:
        LogInAdm x = new LogInAdm();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ico_LogOutMouseClicked

    private void ico_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ico_ExitMouseClicked

    private void ico_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_BackMouseClicked
        // TODO add your handling code here:
        StartMenu x = new StartMenu();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ico_BackMouseClicked

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
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_AddSchedule;
    public javax.swing.JLabel Label_Copyright;
    private javax.swing.JLabel Label_DeleteSchedule;
    private javax.swing.JLabel Label_EditSchedule;
    private javax.swing.JLabel Label_SubTitle;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Panel_AddSchedule;
    private javax.swing.JPanel Panel_DeleteSchedule;
    private javax.swing.JPanel Panel_EditSchedule;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel ico_Add;
    private javax.swing.JLabel ico_Back;
    private javax.swing.JLabel ico_Delete;
    private javax.swing.JLabel ico_Edit;
    private javax.swing.JLabel ico_Exit;
    private javax.swing.JLabel ico_LogOut;
    private javax.swing.JLabel ico_title;
    // End of variables declaration//GEN-END:variables
}
