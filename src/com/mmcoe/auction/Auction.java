package com.mmcoe.auction;

import java.util.LinkedList;

public class Auction {

    private LinkedList<Team> teams;

    public Auction() {
        teams = new LinkedList<Team>();
    }

    public void addTeam(Team t) {
        teams.add(t);
    }

    public void displayTeams() {

        for(Team t : teams) {
            System.out.println(t.getTeamName());
        }
    }

    public void displayTeamPlayers(String teamName) {

        for(Team t : teams) {

            if(t.getTeamName().equalsIgnoreCase(teamName)) {
                t.displayPlayers();
                return;
            }
        }

        System.out.println("Team not found");
    }

    public void showPlayerBid(String playerName) {
        for (Team t : teams) {
            if (t.searchPlayer(playerName)) {
                return;      
            }
        }
        System.out.println("Player not found");
    }
}
