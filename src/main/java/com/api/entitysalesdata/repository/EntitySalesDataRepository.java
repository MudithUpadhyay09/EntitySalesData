package com.api.entitysalesdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entitysalesdata.entities.EntitySalesData;

public interface EntitySalesDataRepository extends JpaRepository<EntitySalesData, Long> {

}
