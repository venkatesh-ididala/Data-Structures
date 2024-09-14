package firstWeek;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes";


        while (play.equals("yes")) {
            Random r = new Random();
            int Num = r.nextInt(100);
            int guess = -1;
            int tries = 0;
            while (guess != Num) {
                System.out.println("Guess a number between 1 and 100");
                guess = sc.nextInt();
                tries++;

                    if (guess == Num) {
                            System.out.println("You guessed the right number!");
                            System.out.println("It took " + tries +"  guesses");
                            System.out.print("Would you like to play again ? (Yes od No):");
                            play = sc.next().toLowerCase();
                    }
                    else if (guess > Num) {
                            System.out.println("Your guess is too High !Guess Low");
                    }
                    else {
                            System.out.println("Your guess  is too Low!Guess High");
                    }
            }

        }
    }
}
