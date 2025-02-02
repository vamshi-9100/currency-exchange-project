package com.eureka.client.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.entity.CurrencyServiceEntity;
import com.eureka.client.feighclient.feighclientcode;
import com.eureka.client.incoming.currencyexchange;
import com.eureka.client.repository.CurrencyServiceRepository;

@RestController
@RequestMapping("/api/v1")
public class CurrencyServiceController 
{
	@Autowired
	CurrencyServiceRepository currencyRepository;
	@Autowired
	feighclientcode feighclientcode;
	
	@GetMapping("/from/{fromCurrency}/to/{toCurrency}/quantity/{quantity}")
	public ResponseEntity<?> getdata(@PathVariable String fromCurrency,
			@PathVariable String toCurrency,
			@PathVariable int quantity)
	{
		
		System.out.println(fromCurrency);
		System.out.println(toCurrency);

		CurrencyServiceEntity entity=new CurrencyServiceEntity();
		currencyexchange exchange=feighclientcode.retrivethevalues(fromCurrency, toCurrency);
		double conversionrate=exchange.getConversion_multiple();
		
		
	
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
		double total=conversionrate*quantity;
		entity.setFromcurrency(fromCurrency);
		entity.setTocurrency(toCurrency);
		entity.setConversionMultiple(conversionrate);
		entity.setQuantity(quantity);
		entity.setTotalAmount(total);
		entity.setDatetime(LocalDateTime.now());
		currencyRepository.save(entity);
		return ResponseEntity.status(HttpStatus.OK)
							 .body(entity);
}
}

