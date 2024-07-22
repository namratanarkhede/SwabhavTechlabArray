package com.aurionpro.model;


// System.gc => used for garbage collection

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;

	
	public CricketPlayer() {
		
		this.playerId =1;
		this.name ="Rohit Sharama";
		this.numberOfMatches = 2;
		this.runs=50;
		this.numberOfWickets = 4;
		
	}
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets ) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches=numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getPlayerId() {
		return this.playerId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getNumberOfMatches() {
		return this.numberOfMatches;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getRuns() {
		return this.runs;
	}
	
	public void setNumberOfWicklets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	public int getNumberOfWicklets() {
		return this.numberOfWickets;
	}
	public double calculateAverage() {
		double average = this.runs /this.numberOfMatches;
		return average;
	}
	public void ShowDetails() {
		System.out.println("Id : "+ this.playerId);
		System.out.println("Name : " +this.name);
		System.out.println("Number of Matches : " + this.numberOfMatches);
		System.out.println("Runs : " +this.runs);
		System.out.println("Number of Wickets : " + this.numberOfWickets);
        System.out.println("Average: " + calculateAverage());
        System.out.println("---------------------------------------------------");
	}

	

}
