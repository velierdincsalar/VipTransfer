package com.erasoft.transfer.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erasoft.transfer.business.abstracts.DepartureService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.SuccessDataResult;
import com.erasoft.transfer.dataAccess.abstracts.DepartureDao;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Departure;

@Service
public class DepartureManager  implements DepartureService{

	private DepartureDao departureDao;
	
	@Autowired
	public DepartureManager(DepartureDao departureDao) {
		this.departureDao=departureDao;
	}
	
	
	
	@Override
    public DataResult<List<Departure>> getAll(){
    	return new SuccessDataResult<List<Departure>>(this.departureDao.findAll(),"Data listelendi.");
    }

}
