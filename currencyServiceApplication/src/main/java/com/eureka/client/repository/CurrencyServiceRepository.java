package com.eureka.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.client.entity.CurrencyServiceEntity;

public interface CurrencyServiceRepository extends JpaRepository<CurrencyServiceEntity, Long> {

}
