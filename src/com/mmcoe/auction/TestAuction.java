package com.mmcoe.auction;

public class TestAuction {

    public static void main(String[] args) {

        Auction auction = new Auction();

        Team rcb = new Team(1, "RCB");
        Team mi = new Team(2, "MI");

        rcb.addPlayer(new Player("Virat", "Batsman", 210, "RCB"));
        rcb.addPlayer(new Player("Phil Salt", "WK", 115, "RCB"));

        mi.addPlayer(new Player("Rohit", "Batsman", 160, "MI"));
        mi.addPlayer(new Player("Bumrah", "Bowler", 180, "MI"));

        auction.addTeam(rcb);
        auction.addTeam(mi);

        System.out.println("Teams:");
        auction.displayTeams();

        System.out.println("\nRCB Players:");
        auction.displayTeamPlayers("RCB");

        System.out.println("\nSearching Virat:");
        auction.showPlayerBid("Virat");
    }
}
