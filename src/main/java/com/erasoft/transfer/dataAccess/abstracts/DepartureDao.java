package com.erasoft.transfer.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import com.erasoft.transfer.entities.concretes.Departure;

public interface DepartureDao extends JpaRepository<Departure,Integer>{

}
