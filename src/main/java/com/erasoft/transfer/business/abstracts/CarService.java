package com.erasoft.transfer.business.abstracts;

import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.Result;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface CarService {
    //List<Car> getAll();
	DataResult<List<Car>> getAll();
	Result add(Car car);



 }
