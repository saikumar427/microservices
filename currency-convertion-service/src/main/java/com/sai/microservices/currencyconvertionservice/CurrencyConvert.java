package com.sai.microservices.currencyconvertionservice;

import java.math.BigDecimal;


public class CurrencyConvert {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal convertionMultiple;
	private BigDecimal convertionValue;
	private String port;
	
	
	
	public CurrencyConvert() {
		super();
	}
	public CurrencyConvert(Long id, String from, String to, BigDecimal convertionMultiple, BigDecimal convertionValue,
			String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultiple = convertionMultiple;
		this.convertionValue = convertionValue;
		this.port = port;
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
	public BigDecimal getConvertionValue() {
		return convertionValue;
	}
	public void setConvertionValue(BigDecimal convertionValue) {
		this.convertionValue = convertionValue;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	

}
