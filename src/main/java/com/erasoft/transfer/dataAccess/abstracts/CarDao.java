package com.erasoft.transfer.dataAccess.abstracts;

import com.erasoft.transfer.entities.concretes.Car;
import com.erasoft.transfer.entities.concretes.Destination;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//inteface interface extend eder !
// jpa entity anotasyonu ile belirlenen nesne car , primary key alanı ınteger
public interface CarDao extends JpaRepository<Car,Integer> {






}
