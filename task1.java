import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // 1. Game Setup: Generate a random number between a specified range (1 to 100)
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 5; // Limited attempts
            boolean hasWon = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have picked a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + attempts + " attempts to guess the correct number.");

            // 2. User Input & Feedback Loop
            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                attempts--;

                if (playerGuess == randomNumber) {
                    // 4. Win Condition: Player guessed correctly
                    hasWon = true;
                    break;
                } else if (playerGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                // Provide remaining attempts
                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Sorry, you're out of attempts. The correct number was " + randomNumber);
                }
            }

            // Win or Lose Message
            if (hasWon) {
                System.out.println("Congratulations! You've guessed the number correctly.");
            } else {
                System.out.println("Game Over! Better luck next time.");
            }

            // 5. Replay Option
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing the Number Guessing Game. Goodbye!");
        scanner.close
