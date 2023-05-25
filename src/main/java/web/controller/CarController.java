package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count,
                          ModelMap model){

        if (count>=5) count = 5;
        model.addAttribute("cars", CarService.carList(count));
        return "cars";
    }
}
