package com.api.entitysalesdata.response;

public class EntitySalesDataResponse {
	private Long id;
	private Long applicationEntityId;
	private String result;
	
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
