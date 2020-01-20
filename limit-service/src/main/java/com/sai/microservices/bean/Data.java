package com.sai.microservices.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	@JsonProperty("man-of-the-match")
	private Player man_of_the_match;
	private String toss_winner_team;
	private boolean matchStarted;
	private List<Team> team;
	private List<Batting> batting;
	
	public Player getMan_of_the_match() {
		return man_of_the_match;
	}
	public void setMan_of_the_match(Player man_of_the_match) {
		this.man_of_the_match = man_of_the_match;
	}
	public String getToss_winner_team() {
		return toss_winner_team;
	}
	public void setToss_winner_team(String toss_winner_team) {
		this.toss_winner_team = toss_winner_team;
	}
	public boolean isMatchStarted() {
		return matchStarted;
	}
	public void setMatchStarted(boolean matchStarted) {
		this.matchStarted = matchStarted;
	}
	public List<Team> getTeam() {
		return team;
	}
	public void setTeam(List<Team> team) {
		this.team = team;
	}
	public List<Batting> getBatting() {
		return batting;
	}
	public void setBatting(List<Batting> batting) {
		this.batting = batting;
	}
	@Override
	public String toString() {
		return "Data [man_of_the_match=" + man_of_the_match + ", toss_winner_team=" + toss_winner_team
				+ ", matchStarted=" + matchStarted + ", team=" + team + ", batting=" + batting + "]";
	}
	
	
}
