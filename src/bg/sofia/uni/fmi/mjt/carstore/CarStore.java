package bg.sofia.uni.fmi.mjt.carstore;

import bg.sofia.uni.fmi.mjt.carstore.car.Car;
import bg.sofia.uni.fmi.mjt.carstore.enums.Model;
import bg.sofia.uni.fmi.mjt.carstore.exception.CarNotFoundException;

import java.util.*;

public class CarStore {

    private Set<Car> cars = new TreeSet<>(new CarSortingComparator());
    private int totalPrice=0;


    public boolean add(Car car) {
        if (cars.contains(car))
            return false;
        else {

            cars.add(car);
            totalPrice+=car.getPrice();
            return true;
        }
    }


    public boolean addAll(Collection<Car> cars) {
      boolean flag = false;
      boolean tempFlag = flag;
      for(Car car : cars)
      {
          flag=add(car);
          if(flag)
              tempFlag=flag;
      }

      return tempFlag;
    }


    public boolean remove(Car car) {
        if (!cars.contains(car))
            return false;
        else {
            cars.remove(car);
            totalPrice -= car.getPrice();
            return true;
        }
    }


    public Collection<Car> getCarsByModel(Model model) {
        Set<Car> tempSet = new TreeSet<>(new CarSortingComparator());
        for (Car car : cars) {
            if (car.getModel() == model)
                tempSet.add(car);
        }
        return tempSet;
    }


    public Car getCarByRegistrationNumber(String registrationNumber) {

        for (Car car : cars) {
            if (car.getRegistrationNumber() == registrationNumber)
                return car;
        }
        String message = "No such car found";
        throw new CarNotFoundException(message);
    }


    public Collection<Car> getCars() {
        return cars;
    }


    public Collection<Car> getCars(Comparator<Car> comparator) {

        Set<Car> sortedByComparator = new TreeSet<>(comparator);
        sortedByComparator.addAll(cars);
        return sortedByComparator;
    }


    public Collection<Car> getCars(Comparator<Car> comparator, boolean isReversed) {
        TreeSet<Car> sortedByComparatorSet = new TreeSet<>(comparator);
        sortedByComparatorSet.addAll(cars);

        if (!isReversed) {

            return sortedByComparatorSet;
        } else {

            TreeSet<Car> reverseSort = (TreeSet<Car>) sortedByComparatorSet.descendingSet();
            return sortedByComparatorSet;
        }
    }


    public int getNumberOfCars() {
        return cars.size();
    }


    public int getTotalPriceForCars() {
        return this.totalPrice;
    }


}



