package bg.sofia.uni.fmi.mjt.carstore;

import bg.sofia.uni.fmi.mjt.carstore.car.Car;
import bg.sofia.uni.fmi.mjt.carstore.car.OrdinaryCar;
import bg.sofia.uni.fmi.mjt.carstore.enums.EngineType;
import bg.sofia.uni.fmi.mjt.carstore.enums.Model;
import bg.sofia.uni.fmi.mjt.carstore.enums.Region;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
       /* final int CAR_NEW_YEAR = 2006;
        final int CAR_MID_YEAR = 2003;
        final int CAR_OLD_YEAR = 2001;

        final int CHEAP_CAR_PRICE = 300;
        final int EXPENSIVE_CAR_PRICE = 5000;
        final int VERY_EXPENSIVE_CAR_PRICE = 8000;

        CarStore carStore = new CarStore();
        Car one = new OrdinaryCar(Model.AUDI, CAR_NEW_YEAR, EXPENSIVE_CAR_PRICE, EngineType.DIESEL, Region.BURGAS);
        Car two = new OrdinaryCar(Model.BMW, CAR_MID_YEAR, CHEAP_CAR_PRICE, EngineType.ELECTRIC, Region.BURGAS);
        Car three = new OrdinaryCar(Model.AUDI, CAR_OLD_YEAR, VERY_EXPENSIVE_CAR_PRICE, EngineType.GASOLINE, Region.BURGAS);

        carStore.add(one);
        carStore.add(two);
        carStore.add(three);

        Collection<Car> cars = carStore.getCarsByModel(Model.AUDI);

        Car[] expected = {three, one};
        Car[] actual = cars.toArray(new Car[cars.size()]);

        System.out.println(carStore.getCars());

*/
        System.out.printf("Hello World!");
    }
}
