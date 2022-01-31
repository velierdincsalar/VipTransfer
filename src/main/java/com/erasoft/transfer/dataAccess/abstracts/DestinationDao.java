package com.erasoft.transfer.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.erasoft.transfer.entities.concretes.Destination;
import com.erasoft.transfer.entities.dtos.DestinationWithDepartureDto;

public interface DestinationDao extends JpaRepository<Destination, Integer>{
	
	Destination getByDestinationName(String destinationName);

	Destination getByDestinationNameAndDeparture_DepartureId(String destinationName ,int departureId);

	List<Destination> getByDestinationNameOrDeparture_DepartureId(String destinationName ,int departureId);

	List<Destination> getByDepartureIn(List<Integer> departures);
	
	List<Destination> getByDestinationNameContains(String Name);
	
	List<Destination> getByDestinationNameStartsWith(String Name);

	@Query("From Destination where destinationName=:destinationName and departure.departureId=:departureId")
	List<Destination> getByNameAndDeparture(String destinationName, int departureId);

	@Query("Select new com.erasoft.transfer.entities.dtos.DestinationWithDepartureDto"
			+ "(p.id,p.destinationName,d.departureName)  "
			+ "From Departure d Inner Join d.destinations p")
	List<DestinationWithDepartureDto> getDestinationWithDepartureDetails();
	
	
}
