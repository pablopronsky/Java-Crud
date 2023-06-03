package com.pablopronsky.carcompany.logic;

import com.pablopronsky.carcompany.persistence.PersistenceController;

import javax.swing.*;
import java.util.List;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    public void addCar(String model, String make, String engine, String color, String licencePlate, 
            int amountOfDoors) {

        Car car = new Car();
        car.setModel(model);
        car.setMake(make);
        car.setEngine(engine);
        car.setColor(color);
        car.setLicencePlate(licencePlate);
        car.setAmountOfDoors(amountOfDoors);

        persistenceController.addCar(car);
    }

    public List<Car> getCars() {
        return persistenceController.getListOfCars();
    }
  
  public void deleteCar(int selectedCarID) {
        persistenceController.deleteCar(selectedCarID);
  }
    
    public void printMessage(String message, String type, String title){
        JOptionPane optionPane = new JOptionPane(message);
        if (type.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (type.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog jDialog = optionPane.createDialog(title);
        jDialog.setAlwaysOnTop(true);
        jDialog.setVisible(true);
    }
}
