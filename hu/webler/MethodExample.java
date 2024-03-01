package hu.webler;

public class MethodExample {

    // DRY - don't repeat yourself

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        printSum(x , y);

        int fixedNum = getFixedNumber();
        System.out.println(fixedNum);

        int randomNum = getRandomNumber();
        System.out.println(randomNum);

        int squareX = square(x);
        int squareY = square(y);
        System.out.println(squareX);
        System.out.println(squareY);

        int square = square(100);
        System.out.println(square);
    }

    // Metódus két paramétertel és nincs visszatérési értéke

    private static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("A számok összege: " + sum);
    }

    // Metódus paraméter nélkül, ami mindig ugyanazt a számot adja vissza
    private static int getFixedNumber(){
        return 42; // mindig 42-t adunk vissza
    }

    // Metódusparaméter nélkül és visszatérési értékkel

    private static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    // Metódus egy paraméterrel és visszatérési érétkkel

    private static int square(int num) {
        return num * num;
    }
}
