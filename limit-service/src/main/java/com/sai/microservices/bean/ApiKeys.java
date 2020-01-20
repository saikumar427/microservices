package com.sai.microservices.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "")
public class ApiKeys {

	
    public ApiKeys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiKeys(String matchId, String apikey) {
		super();
		this.matchId = matchId;
		this.apikey = apikey;
	}
	private String matchId = "";
    private String apikey = "";
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
    
}
