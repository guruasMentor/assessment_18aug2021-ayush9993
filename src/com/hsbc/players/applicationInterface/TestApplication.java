package com.hsbc.players.applicationInterface;

import java.util.Scanner;

public class TestApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose among the following : \n");
		System.out.println("1. Add Players to the Repository");
		System.out.println("2. Form a team");

		int code = sc.nextInt();

		if (code == 1) {

			UserInterface inter = new UserInterface();

			inter.enterPlayer();

		}

		else if (code == 2) {

			UserInterface inter = new UserInterface();

			inter.teamForm();

		}

		else
			System.out.println("Wrong Code Selected !!");

		sc.close();

	}

}
