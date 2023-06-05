
package com.pablopronsky.carcompany.persistence;

import com.pablopronsky.carcompany.logic.Car;
import com.pablopronsky.carcompany.persistence.exceptions.NonexistentEntityException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {

  CarJpaController carJpaController = new CarJpaController();
    
    // add car
    public void addCar(Car car) {
      carJpaController.create(car);
    }
    
    // get list of cars to print on the table
    public List<Car> getListOfCars() {
      return carJpaController.findCarEntities();
    }
  
    // delete the selected car from the gui
    public void deleteCar(int selectedCarID) {
      try {
      carJpaController.destroy(selectedCarID);
      } catch (NonexistentEntityException e) {
      throw new RuntimeException(e);
      }
    }
    // get selected car to edit in the gui
    public Car getCar(int selectedCarID) {
        return carJpaController.findCar(selectedCarID);
    }
    //edit 
    public void editCar(Car car) {
      try {
          carJpaController.edit(car);
      } catch (Exception ex) {
          Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
}
