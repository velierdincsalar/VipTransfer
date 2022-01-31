package com.erasoft.transfer.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="destination")
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="destination_id")
	private int destinationId;
	
	@Column(name="destination_name")
	private String destinationName;
	
	//@Column(name="departureKey")
	//private String departureKey;
	
	@Column(name="travel_time")
	private String travelTime;
	
	@Column(name="travel_km")
	private int travelKm;
	
	@ManyToOne()
	@JoinColumn(name="departure_id")
	private Departure departure;
}
