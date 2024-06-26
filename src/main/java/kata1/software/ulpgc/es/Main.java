package kata1.software.ulpgc.es;

import model.kata1.software.ulpgc.es.*;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Jude Bellingham" , 19, "Midfielder");
        Player player2 = new Player("Vinicius Junior" , 23, "Striker");
        Player player3 = new Player("Thibaut Courtois" , 29, "Goalkeeper");

        System.out.print(player1.toString());
        System.out.print(player2.toString());
        System.out.print(player3.toString());

    }
}
