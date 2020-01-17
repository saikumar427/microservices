package com.sai.microservices.bean;

import java.util.List;

public class Batting {
	
	private List<Score> scores;
	private String title;
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Batting [scores=" + scores + ", title=" + title + "]";
	}
	
}
