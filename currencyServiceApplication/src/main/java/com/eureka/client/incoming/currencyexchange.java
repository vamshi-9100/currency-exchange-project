package com.eureka.client.incoming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class currencyexchange {
	private Long id;
	private String fromCurrency;
	private String toCurrency;
	private double conversion_multiple;

}
