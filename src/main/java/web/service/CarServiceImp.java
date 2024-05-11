package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> createCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Chevrovet", "Tahoe", 50000));
        carList.add(new Car("Audi", "A6", 60000));
        carList.add(new Car("Cadillac", "Escalade", 70000));
        carList.add(new Car("Ford", "Explorer", 50000));
        carList.add(new Car("UAZ", "Hunter", 10000));
        return carList;
    }

    @Override
    public List<Car> getCars(int a) {
        if (a > 5) {
            return createCars();
        } else {
            return createCars().stream()
                    .limit(a).collect(Collectors.toList());
        }
    }
}
