package com.eureka.client.feighclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eureka.client.incoming.currencyexchange;
@FeignClient(name="currencyExchangeService")
public interface feighclientcode {
	@GetMapping("/api/v1/from/{fromCurrency}/to/{toCurrency}")
 public currencyexchange retrivethevalues(@PathVariable String fromCurrency,@PathVariable String toCurrency);

}
