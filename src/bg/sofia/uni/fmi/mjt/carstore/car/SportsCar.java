package bg.sofia.uni.fmi.mjt.carstore.car;

import bg.sofia.uni.fmi.mjt.carstore.enums.EngineType;
import bg.sofia.uni.fmi.mjt.carstore.enums.Model;
import bg.sofia.uni.fmi.mjt.carstore.enums.Region;

public class SportsCar implements Car {
    private Model model;
    private Integer year;
    private int price;
    private EngineType engineType;
    private Region region;
    private String registrationNumber;

    public SportsCar() {

    }

    public SportsCar(Model model, int year, int price, EngineType engineType, Region region) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineType = engineType;
        this.region = region;
        this.registrationNumber = region.createRegistrationNumber();
    }

    @Override
    public Model getModel() {
        return this.model;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public EngineType getEngineType() {
        return this.engineType;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String toString() {
        return model + " " + year + " " + price + " " + " " + engineType + " " + region;
    }
}
