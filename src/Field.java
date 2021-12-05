import java.util.Arrays;

public class Field {
    private int [][] field = new int[10][10];

    public Field() {
    }

    public int[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Field{" +
                "field=" + Arrays.toString(field) +
                '}';
    }
}
