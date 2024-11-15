package com.eureka.client.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.client.entity.CurrencyExchangeEntity;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeEntity, Long> {


	Optional<CurrencyExchangeEntity> findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);



}
