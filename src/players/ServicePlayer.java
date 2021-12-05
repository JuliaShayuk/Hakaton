package players;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class ServicePlayer {

    public static final ServicePlayer INSTANCE = new ServicePlayer();

    Scanner sc = new Scanner(System.in);

    public void typeOfGame(){
        System.out.print("Enter type of game: ");
        String typeOfGame = sc.next();
        System.out.println("Your type of game: " + typeOfGame);
    }

    public List<Player> getPlayers(List<Player> players){
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name of " + (i + 1) + " person: ");
            String name = sc.next();
            Player player = new Player(name);
            players.add(player);
        }
        return players;
    }

    public List<Player> printPlayers(List<Player> players){
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
        return players;
    }
}
