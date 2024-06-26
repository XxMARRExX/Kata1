package kata1.software.ulpgc.es;

import model.kata1.software.ulpgc.es.*;

public class Main {
    public static void main(String[] args) {

        Coach coach = new Coach("Carlo Anchelotti" , 27);

        Player player1 = new Player("Jude Bellingham" , 19, "Midfielder");
        Player player2 = new Player("Vinicius Junior" , 23, "Striker");
        Player player3 = new Player("Thibaut Courtois" , 29, "Goalkeeper");

        System.out.println(coach.toString());

        System.out.print(player1.toString());
        System.out.print(player2.toString());
        System.out.print(player3.toString());

        System.out.println("\n");

        Team team1 = new Team("Real madrid", coach);

        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);

        System.out.print(team1.toString());

        team1.removePlayer(player1);

        System.out.println("\n");
        System.out.print(team1.toString());

    }
}
