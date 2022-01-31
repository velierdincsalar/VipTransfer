package com.erasoft.transfer.entities.concretes;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity  //demek sen bir db nesnesisin demek
@Table(name="cars") // db tablo 
@AllArgsConstructor // constructor olsutuur
@NoArgsConstructor
public class Car {

	
	
    @Id // tablo id belirtiyoruz
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id bir bir artacak belirttik
    @Column(name="ID") //tablo kolon bilgisi
    private  int ID;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private  String image;

    @Column(name="numberseat")
    private  int numberseat;
}
