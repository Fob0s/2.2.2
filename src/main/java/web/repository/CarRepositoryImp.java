package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryImp implements CarRepository {

    @Override
    public List<Car> getAll() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Chevrovet", "Tahoe", 50000));
        carList.add(new Car("Audi", "A6", 60000));
        carList.add(new Car("Cadillac", "Escalade", 70000));
        carList.add(new Car("Ford", "Explorer", 50000));
        carList.add(new Car("UAZ", "Hunter", 10000));
        return carList;
    }
}
