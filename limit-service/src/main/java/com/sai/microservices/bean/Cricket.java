package com.sai.microservices.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cricket {

	private String dateTimeGMT;
	private String type;
	private boolean cache3;
	private int creditsLeft;
	private int v;
	private int ttl;
	private Data data;
	
	public String getDateTimeGMT() {
		return dateTimeGMT;
	}
	public void setDateTimeGMT(String dateTimeGMT) {
		this.dateTimeGMT = dateTimeGMT;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isCache3() {
		return cache3;
	}
	public void setCache3(boolean cache3) {
		this.cache3 = cache3;
	}
	public int getCreditsLeft() {
		return creditsLeft;
	}
	public void setCreditsLeft(int creditsLeft) {
		this.creditsLeft = creditsLeft;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getTtl() {
		return ttl;
	}
	public void setTtl(int ttl) {
		this.ttl = ttl;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Cricket [dateTimeGMT=" + dateTimeGMT + ", type=" + type + ", cache3=" + cache3 + ", creditsLeft="
				+ creditsLeft + ", v=" + v + ", ttl=" + ttl + ", data=" + data + "]";
	}
	
}
