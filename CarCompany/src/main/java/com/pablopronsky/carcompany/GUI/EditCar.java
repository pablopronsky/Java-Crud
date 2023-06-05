package com.pablopronsky.carcompany.GUI;

import com.pablopronsky.carcompany.logic.Car;
import com.pablopronsky.carcompany.logic.Controller;


public class EditCar extends javax.swing.JFrame {

   Controller controller = null;
   Car car = new Car();
   
    public EditCar(int selectedCarID) {
        controller = new Controller();
        initComponents();
        loadCarDetails(selectedCarID);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        btnEdit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(76, 138, 200));
        title.setText("EDIT SELECTED CAR");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        model.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        model.setForeground(new java.awt.Color(76, 138, 200));
        model.setText("MODEL");
        jPanel2.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 233, -1, -1));

        txtModel.setBackground(new java.awt.Color(230, 230, 230));
        txtModel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtModel.setForeground(new java.awt.Color(102, 102, 102));
        txtModel.setBorder(null);
        jPanel2.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 313, -1));

        make.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        make.setForeground(new java.awt.Color(76, 138, 200));
        make.setText("MAKE");
        jPanel2.add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        txtMake.setBackground(new java.awt.Color(230, 230, 230));
        txtMake.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtMake.setForeground(new java.awt.Color(102, 102, 102));
        txtMake.setBorder(null);
        jPanel2.add(txtMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 313, -1));

        engine.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        engine.setForeground(new java.awt.Color(76, 138, 200));
        engine.setText("ENGINE");
        jPanel2.add(engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        txtEngine.setBackground(new java.awt.Color(230, 230, 230));
        txtEngine.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtEngine.setForeground(new java.awt.Color(102, 102, 102));
        txtEngine.setBorder(null);
        jPanel2.add(txtEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 313, -1));

        color.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        color.setForeground(new java.awt.Color(76, 138, 200));
        color.setText("COLOR");
        jPanel2.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        txtColor.setBackground(new java.awt.Color(230, 230, 230));
        txtColor.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(102, 102, 102));
        txtColor.setBorder(null);
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 313, -1));

        licencePlate.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        licencePlate.setForeground(new java.awt.Color(76, 138, 200));
        licencePlate.setText("LICENCE PLATE");
        jPanel2.add(licencePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        txtLicencePlate.setBackground(new java.awt.Color(230, 230, 230));
        txtLicencePlate.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtLicencePlate.setForeground(new java.awt.Color(102, 102, 102));
        txtLicencePlate.setBorder(null);
        jPanel2.add(txtLicencePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 313, -1));

        amountOfDoors.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        amountOfDoors.setForeground(new java.awt.Color(76, 138, 200));
        amountOfDoors.setText("DOORS");
        jPanel2.add(amountOfDoors, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        txtDoors.setBackground(new java.awt.Color(230, 230, 230));
        txtDoors.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtDoors.setForeground(new java.awt.Color(102, 102, 102));
        txtDoors.setBorder(null);
        jPanel2.add(txtDoors, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 130, -1));

        btnClean.setBackground(new java.awt.Color(76, 138, 200));
        btnClean.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        btnClean.setForeground(new java.awt.Color(235, 235, 235));
        btnClean.setText("CLEAN");
        jPanel2.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 135, 57));

        btnEdit.setBackground(new java.awt.Color(76, 138, 200));
        btnEdit.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(235, 235, 235));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 135, 57));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 320, 19));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 290, 320, 19));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 330, 320, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 320, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 410, 320, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 450, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     String model = txtModel.getText();
     String make = txtMake.getText() ;
     String engine = txtEngine.getText();
     String color = txtColor.getText();
     String licencePlate = txtLicencePlate.getText();
     int amountOfDoors = Integer.parseInt(txtDoors.getText());
     
     controller.editCar(car, model, make, engine, color, licencePlate, amountOfDoors);
     controller.printMessage("Edit succesful", "Info", "Done");
     ReadCar readCar = new ReadCar();
     readCar.setVisible(true);
     readCar.setLocationRelativeTo(null);
     this.dispose();

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtModel.setText("");
        txtMake.setText("");
        txtEngine.setText("");
        txtColor.setText("");
        txtLicencePlate.setText("");
        txtDoors.setText("");
    }                       
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountOfDoors;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel color;
    private javax.swing.JLabel engine;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
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

    private void loadCarDetails(int selectedCarID) {
        // looks for the selected car in the database
        car = controller.getCar(selectedCarID);
        // set the textfields with the car info
        txtModel.setText(car.getModel());
        txtMake.setText(car.getMake());
        txtEngine.setText(car.getEngine());
        txtColor.setText(car.getColor());
        txtLicencePlate.setText(car.getLicencePlate());
        txtDoors.setText(String.valueOf(car.getAmountOfDoors()));
    }
}
