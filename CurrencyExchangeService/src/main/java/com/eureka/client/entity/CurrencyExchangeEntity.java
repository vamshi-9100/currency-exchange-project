package com.eureka.client.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "currency_conversion")
public class CurrencyExchangeEntity {
	@Id
	private Long id;
    @Column(name = "from_Currency")
	private String fromCurrency;

    @Column(name = "to_Currency") 
	private String toCurrency;
    @Column(name = "conversion_multiple") 
	private double conversion_multiple;

}
