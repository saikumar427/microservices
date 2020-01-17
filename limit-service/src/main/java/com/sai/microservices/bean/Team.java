package com.sai.microservices.bean;

import java.util.List;

public class Team {

	private List<Player> players;
	private String name;

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [players=" + players + ", name=" + name + "]";
	}
	
	
}
