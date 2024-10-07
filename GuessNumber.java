import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean guessedCorrectly = false;

        // Start the guessing game
        while (!guessedCorrectly) {
            g.takeInput();
            guessedCorrectly = g.isCorrect();
        }
    }
}

class Game {
    private int number;  // Number to be guessed
    private int input;   // User input
    private int noOfGuesses = 0; // Count of guesses made

    // Constructor that generates a random number between 1 and 100
    public Game() {
        Random r = new Random();
        this.number = r.nextInt(100) + 1; // Adding 1 to include 100 in the range
    }

    // Method to take input from the user
    public void takeInput() {
        System.out.print("Guess the number (between 1 and 100): ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }

    // Method to check if the guess is correct
    public boolean isCorrect() {
        noOfGuesses++;  // Increment guess count

        if (input == number) {
            System.out.println("Perfect Guess!! You guessed it right.");
            System.out.println("Total No. of Guesses: " + noOfGuesses);
            return true;
        } else if (input < number) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }

        return false;
    }
}
