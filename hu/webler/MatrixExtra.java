package hu.webler;

public class MatrixExtra {

    public static void main(String[] args) {

        //Mátrix létrehozása
        int[][] matrix = {
                {10, 20, 30},  // mátrix 0. indexén áll ez a belső tömb
                {40, 50, 60},  // mátrix 1. indexén áll ez a belső tömb
                {70, 80, 90},  // mátrix 2. indexén áll ez a belső tömb
        };

        // Az első sor elemeinek és indexeinek kiírása
        System.out.println("Az első sor elemei:");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print("Elem értéke: " + matrix[0][i]+ " ");
            System.out.print("Index: " + i + " ");
            int elem = i + 1;
            System.out.println("Elem sorszám: " + elem);
        }
    }
}
