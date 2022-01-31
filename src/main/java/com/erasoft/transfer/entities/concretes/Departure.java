package com.erasoft.transfer.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="departure")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","destinations"})
public class Departure {
	
	@Id // tablo id belirtiyoruz
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // id bir bir artacak belirttik
	@Column(name="departure_id") //tablo kolon bilgisi
	private int departureId;
	
	@Column(name="departure_name")
	private String departureName;
	
	@Column(name="departure_key")
	private String departureKey;
	
	@OneToMany(mappedBy = "departure")
	private List<Destination> destinations;
}
