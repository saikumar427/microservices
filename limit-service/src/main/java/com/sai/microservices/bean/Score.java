package com.sai.microservices.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
	private String dismissal;
	@JsonProperty("SR")
	private int strikeRate;
	@JsonProperty("6s")
	private int six;
    @JsonProperty("4s")
    private int four;
    @JsonProperty("B")
    private int balls;
    @JsonProperty("R")
    private int runs;
    @JsonProperty("dismissal-info")
    private String dismissal_info;
    private String batsman;
    private String pid;
    private String detail;
	public String getDismissal() {
		return dismissal;
	}
	public void setDismissal(String dismissal) {
		this.dismissal = dismissal;
	}
	public int getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(int strikeRate) {
		this.strikeRate = strikeRate;
	}
	public int getSix() {
		return six;
	}
	public void setSix(int six) {
		this.six = six;
	}
	public int getFour() {
		return four;
	}
	public void setFour(int four) {
		this.four = four;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getDismissal_info() {
		return dismissal_info;
	}
	public void setDismissal_info(String dismissal_info) {
		this.dismissal_info = dismissal_info;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Score [dismissal=" + dismissal + ", strikeRate=" + strikeRate + ", six=" + six + ", four=" + four
				+ ", balls=" + balls + ", runs=" + runs + ", dismissal_info=" + dismissal_info + ", batsman=" + batsman
				+ ", pid=" + pid + ", detail=" + detail + "]";
	}
    
}
