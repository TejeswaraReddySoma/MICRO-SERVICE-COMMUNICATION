package com.example.demo.service;

import com.example.demo.bindings.StockPriceResponse;

public interface StockPriceService {
	
	public StockPriceResponse getPriceByCompanyName(String companyName);

}
