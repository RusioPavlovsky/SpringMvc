package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {


    private final static List<Car> CARS_LIST = List.of(
            new Car("Audi", "red", 1993),
            new Car("Bmw", "blue", 2003),
            new Car("Vaz", "black", 1990),
            new Car("Volga", "white", 2023),
            new Car("Nissan", "green", 2010)
    );



    @Override
    public List<Car> numberCar(int num) {
        List<Car> carCopy = new ArrayList<>(CARS_LIST);
        return carCopy.subList(0, num);
    }

    @Override
    public List<Car> listCar() {
        return CARS_LIST;
    }
}
