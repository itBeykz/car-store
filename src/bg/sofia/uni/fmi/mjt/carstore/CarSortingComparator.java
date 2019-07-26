package bg.sofia.uni.fmi.mjt.carstore;

import bg.sofia.uni.fmi.mjt.carstore.car.Car;

import java.util.Comparator;

class CarSortingComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2) {


        Integer year1 = new Integer(car1.getYear());
        Integer year2 = new Integer(car2.getYear());

        int ModelCompare = car1.getModel().compareTo(car2.getModel());
        int YearCompare = year1.compareTo(year2);

        if (ModelCompare == 0) {
            return ((YearCompare == 0) ? YearCompare : YearCompare);
        } else
            return ModelCompare;
    }
}
