package com.erasoft.transfer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erasoft.transfer.business.abstracts.DestinationService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;
import com.erasoft.transfer.entities.dtos.DestinationWithDepartureDto;

@RestController
@RequestMapping("/api/destination")
@CrossOrigin
public class DestinatonsController {

		private DestinationService destinationService;
		
		@Autowired
		public DestinatonsController(DestinationService destinationService) {
			super();
			this.destinationService = destinationService;
		}
		
		@GetMapping("/getall")
		 public DataResult<List<Destination>> getAll() {
			 return this.destinationService.getAll();
		 }
		
		@GetMapping("/getByDestinationName")
		 public DataResult<Destination> getByDestinationName(@RequestParam String destinationName) {
		    return this.destinationService.getByDestinationName(destinationName);
		 }
		
		@GetMapping("/getByDestinationNameAndDepartureId")
		public DataResult<Destination> 
		getByDestinationNameAndDepartureId(@RequestParam("destinationName") String destinationName ,@RequestParam("departureId") int departureId){
			return this.destinationService.getByDestinationNameAndDepartureId(destinationName, departureId);
		}
		
		@GetMapping("/getByDestinationNameOrDepartureId")
		public DataResult<List<Destination>> getByDestinationNameOrDeparture_DepartureId(@RequestParam String destinationName ,@RequestParam int departureId){
			return this.destinationService.getByDestinationNameOrDepartureId(destinationName, departureId);
		}
		@GetMapping("/getByDestinationNameContains")
		public DataResult<List<Destination>> getByDestinationNameContains(String Name){
			return this.destinationService.getByDestinationsNameContains(Name);
		}

		@GetMapping("/getDestinationWithDepartureDetails")
	    public DataResult<List<DestinationWithDepartureDto>> getDestinationWithDepartureDetails(){

	        return this.destinationService.getDestinationWithDepartureDetails();
	    }

}
