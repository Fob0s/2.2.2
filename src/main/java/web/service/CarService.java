package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> createCars();

    public List<Car> getCars(int a);
}
