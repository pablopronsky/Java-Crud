package com.pablopronsky.carcompany.GUI;

import com.pablopronsky.carcompany.logic.Car;
import com.pablopronsky.carcompany.logic.Controller;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReadCar extends javax.swing.JFrame {

    Controller controller = new Controller();

    public ReadCar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Default = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        title.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(76, 138, 200));
        title.setText("CARS DATABASE");

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setForeground(new java.awt.Color(230, 230, 230));

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Default.setViewportView(carsTable);

        btnRemove.setBackground(new java.awt.Color(76, 138, 200));
        btnRemove.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(235, 235, 235));
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(76, 138, 200));
        btnEdit.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(235, 235, 235));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(76, 138, 200));
        btnReload.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        btnReload.setForeground(new java.awt.Color(235, 235, 235));
        btnReload.setText("RELOAD");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(title)
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(title)
                .addGap(71, 71, 71)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
      
      // check table isn't empty
      if (carsTable.getRowCount() > 0){
          // check for an element selection in the table
          if (carsTable.getSelectedRow() != 1){
              //get the ID to remove
              int selectedCarID = Integer.parseInt(String.valueOf(carsTable.getValueAt(carsTable.getSelectedRow(), 0)));
              controller.deleteCar(selectedCarID);
              controller.printMessage("Car deleted!", "Info", "Success.");
              loadTable();
          }
          else {
              controller.printMessage("Select a car to remove from the list", "Error", "You haven't selected a car");
          }
      }
      else {
          controller.printMessage("Table is empty", "Error", "Error");
      }
  }//GEN-LAST:event_btnRemoveActionPerformed
  
  

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      loadTable();
  }//GEN-LAST:event_formWindowOpened

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        loadTable();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // check table isn't empty
      if (carsTable.getRowCount() > 0){
          // check for an element selection in the table
          if (carsTable.getSelectedRow() != 1){
              // getting the ID from  the selected car
              int selectedCarID = Integer.parseInt(String.valueOf(carsTable.getValueAt(carsTable.getSelectedRow(), 0)));
              EditCar editCar = new EditCar(selectedCarID);
              editCar.setVisible(true);
              editCar.setLocationRelativeTo(null);
              this.dispose();
              
          }
          else {
              controller.printMessage("Select a car to edit from the list", "Error", "You haven't selected a car");
          }
      }
      else {
          controller.printMessage("Table is empty", "Error", "Error");
      }
      
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Default;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTable carsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        DefaultTableModel tableModel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // columns
        String[] columnTitles = {"ID", "MODEL", "MAKE", "ENGINE", "COLOR", "LICENCE PLATE", "DOORS"};
        tableModel.setColumnIdentifiers(columnTitles);
      
         // bring cars from database
        List<Car> cars = controller.getCars();

        // get cars into the table
        if (cars != null) {
            for (Car car : cars) {
                Object[]  object = {car.getId(), car.getModel(), car.getMake(), car.getColor(), car.getEngine(),
                        car.getLicencePlate(), car.getAmountOfDoors()};
                tableModel.addRow(object);
            }
        }
        carsTable.setModel(tableModel);
    }
}
