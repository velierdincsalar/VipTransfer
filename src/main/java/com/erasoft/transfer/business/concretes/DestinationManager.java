package com.erasoft.transfer.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erasoft.transfer.business.abstracts.DestinationService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.core.utilities.results.SuccessDataResult;
import com.erasoft.transfer.dataAccess.abstracts.DestinationDao;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;
import com.erasoft.transfer.entities.dtos.DestinationWithDepartureDto;

@Service
public class DestinationManager implements DestinationService{
	
	
	
	private DestinationDao destinationDao;
	
	@Autowired
	public DestinationManager(DestinationDao destinationDao) {
		super();
		this.destinationDao = destinationDao;
	}
	@Override
	public DataResult<Destination> getByDestinationName(String destinationName) {
		// TODO Auto-generated method stub
	 	return new SuccessDataResult<Destination>
	 	(this.destinationDao.getByDestinationName(destinationName),"Data listelendi.");
	    
	}
	@Override
	public DataResult<Destination> getByDestinationNameAndDepartureId(String destinationName, int departureId) {
		return new SuccessDataResult<Destination>
	 	(this.destinationDao.getByDestinationNameAndDeparture_DepartureId(destinationName,departureId),"Data listelendi.");
	   
	}
	@Override
	public DataResult<List<Destination>> getByDestinationNameOrDepartureId(String destinationName, int departureId) {
		return new SuccessDataResult<List<Destination>>
	 	(this.destinationDao.getByDestinationNameOrDeparture_DepartureId(destinationName,departureId),"Data listelendi.");
	   
	}
	@Override
	public DataResult<List<Destination>> getByDepartureIn(List<Integer> departure) {
		return new SuccessDataResult<List<Destination>>
	 	(this.destinationDao.getByDepartureIn(departure),"Data listelendi.");
	   
	}
	@Override
	public DataResult<List<Destination>> getByDestinationsNameContains(String Name) {
		return new SuccessDataResult<List<Destination>>
	 	(this.destinationDao.getByDestinationNameContains(Name),"Data listelendi.");
	 
	}
	@Override
	public DataResult<List<Destination>> getByDestinationsNameStartsWith(String Name) {
		return new SuccessDataResult<List<Destination>>
	 	(this.destinationDao.getByDestinationNameStartsWith(Name),"Data listelendi.");
	 
	}
	@Override
	public DataResult<List<Destination>> getByNameAndDeparture(String destinationName, int departureId) {
		return new SuccessDataResult<List<Destination>>
	 	(this.destinationDao.getByNameAndDeparture(destinationName,departureId),"Data listelendi.");
	 
	}
	@Override
	public DataResult<List<DestinationWithDepartureDto>> getDestinationWithDepartureDetails() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<DestinationWithDepartureDto>>
		(this.destinationDao.getDestinationWithDepartureDetails(),"Data listelendi.");
	}
	@Override
	public DataResult<List<Destination>> getAll() {
		return new SuccessDataResult<List<Destination>>(this.destinationDao.findAll(),"Data listelendi.");
	}
	

}
