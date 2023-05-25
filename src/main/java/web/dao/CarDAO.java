package web.dao;

import web.model.Car;

import java.util.List;

public class CarDAO {
    public static List<Car> carsList = List.of(
            new Car("BMW",525,1996),
            new Car("Mercedes", 600, 1999),
            new Car("Audi", 4, 2004),
            new Car("Audi", 100, 1991),
            new Car("Mazda", 323, 1994)
    );
}
