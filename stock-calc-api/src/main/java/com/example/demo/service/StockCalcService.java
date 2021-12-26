package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.StockCalcApiResponse;
import com.example.demo.bindings.StockPriceApiResponse;
import com.example.demo.client.StockPriceClient;


@Service
public class StockCalcService {

	@Autowired
	private StockPriceClient priceClient;

	public StockCalcApiResponse getStocksCost(String companyName, Integer quantity) {
		StockCalcApiResponse response = new StockCalcApiResponse();

		// access STOCK-PRICE-API with company name

		StockPriceApiResponse priceApiResponse = priceClient.invokeStockPriceApi(companyName);

		Double companyStockPrice = priceApiResponse.getCompanyStockPrice();

		// calculating total stocks cost based on price & quantity
		Double totalCost = companyStockPrice * quantity;

		response.setCompanyName(companyName);
		response.setPortNumber(priceApiResponse.getPortNumber());
		response.setQuantity(quantity);
		response.setTotalCost(totalCost);

		return response;
	}

}
