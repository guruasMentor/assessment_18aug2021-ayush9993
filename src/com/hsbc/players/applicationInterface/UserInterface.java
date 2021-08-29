package com.hsbc.players.applicationInterface;

import java.util.Scanner;

public class UserInterface {

	public void enterPlayer() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter the number of players : ");
		int num = sc.nextInt();

		System.out.println("\nEnter names of Player, Category and Ranking : ");

		for (int i = 0; i < num; i++) {

			// Mentor Comment: Provide proper prompt Messsages as what user has to input like name,rank..
			String name = sc.next();
			int category = sc.nextInt();
			int ranking = sc.nextInt();

			// Mentor Comment : No Validations, No Exceptions thrown upon invalid inputs

			RepositoryInterface p = new PlayerRepository();
			p.addPlayer(new Player(name, category, ranking));
			
		}
		
		sc.close();

	}
	
	public void teamForm() {
		
		RepositoryInterface p = new PlayerRepository();
		try {
			p.formTeam();
		} catch (TeamNotFormedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}