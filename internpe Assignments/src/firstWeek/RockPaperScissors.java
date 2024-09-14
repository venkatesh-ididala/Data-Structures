package firstWeek;

import java.util.Random;
import java.util.Scanner;

    public class RockPaperScissors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] choices = {"Rock", "Paper", "Scissors"};

            while (true) {
                System.out.println("Enter your move (Rock, Paper, Scissors). To exit the game, type \"exit\": ");
                String userMove = scanner.nextLine();

                if (userMove.equalsIgnoreCase("exit")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

                if (!userMove.equalsIgnoreCase("Rock") &&
                        !userMove.equalsIgnoreCase("Paper") &&
                        !userMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("Invalid move, please try again.");
                    continue;
                }

                int compIndex = random.nextInt(3);
                String computerMove = choices[compIndex];

                System.out.println("Computer move: " + computerMove);

                if (userMove.equalsIgnoreCase(computerMove)) {
                    System.out.println("It's a tie!");
                } else if ((userMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                        (userMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                        (userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }

            scanner.close();
        }
    }
