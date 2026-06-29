package com.mmcoe.auction;

public class TestAuction {
	public static void main(String[] args) {

        Auction a = new Auction();

        a.addPlayer(new Player("Virat", "RCB", 150));
        a.addPlayer(new Player("Rajat", "RCB", 80));
        a.addPlayer(new Player("Rohit", "MI", 160));
        a.addPlayer(new Player("Bumrah", "MI", 120));
        a.addPlayer(new Player("Dhoni", "CSK", 120));

        a.printBid("Virat");

        System.out.println();

        a.printTeamPlayers("MI");
    }
}
