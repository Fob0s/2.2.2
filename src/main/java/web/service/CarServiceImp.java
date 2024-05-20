package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final CarRepository carRepository;

    public CarServiceImp(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public List<Car> getCountCars(int a) {
        return carRepository.getAll().stream().limit(a).collect(Collectors.toList());
    }
}
