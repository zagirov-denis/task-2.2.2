package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    public static List<Car> carList(int count){
        return CarDAO.carsList.subList(0, count);
    }

}
