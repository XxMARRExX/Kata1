package model.kata1.software.ulpgc.es;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private Coach coach;

    public Team(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public boolean addPlayer(Player newPlayer){

        if (players.size() == 24){
            System.out.printf("No se puede sobrepasar el límite de 24  jugadores.");
            return false;
        }

        for (Player player: players) {
            if (newPlayer.getName().equals(player.getName())){
                return false;
            }
        }

        players.add(newPlayer);
        return true;
    }

    public boolean removePlayer(Player removePlayer){

        if (players.size() == 0){
            System.out.printf("No hay jugadores que se puedan eliminar.");
            return false;
        }

        for (Player player: players){
            if (removePlayer.getName().equals(player.getName())){
                players.remove(player);
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String res = "Nombre del equipo: " + getName() + "\n";
        res += "Nombre del entrenador: " + coach.getName() + "\n";
        res += "---------\n";

        for (Player player: players) {
            res += player.toString();
        }

        return res;
    }
}





