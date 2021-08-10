package com.api.entitysalesdata.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entity_sales_data")

public class EntitySalesData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="id", columnDefinition="bigInt")
	private Long id;
	
	@Column(name="application_entity_id", columnDefinition="bigInt")
	private Long applicationEntityId;
	
	@Column(name="month_year",columnDefinition="date")
	private	Date monthYear;
	
	@Column(name="sales", columnDefinition="bigInt")
	private Long sales;

	public EntitySalesData(Long id, Long applicationEntityId, Date monthYear, Long sales) {
		super();
		this.id = id;
		this.applicationEntityId = applicationEntityId;
		this.monthYear = monthYear;
		this.sales = sales;
	}

	public EntitySalesData() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplicationEntityId() {
		return applicationEntityId;
	}

	public void setApplicationEntityId(Long applicationEntityId) {
		this.applicationEntityId = applicationEntityId;
	}

	public Date getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(Date monthYear) {
		this.monthYear = monthYear;
	}

	public Long getSales() {
		return sales;
	}

	public void setSales(Long sales) {
		this.sales = sales;
	}

	
	

}
