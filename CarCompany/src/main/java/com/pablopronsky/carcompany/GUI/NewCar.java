package com.pablopronsky.carcompany.GUI;

import com.pablopronsky.carcompany.logic.Controller;


public class NewCar extends javax.swing.JFrame {

    Controller controller = new Controller();
    
    public NewCar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        make = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        engine = new javax.swing.JLabel();
        txtEngine = new javax.swing.JTextField();
        color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        licencePlate = new javax.swing.JLabel();
        txtLicencePlate = new javax.swing.JTextField();
        amountOfDoors = new javax.swing.JLabel();
        txtDoors = new javax.swing.JTextField();
        btnClean = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Model");

        jTextField2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(76, 138, 200));
        title.setText("ADD NEW CAR");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 67, -1, -1));

        model.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        model.setForeground(new java.awt.Color(76, 138, 200));
        model.setText("MODEL");
        jPanel1.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 233, -1, -1));

        txtModel.setBackground(new java.awt.Color(230, 230, 230));
        txtModel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtModel.setForeground(new java.awt.Color(102, 102, 102));
        txtModel.setBorder(null);
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });
        jPanel1.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 313, -1));

        make.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        make.setForeground(new java.awt.Color(76, 138, 200));
        make.setText("MAKE");
        jPanel1.add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        txtMake.setBackground(new java.awt.Color(230, 230, 230));
        txtMake.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtMake.setForeground(new java.awt.Color(102, 102, 102));
        txtMake.setBorder(null);
        txtMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakeActionPerformed(evt);
            }
        });
        jPanel1.add(txtMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 313, -1));

        engine.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        engine.setForeground(new java.awt.Color(76, 138, 200));
        engine.setText("ENGINE");
        jPanel1.add(engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        txtEngine.setBackground(new java.awt.Color(230, 230, 230));
        txtEngine.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtEngine.setForeground(new java.awt.Color(102, 102, 102));
        txtEngine.setBorder(null);
        txtEngine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEngineActionPerformed(evt);
            }
        });
        jPanel1.add(txtEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 313, -1));

        color.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        color.setForeground(new java.awt.Color(76, 138, 200));
        color.setText("COLOR");
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        txtColor.setBackground(new java.awt.Color(230, 230, 230));
        txtColor.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(102, 102, 102));
        txtColor.setBorder(null);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 313, -1));

        licencePlate.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        licencePlate.setForeground(new java.awt.Color(76, 138, 200));
        licencePlate.setText("LICENCE PLATE");
        jPanel1.add(licencePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        txtLicencePlate.setBackground(new java.awt.Color(230, 230, 230));
        txtLicencePlate.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtLicencePlate.setForeground(new java.awt.Color(102, 102, 102));
        txtLicencePlate.setBorder(null);
        txtLicencePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicencePlateActionPerformed(evt);
            }
        });
        jPanel1.add(txtLicencePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 313, -1));

        amountOfDoors.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        amountOfDoors.setForeground(new java.awt.Color(76, 138, 200));
        amountOfDoors.setText("DOORS");
        jPanel1.add(amountOfDoors, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        txtDoors.setBackground(new java.awt.Color(230, 230, 230));
        txtDoors.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtDoors.setForeground(new java.awt.Color(102, 102, 102));
        txtDoors.setBorder(null);
        txtDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoorsActionPerformed(evt);
            }
        });
        jPanel1.add(txtDoors, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, -1));

        btnClean.setBackground(new java.awt.Color(76, 138, 200));
        btnClean.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        btnClean.setForeground(new java.awt.Color(235, 235, 235));
        btnClean.setText("CLEAN");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 135, 57));

        btnAdd.setBackground(new java.awt.Color(76, 138, 200));
        btnAdd.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(235, 235, 235));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 135, 57));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 320, 19));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 290, 320, 19));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 330, 320, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 320, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 410, 320, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 450, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakeActionPerformed

    private void txtEngineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEngineActionPerformed
        // TODO adcode here:
    }//GEN-LAST:event_txtEngineActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtLicencePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicencePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicencePlateActionPerformed

    private void txtDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoorsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     String model = txtModel.getText();
     String make = txtMake.getText() ;
     String engine = txtEngine.getText();
     String color = txtColor.getText();
     String licencePlate = txtLicencePlate.getText();
     int amountOfDoors = Integer.parseInt(txtDoors.getText());
     
     // clean the fields so it looks cleaner
     controller.printMessage("Success", "Info", "Done");
     controller.addCar(model, make, engine, color, licencePlate, amountOfDoors);
     txtModel.setText("");
     txtMake.setText("");
     txtEngine.setText("");
     txtColor.setText("");
     txtLicencePlate.setText("");
     txtDoors.setText("");   
   
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtModel.setText("");
        txtMake.setText("");
        txtEngine.setText("");
        txtColor.setText("");
        txtLicencePlate.setText("");
        txtDoors.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountOfDoors;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JLabel color;
    private javax.swing.JLabel engine;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel licencePlate;
    private javax.swing.JLabel make;
    private javax.swing.JLabel model;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDoors;
    private javax.swing.JTextField txtEngine;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}
