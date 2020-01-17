package com.sai.microservices.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreInfo {
	
	private String stat;
	private String score;
	private String description;
	@JsonProperty("team-1")
	private String team_1;
	@JsonProperty("team-2")
	private String team_2;
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTeam_1() {
		return team_1;
	}
	public void setTeam_1(String team_1) {
		this.team_1 = team_1;
	}
	public String getTeam_2() {
		return team_2;
	}
	public void setTeam_2(String team_2) {
		this.team_2 = team_2;
	}
	@Override
	public String toString() {
		return "ScoreInfo [stat=" + stat + ", score=" + score + ", description=" + description + ", team_1=" + team_1
				+ ", team_2=" + team_2 + "]";
	}

}
