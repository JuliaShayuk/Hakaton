package players;

import field.ServiceField;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        ServicePlayer.INSTANCE.typeOfGame();
        ServicePlayer.INSTANCE.getPlayers(players);
        ServicePlayer.INSTANCE.printPlayers(players);
        int [][] field = new int[10][10];
        ServiceField.INSTANCE.fillField(field);
        ServiceField.INSTANCE.printField(field);
    }
}
