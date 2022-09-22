package section4;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);

        // roll 3 times the dice
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        // Print the dice rolls
        System.out.println("You rolled " + roll1 + " " + roll2 + " " + roll3);

        scan.close();

    }

    // function that rolls dice
    public static int rollDice() {
        double random = Math.random() * 6 + 1;
        return (int) random;
    }
}
