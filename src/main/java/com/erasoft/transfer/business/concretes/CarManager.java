package com.erasoft.transfer.business.concretes;

import com.erasoft.transfer.business.abstracts.CarService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.Result;
import com.erasoft.transfer.core.utilities.results.SuccessDataResult;
import com.erasoft.transfer.core.utilities.results.SuccessResult;
import com.erasoft.transfer.dataAccess.abstracts.CarDao;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;

import net.bytebuddy.asm.Advice.This;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CarManager implements CarService {

    private CarDao carDao;

    @Autowired  // bağımlılık olusturur. CarDao sınıfı bulup injektion
    public CarManager(CarDao carDao){
        this.carDao=carDao;
    }
    /*
    @Override
    public List<Car> getAll() {

        return this.carDao.findAll();
    }
    */
    @Override
    public DataResult<List<Car>> getAll(){
    	return new SuccessDataResult<List<Car>>(this.carDao.findAll(),"Data listelendi.");
    }
    
	@Override
	public Result add(Car car) {
		this.carDao.save(car);
		return new SuccessResult("car eklendi");
	}
	
}
