package com.erasoft.transfer.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationWithDepartureDto {
	
	private int id;
	private String destinationName;
	private String departureNameString;
	
}
