package com.eureka.client.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.entity.CurrencyExchangeEntity;
import com.eureka.client.repository.CurrencyExchangeRepository;

@RestController
@RequestMapping("/api/v1")
public class CurrencyExchangeController {
	@Autowired
	CurrencyExchangeRepository repo;
	
	@GetMapping("/from/{fromCurrency}/to/{toCurrency}")
	public ResponseEntity<CurrencyExchangeEntity> retrive(@PathVariable String fromCurrency,
			@PathVariable String toCurrency)
	{
		Optional<CurrencyExchangeEntity> exchangevlaues=repo.findByFromCurrencyAndToCurrency(fromCurrency,toCurrency);
		if(exchangevlaues.isPresent())
		{
			CurrencyExchangeEntity entity=exchangevlaues.get();
			return ResponseEntity.status(HttpStatus.OK)
					.header("status", "successfully retrived")
					.body(entity);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
			.body(null);
		}
	}
	

}
