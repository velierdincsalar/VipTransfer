package com.erasoft.transfer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erasoft.transfer.business.abstracts.DepartureService;
import com.erasoft.transfer.core.utilities.results.DataResult;
import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Departure;

@RestController
@RequestMapping("/api/departure")
@CrossOrigin
public class DeparturesController {
	
	private DepartureService departureService;
	
	@Autowired
	public DeparturesController(DepartureService departureService) {
		this.departureService=departureService;
	}

	 @GetMapping("/getall")
	    public DataResult<List<Departure>> getAll(){

	        return this.departureService.getAll();
	    }
	
}
