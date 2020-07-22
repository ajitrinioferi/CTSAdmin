/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afa.login_gui;

import java.sql.*;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ajitrinioferi
 */
public class EditMovie extends javax.swing.JFrame {

    /**
     * Creates new form EditMovie
     */
    public EditMovie() {
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
        Label_SelectMovie = new javax.swing.JLabel();
        ComboBox_Movie = new javax.swing.JComboBox<>();
        Label_MovieName = new javax.swing.JLabel();
        TextField_MovieName = new javax.swing.JTextField();
        Label_MovieGenre = new javax.swing.JLabel();
        TextField_MovieGenre = new javax.swing.JTextField();
        Label_MovieReleaseDate = new javax.swing.JLabel();
        TextField_MovieReleaseDate = new javax.swing.JTextField();
        Label_MovieProduction = new javax.swing.JLabel();
        TextField_MovieProduction = new javax.swing.JTextField();
        Label_MovieDirector = new javax.swing.JLabel();
        TextField_MovieDirector = new javax.swing.JTextField();
        Label_MovieStartRelease = new javax.swing.JLabel();
        TextField_MovieStartRelease = new javax.swing.JTextField();
        Label_MovieEndRelease = new javax.swing.JLabel();
        TextField_MovieEndRelease = new javax.swing.JTextField();
        Label_MovieDuration = new javax.swing.JLabel();
        TextField_MovieDuration = new javax.swing.JTextField();
        Label_MovieAgeRestriction = new javax.swing.JLabel();
        TextField_AgeRestriction = new javax.swing.JTextField();
        Editpanel = new javax.swing.JPanel();
        btn_Edit = new javax.swing.JButton();
        ico_Exit = new javax.swing.JLabel();
        ico_Back = new javax.swing.JLabel();
        Label_EditMovie = new javax.swing.JLabel();
        Label_Copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(345, 234));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setForeground(new java.awt.Color(51, 51, 51));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_SelectMovie.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_SelectMovie.setForeground(new java.awt.Color(255, 255, 255));
        Label_SelectMovie.setText("Select Movie");
        bg.add(Label_SelectMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ComboBox_Movie.setBackground(new java.awt.Color(0, 0, 0));
        ComboBox_Movie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ComboBox_Movie.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_Movie.setMaximumRowCount(5);
        ComboBox_Movie.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        ComboBox_Movie.setOpaque(false);
        ComboBox_Movie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox_MovieItemStateChanged(evt);
            }
        });
        bg.add(ComboBox_Movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 11, 430, 30));

        Label_MovieName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieName.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieName.setText("Name");
        bg.add(Label_MovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        TextField_MovieName.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieName.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieName.setOpaque(false);
        bg.add(TextField_MovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 250, 30));

        Label_MovieGenre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieGenre.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieGenre.setText("Genre");
        bg.add(Label_MovieGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        TextField_MovieGenre.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieGenre.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieGenre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieGenre.setOpaque(false);
        bg.add(TextField_MovieGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 250, 30));

        Label_MovieReleaseDate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieReleaseDate.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieReleaseDate.setText("Release Date");
        bg.add(Label_MovieReleaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        TextField_MovieReleaseDate.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieReleaseDate.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieReleaseDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieReleaseDate.setOpaque(false);
        bg.add(TextField_MovieReleaseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 30));

        Label_MovieProduction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieProduction.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieProduction.setText("Production ");
        bg.add(Label_MovieProduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        TextField_MovieProduction.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieProduction.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieProduction.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieProduction.setOpaque(false);
        bg.add(TextField_MovieProduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 250, 30));

        Label_MovieDirector.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieDirector.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieDirector.setText("Director");
        bg.add(Label_MovieDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        TextField_MovieDirector.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieDirector.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieDirector.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieDirector.setOpaque(false);
        bg.add(TextField_MovieDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 250, 30));

        Label_MovieStartRelease.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieStartRelease.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieStartRelease.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MovieStartRelease.setText("Start Release");
        bg.add(Label_MovieStartRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, -1));

        TextField_MovieStartRelease.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieStartRelease.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieStartRelease.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField_MovieStartRelease.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieStartRelease.setOpaque(false);
        bg.add(TextField_MovieStartRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 140, 30));

        Label_MovieEndRelease.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieEndRelease.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieEndRelease.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MovieEndRelease.setText("End Release");
        bg.add(Label_MovieEndRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 140, -1));

        TextField_MovieEndRelease.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieEndRelease.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieEndRelease.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField_MovieEndRelease.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieEndRelease.setOpaque(false);
        bg.add(TextField_MovieEndRelease, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, 30));

        Label_MovieDuration.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieDuration.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_MovieDuration.setText("Duration");
        bg.add(Label_MovieDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 140, 20));

        TextField_MovieDuration.setBackground(new java.awt.Color(0, 0, 0));
        TextField_MovieDuration.setForeground(new java.awt.Color(255, 255, 255));
        TextField_MovieDuration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField_MovieDuration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_MovieDuration.setOpaque(false);
        bg.add(TextField_MovieDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, 30));

        Label_MovieAgeRestriction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Label_MovieAgeRestriction.setForeground(new java.awt.Color(255, 255, 255));
        Label_MovieAgeRestriction.setText("Age Restriction");
        bg.add(Label_MovieAgeRestriction, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        TextField_AgeRestriction.setBackground(new java.awt.Color(0, 0, 0));
        TextField_AgeRestriction.setForeground(new java.awt.Color(255, 255, 255));
        TextField_AgeRestriction.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField_AgeRestriction.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextField_AgeRestriction.setOpaque(false);
        bg.add(TextField_AgeRestriction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 30, 30));

        Editpanel.setBackground(new java.awt.Color(0, 255, 51));
        Editpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditpanelMouseClicked(evt);
            }
        });

        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_pencil_52px.png"))); // NOI18N
        btn_Edit.setContentAreaFilled(false);
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditpanelLayout = new javax.swing.GroupLayout(Editpanel);
        Editpanel.setLayout(EditpanelLayout);
        EditpanelLayout.setHorizontalGroup(
            EditpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
        EditpanelLayout.setVerticalGroup(
            EditpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditpanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btn_Edit)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        bg.add(Editpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 11, -1, 270));

        ico_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_delete_30px.png"))); // NOI18N
        ico_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_ExitMouseClicked(evt);
            }
        });
        bg.add(ico_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        ico_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atfxgone/icons8_back_30px.png"))); // NOI18N
        ico_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_BackMouseClicked(evt);
            }
        });
        bg.add(ico_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        Label_EditMovie.setBackground(new java.awt.Color(204, 204, 204));
        Label_EditMovie.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Label_EditMovie.setForeground(new java.awt.Color(204, 204, 204));
        Label_EditMovie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_EditMovie.setText("EDIT MOVIE");
        bg.add(Label_EditMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 120, 40));

        Label_Copyright.setBackground(new java.awt.Color(204, 204, 204));
        Label_Copyright.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Label_Copyright.setForeground(new java.awt.Color(204, 204, 204));
        Label_Copyright.setText("Developed by AFA Inc.");
        bg.add(Label_Copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 126, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditActionPerformed

    private void ico_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ico_ExitMouseClicked

    private void ico_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_BackMouseClicked
        // TODO add your handling code here:
        MovieMenu x = new MovieMenu();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ico_BackMouseClicked

    private void EditpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditpanelMouseClicked
        // TODO add your handling code here:
        try {
            java.util.Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(TextField_MovieStartRelease.getText());
            java.util.Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(TextField_MovieEndRelease.getText());
            java.util.Date releaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(TextField_MovieReleaseDate.getText());
            if (releaseDate.compareTo(startDate) <= 0 && startDate.compareTo(endDate) <= 0
                    && !TextField_MovieName.getText().isEmpty() && !TextField_MovieName.getText().isBlank()
                    && !TextField_AgeRestriction.getText().isEmpty() && !TextField_AgeRestriction.getText().isBlank()
                    && !TextField_MovieDirector.getText().isEmpty() && !TextField_MovieDirector.getText().isBlank()
                    && !TextField_MovieDuration.getText().isEmpty() && !TextField_MovieDuration.getText().isBlank()
                    && !TextField_MovieEndRelease.getText().isEmpty() && !TextField_MovieEndRelease.getText().isBlank()
                    && !TextField_MovieGenre.getText().isEmpty() && !TextField_MovieGenre.getText().isBlank()
                    && !TextField_MovieProduction.getText().isEmpty() && !TextField_MovieProduction.getText().isBlank()
                    && !TextField_MovieReleaseDate.getText().isEmpty() && !TextField_MovieReleaseDate.getText().isBlank()
                    && !TextField_MovieStartRelease.getText().isEmpty() && !TextField_MovieStartRelease.getText().isEmpty()) {
                try {
                    // TODO add your handling code here:
                    String query = " update movies set Title = ?, Genre = ?, ReleaseDate = ?, ProductionBy = ?,"
                            + "FilmDirector = ?, Duration = ?, AgeRestriction = ?, StartDate = ?, EndDate = ? WHERE Title = ?;";
                    PreparedStatement preparedStmt = AFAUtils.conn.prepareStatement(query);
                    preparedStmt.setString(1, TextField_MovieName.getText());
                    preparedStmt.setString(2, TextField_MovieGenre.getText());
                    preparedStmt.setString(3, TextField_MovieReleaseDate.getText());
                    preparedStmt.setString(4, TextField_MovieProduction.getText());
                    preparedStmt.setString(5, TextField_MovieDirector.getText());
                    preparedStmt.setInt(6, Integer.parseInt(TextField_MovieDuration.getText()));
                    preparedStmt.setInt(7, Integer.parseInt(TextField_AgeRestriction.getText()));
                    preparedStmt.setString(8, TextField_MovieStartRelease.getText());
                    preparedStmt.setString(9, TextField_MovieEndRelease.getText());
                    preparedStmt.setString(10, (String) ComboBox_Movie.getSelectedItem());
                    preparedStmt.execute();
                    JOptionPane.showMessageDialog(null,
                            "Movie edited successfuly",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    EditMovie x = new EditMovie();
                    x.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditMovie.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Movie cannot be edited",
                        "Failed",
                        JOptionPane.WARNING_MESSAGE);
            }

        } catch (ParseException ex) {
            Logger.getLogger(EditMovie.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                        "Text field cannot be blank",
                        "Failed",
                        JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_EditpanelMouseClicked

    private void ComboBox_MovieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox_MovieItemStateChanged
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String qry = "SELECT * FROM movies WHERE title = '" + ComboBox_Movie.getSelectedItem() + "';";
            ResultSet rs = AFAUtils.Select(qry);
            while (rs.next()) {
                TextField_MovieName.setText(rs.getString("Title"));
                TextField_MovieGenre.setText(rs.getString("Genre"));
                TextField_MovieReleaseDate.setText(rs.getString("ReleaseDate"));
                TextField_MovieProduction.setText(rs.getString("ProductionBy"));
                TextField_MovieDirector.setText(rs.getString("FilmDirector"));
                TextField_MovieDuration.setText(rs.getString("Duration"));
                TextField_AgeRestriction.setText(rs.getString("AgeRestriction"));
                TextField_MovieStartRelease.setText(rs.getString("StartDate"));
                TextField_MovieEndRelease.setText(rs.getString("EndDate"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboBox_MovieItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            String qry = "SELECT * FROM `movies`";
            ResultSet rs = AFAUtils.Select(qry);
            while (rs.next()) {
                ComboBox_Movie.addItem(rs.getString("Title"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        ComboBox_Movie.setSelectedIndex(-1);
        TextField_AgeRestriction.setText("");
        TextField_MovieDirector.setText("");
        TextField_MovieDuration.setText("");
        TextField_MovieEndRelease.setText("");
        TextField_MovieGenre.setText("");
        TextField_MovieName.setText("");
        TextField_MovieProduction.setText("");
        TextField_MovieReleaseDate.setText("");
        TextField_MovieStartRelease.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EditMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Movie;
    private javax.swing.JPanel Editpanel;
    public javax.swing.JLabel Label_Copyright;
    public javax.swing.JLabel Label_EditMovie;
    private javax.swing.JLabel Label_MovieAgeRestriction;
    private javax.swing.JLabel Label_MovieDirector;
    private javax.swing.JLabel Label_MovieDuration;
    private javax.swing.JLabel Label_MovieEndRelease;
    private javax.swing.JLabel Label_MovieGenre;
    private javax.swing.JLabel Label_MovieName;
    private javax.swing.JLabel Label_MovieProduction;
    private javax.swing.JLabel Label_MovieReleaseDate;
    private javax.swing.JLabel Label_MovieStartRelease;
    private javax.swing.JLabel Label_SelectMovie;
    private javax.swing.JTextField TextField_AgeRestriction;
    private javax.swing.JTextField TextField_MovieDirector;
    private javax.swing.JTextField TextField_MovieDuration;
    private javax.swing.JTextField TextField_MovieEndRelease;
    private javax.swing.JTextField TextField_MovieGenre;
    private javax.swing.JTextField TextField_MovieName;
    private javax.swing.JTextField TextField_MovieProduction;
    private javax.swing.JTextField TextField_MovieReleaseDate;
    private javax.swing.JTextField TextField_MovieStartRelease;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel ico_Back;
    private javax.swing.JLabel ico_Exit;
    // End of variables declaration//GEN-END:variables
}