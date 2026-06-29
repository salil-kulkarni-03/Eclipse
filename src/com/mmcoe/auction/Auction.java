package com.mmcoe.auction;

public class Auction {
	Player[] players = new Player[5];
    int count = 0;

    void addPlayer(Player p) {
        players[count] = p;
        count++;
    }

    void printBid(String playerName) {
        for (int i = 0; i < count; i++) {
            if (players[i].name.equals(playerName)) {
                System.out.println("Player : " + players[i].name);
                System.out.println("Bid Amount : " + players[i].bid);
                return;
            }
        }
        System.out.println("Player not found");
    }

    void printTeamPlayers(String teamName) {
        System.out.println("Team : " + teamName);

        for (int i = 0; i < count; i++) {
            if (players[i].team.equals(teamName)) {
                System.out.println(players[i].name + " - " + players[i].bid);
            }
        }
    }
}
