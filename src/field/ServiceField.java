package field;

import java.util.Scanner;

public class ServiceField {

    public static final ServiceField INSTANCE = new ServiceField();

    Scanner sc = new Scanner(System.in);

    public void fillField(int [][] field){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               field[i][j] = 1;
            }
        }
    }

    public void printField(int [][] field){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }


}
