package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of players you want to add : ");
		int n = sc.nextInt();
		
		CricketPlayer players[]  = new CricketPlayer[n];
		
		System.out.println("Enter the details of player");
		for(int i = 0; i<players.length; i++ ) {
			System.out.println("\n Player " +(i+1)+ " : " );
			
			System.out.println("Enter the player id : ");
			int playerId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the name: ");
			String name =sc.next();
			
			System.out.println("Enter the number of matches");
			int numberOfMatches = sc.nextInt();
			
			System.out.println("Enter the number of runs");
			int runs = sc.nextInt();
			
			System.out.println("Enter the number of wickets");
			int numberOfWickets = sc.nextInt();
			
			players[i] =  new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
			
		}
		

		for(int i = 0; i<players.length; i++) {
			players[i].ShowDetails();
		}
		
		CricketPlayer maxAveragePlayer  = getMaximumAveragePlayer(players);
		System.out.println("\nPlayer with the maximum Average is :");
		maxAveragePlayer.ShowDetails();
		
		displayPlayers(players);

        sc.close();
	}
	
	public static CricketPlayer getMaximumAveragePlayer(CricketPlayer[] players) {
		
		CricketPlayer maxAveragePlayer = players[0];
		for(int i = 1; i<players.length;i++) {
			if(players[i].calculateAverage() > maxAveragePlayer.calculateAverage()) {
				maxAveragePlayer= players[i];
			}
		}
		return maxAveragePlayer;
		
		
	}

	public static void displayPlayers(CricketPlayer[] players) {
		Arrays.sort(players, Comparator.comparingDouble(CricketPlayer::calculateAverage));
		System.out.println("\n Players in ascending order of Average: ");
		for (int i = 0 ;  i < players.length; i++) {
			players[i].ShowDetails();
			System.out.println();
		}
	}

}
