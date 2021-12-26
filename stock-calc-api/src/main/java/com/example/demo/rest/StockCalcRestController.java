package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bindings.StockCalcApiResponse;
import com.example.demo.service.StockCalcService;



@RestController
public class StockCalcRestController {

	@Autowired
	private StockCalcService calcService;

	@GetMapping("/calc/{companyName}/{quantity}")
	public StockCalcApiResponse getStocksCost(@PathVariable String companyName, @PathVariable Integer quantity) {
		return calcService.getStocksCost(companyName, quantity);
	}

}
