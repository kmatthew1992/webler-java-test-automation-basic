package hu.webler;

import java.util.Scanner;
public class ShapeWithMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a piramis méretét: ");
        int size= scanner.nextInt();
        System.out.println("Kérlek add meg a piramist alkotó szimbólumot: ");
        String symbol = scanner.next();
        drawHalfPyramid(size, symbol);
        System.out.println("-------------");
        drawFullPyramid(size, symbol);
        System.out.println("-------------");
        drawSquare(size, symbol);
        System.out.println("-------------");
        System.out.println("Kérlek add meg a téglalap magasságát: ");
        int height = scanner.nextInt();
        System.out.println("Kérlek add meg a téglalap szélességét: ");
        int width = scanner.nextInt();
        drawRectangle(height, width, symbol);
        System.out.println("-------------");
        System.out.println("Mi van, ha a paramétereket más sorrendben adom be a metódusba, de a típus ugyanaz?");
        drawRectangle(width, height, symbol);
    }
    
    // Piramist kirajzoló metódus
    private static void drawHalfPyramid(int size, String symbol){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol +" ");
            }
            System.out.println();
        }
    }

    // Teljes piramist rajzoló metódus
    private static void drawFullPyramid(int size, String symbol){
        for (int i = 0; i < size; i++) {
            // először a spr előtti szóközök kirása
            for (int j = size - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // Majd a csillagok (szimbólum) kirása a sorban
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    // Négyzetet rajzoló metódus
    private static void drawSquare(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();

        }
    }

    // Téglalapot rajzoló metódus

    private static void drawRectangle(int height, int width, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
