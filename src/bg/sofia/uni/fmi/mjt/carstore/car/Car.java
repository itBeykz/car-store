package bg.sofia.uni.fmi.mjt.carstore.car;

import bg.sofia.uni.fmi.mjt.carstore.enums.EngineType;
import bg.sofia.uni.fmi.mjt.carstore.enums.Model;

public interface Car {
    /**
     * Returns the model of the car.
     */
    public Model getModel();

    /**
     * Returns the year of manufacture of the car.
     */
    public int getYear();

    /**
     * Returns the price of the car.
     */
    public int getPrice();

    /**
     * Returns the engine type of the car.
     */
    public EngineType getEngineType();

    /**
     * Returns the unique registration number of the car.
     */
    public String getRegistrationNumber();


    /**
     * Overrides toString() method
     */

    public String toString();

}

