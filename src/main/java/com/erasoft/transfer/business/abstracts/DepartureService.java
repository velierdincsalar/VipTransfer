package com.erasoft.transfer.business.abstracts;

import java.util.List;

import com.erasoft.transfer.core.utilities.results.DataResult;

import com.erasoft.transfer.entities.concretes.Departure;

public interface DepartureService {
	DataResult<List<Departure>> getAll();
}
