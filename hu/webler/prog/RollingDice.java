package hu.webler.prog;


import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {

        Random random = new Random();

        // Simulate rolling  a six-sided dice
        int diceRoll = random.nextInt(6) + 1; // Generates a random number between 1 to 6
        int secondDiceRoll = random.nextInt(6) + 1;

        System.out.println("You rolled: " + diceRoll);
        System.out.println("Your second rolled: " + secondDiceRoll);
    }
}
