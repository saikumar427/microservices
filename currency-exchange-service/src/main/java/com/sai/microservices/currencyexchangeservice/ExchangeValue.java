package com.sai.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal convertionMultiple;
	private String port;
	
	
	public ExchangeValue() {
		super();
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal convertionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultiple = convertionMultiple;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvertionMultiple() {
		return convertionMultiple;
	}
	public void setConvertionMultiple(BigDecimal convertionMultiple) {
		this.convertionMultiple = convertionMultiple;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	

}
