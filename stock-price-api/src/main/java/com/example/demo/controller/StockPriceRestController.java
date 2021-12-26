package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bindings.StockPriceResponse;
import com.example.demo.service.StockPriceService;
import com.example.demo.service.StockPriceServiceImpl;

@RestController
public class StockPriceRestController {
	
	@Autowired
	private StockPriceServiceImpl stockPriceService;
	@GetMapping("/price/{companyName}")
    public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String companyName)
    {
		StockPriceResponse stockPriceResponse=stockPriceService.getPriceByCompanyName(companyName);
		return new ResponseEntity<StockPriceResponse>(stockPriceResponse, HttpStatus.OK);
    }

}
