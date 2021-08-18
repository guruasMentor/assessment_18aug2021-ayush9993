package com.hsbc.players.applicationInterface;

public interface RepositoryInterface {
	
	public void addPlayer(Player p);
	
	public void formTeam() throws TeamNotFormedException;

}
