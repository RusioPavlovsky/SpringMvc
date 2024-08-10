package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


/*fixme контроллер должен маппиться на /cars
*  */
@Controller()
public class CarController {

    @Autowired
    private CarService carService ;

    @GetMapping(value = "/car")
    public String carPrint(@RequestParam("count") int count, ModelMap model){
            List<Car> cars = carService.numberCar(count);
            model.addAttribute("cars",cars);

         return "car";
    }
    @GetMapping(value = "/cars")
    public String carsPrint(ModelMap model){
        List<Car> cars = carService.listCar();
        model.addAttribute("cars",cars);
        return "car";
    }

}
