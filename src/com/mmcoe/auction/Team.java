package com.mmcoe.auction;

import java.util.LinkedList;

public class Team {

    private int teamId;
    private String teamName;
    private LinkedList<Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        players = new LinkedList<Player>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void displayPlayers() {

        System.out.println("Team : " + teamName);

        for(Player p : players) {
            p.display();
            System.out.println();
        }
    }

    public boolean searchPlayer(String name) {

        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.display();
                return true;
            }
        }

        return false;
    }

    public void showBids() {

        for(Player p : players) {
            System.out.println(p.getName() + " : " + p.getBid());
        }
    }
}
