/*
 * This program lets the user play against a computer
 * in a game of "Rock, Paper, Scissors" where the user has to choose either "rock",
 * "paper", or "scissors" and then show his/her choice to the computer at the same time.
 * The user's choice can win against the computer's choice or lose against.
 */

import java.util.Scanner;
public class RockPaperScissors {

    public static void main (String[] args)

    {
        // variables
        String userMove, computerMove;
        int pointsToWin;
        int userWins = 0;
        int compWins = 0;
        int winner = 0;

        // prompt user to enter points to win
        Scanner input = new Scanner(System.in);
        System.out.print("Points to win: ");
        pointsToWin = input.nextInt();
        // game loop
        while (winner < pointsToWin) {
            System.out.print("Rock, paper, or scissors? ");
            userMove = input.next().toLowerCase();
            computerMove = ComputerOpponent.getMove();
            switch (userMove) {
                // if user inputs scissors
                case "scissors":
                    if (userMove.equals(computerMove)) {
                        System.out.println("The computer chose " + computerMove + ", so it's a tie." + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "rock") {
                        compWins++;
                        System.out.println("The computer chose " + computerMove + ", so you lose." + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "paper") {
                        userWins++;
                        System.out.println("The computer chose " + computerMove + ", so you win!" + " (" + userWins + "-" + compWins + ")");
                    }
                    break;
                // if user inputs rock
                case "rock":
                    if (computerMove == "rock") {
                        System.out.println("The computer chose " + computerMove + ", so it's a tie." + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "scissors") {
                        userWins++;
                        System.out.println("The computer chose " + computerMove + ", so you win!" + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "paper") {
                        compWins++;
                        System.out.println("The computer chose " + computerMove + ", so you lose." + " (" + userWins + "-" + compWins + ")");
                    }
                    break;
                // if user inputs paper
                case "paper":
                    if (computerMove == "paper") {
                        System.out.println("The computer chose " + computerMove + ", so it's a tie." + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "scissors") {
                        compWins++;
                        System.out.println("The computer chose " + computerMove + ", so you lose." + " (" + userWins + "-" + compWins + ")");
                    } else if (computerMove == "rock") {
                        userWins++;
                        System.out.println("The computer chose " + computerMove + ", so you win!" + " (" + userWins + "-" + compWins + ")");
                    }
                    break;
                // if user enters invalid input
                default:
                    System.out.println("Please choose \'rock\', \'paper\', or \'scissors\'!");
                    break;
            }
            // prompt user if won
            if (userWins == pointsToWin) {
                winner = pointsToWin;
                System.out.println("Congratulations! You won!");
                System.exit(0);
                // prompt user if loss
            } else if (compWins == pointsToWin) {
                winner = pointsToWin;
                System.out.println("Sorry, you lost. Better luck next time!");
                System.exit(0);
            }
        }
    }
}
