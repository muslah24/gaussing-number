package games;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Try to guess it!");

        int randomNumber = random.nextInt(100) + 1;
        boolean hasGuessedCorrectly = false;
        int attempts = 0;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Higher...");
            } else if (guess > randomNumber) {
                System.out.println("Lower...");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
