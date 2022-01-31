package com.erasoft.transfer.api;

import com.erasoft.transfer.business.abstracts.CarService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.Result;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarsController {

    private CarService carService;
    @Autowired // ioc yapısı car service new getiriyor
    public CarsController(CarService carService){
        this.carService=carService;
    }

 
    @GetMapping("/getall")
    public DataResult<List<Car>> getAll(){

        return this.carService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody Car car) {
    	return this.carService.add(car);
    }
    
 
    
   
}
