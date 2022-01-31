package com.erasoft.transfer.business.abstracts;

import java.util.List;

import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;
import com.erasoft.transfer.entities.dtos.DestinationWithDepartureDto;

public interface DestinationService {

	DataResult<Destination> getByDestinationName(String destinationName);

	DataResult<Destination> getByDestinationNameAndDepartureId(String destinationName ,int departureId);

	DataResult<List<Destination>> getByDestinationNameOrDepartureId(String destinationName ,int departureId);

	DataResult<List<Destination>> getByDepartureIn(List<Integer> departure);
	
	DataResult<List<Destination>> getByDestinationsNameContains(String Name);
	
	DataResult<List<Destination>> getByDestinationsNameStartsWith(String Name);

	DataResult<List<Destination>> getByNameAndDeparture(String destinationName, int departureId);

	DataResult<List<DestinationWithDepartureDto>> getDestinationWithDepartureDetails();
		
	DataResult<List<Destination>> getAll();
}
