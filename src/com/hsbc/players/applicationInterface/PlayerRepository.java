package com.hsbc.players.applicationInterface;

import java.util.ArrayList;

public class PlayerRepository implements RepositoryInterface {

	private static ArrayList<Player> team = new ArrayList<>();

	// Mentor Comment: why the above variable is static? 

	@Override
	public void addPlayer(Player p) {

		team.add(p);

	}

	@Override
	public void formTeam() throws TeamNotFormedException {

		int countDefender = 0;
		int countMidFielder = 0;
		int countForward = 0;
		int countGoalKeeper = 0;

		for (Player p : team) {

			if (p.getCategory() == 1)
				countDefender++;
			else if (p.getCategory() == 2)
				countMidFielder++;
			else if (p.getCategory() == 3)
				countForward++;
			else if (p.getCategory() == 4)
				countGoalKeeper++;

		}

		if (team.size() != 11 || countDefender != 4 || countMidFielder != 3 || countForward != 3
				|| countGoalKeeper != 1)
			throw new TeamNotFormedException("Team not Formed !!");

		for (int i = 0; i < team.size(); i++)
			System.out.println(team.get(i));

	}

}
