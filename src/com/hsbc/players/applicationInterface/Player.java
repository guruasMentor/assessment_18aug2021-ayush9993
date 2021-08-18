package com.hsbc.players.applicationInterface;

public class Player {
	
	private String name;
	private int category;
	private int ranking;
	
	public Player(String name, int category, int ranking) {
		
		this.name = name;
		this.category = category;
		this.ranking = ranking;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Player [name = " + name + ", category = " + category + ", ranking = " + ranking + "]";
	}

}
