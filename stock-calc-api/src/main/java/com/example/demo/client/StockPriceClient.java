package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceClient {

	@GetMapping("/price/{companyName}")
	public com.example.demo.bindings.StockPriceApiResponse invokeStockPriceApi(@PathVariable String companyName);

}
