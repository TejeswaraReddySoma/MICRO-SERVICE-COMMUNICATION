package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.StockPriceResponse;
import com.example.demo.entity.StockPrice;
import com.example.demo.repository.StockRepository;


@Service
public class StockPriceServiceImpl implements StockPriceService {

	
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private Environment environment;
	

	@Override
	public StockPriceResponse getPriceByCompanyName(String companyName) {
		// TODO Auto-generated method stub
	Double price=stockRepository.getByCompanyName(companyName);
	
	StockPriceResponse stockPriceResponse=new StockPriceResponse();
	stockPriceResponse.setCompanyName(companyName);
	stockPriceResponse.setCompanyStockPrice(price);
	int n=Integer.parseInt(environment.getProperty("server.port"));
	stockPriceResponse.setPortNumber(n);
	return stockPriceResponse;
	}
	

}
