package test2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nWelcome to Rock-Paper-Scissors Game.....!");

        System.out.print("Enter the number of rounds: ");
        int maximumRounds = scanner.nextInt();

        for (int round = 1; round <= maximumRounds; round++) {
            System.out.println("\nRound " + round);
            System.out.println("Choose your move:");
            System.out.println("1 for Rock, \t 2 for Paper, and \t 3 for Scissors");
            System.out.print("Enter your choice (1/2/3): ");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice. Please enter 1, or 2, or 3.");
                round--; // Repeat the same round
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            String playerMove = getChoicesMoveName(playerChoice);
            String computerMove = getChoicesMoveName(computerChoice);

            System.out.println("Player chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            int result = determineWinner(playerChoice, computerChoice);

            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }

    private static String getChoicesMoveName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }

    private static int determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return 0; // Tie
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                (playerChoice == 2 && computerChoice == 1) ||
                (playerChoice == 3 && computerChoice == 2)) {
            return 1; // Player wins
        } else {
            return -1; // Computer wins
        }
    }

}
