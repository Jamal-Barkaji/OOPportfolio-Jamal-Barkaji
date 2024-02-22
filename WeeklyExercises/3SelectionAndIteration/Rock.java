// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//
// ****************************************************************

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Rock {
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = null;
        int computerInt;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();


        System.out.println("Enter 'R', 'P', or 'S' (Rock, Paper, or Scissors): ");
        personPlay = scan.next();
        scan.close();

        switch (personPlay) {
            case "r":
            case "p":
            case "s":
                personPlay = personPlay.toUpperCase();
                break;
            case "R":
            case "P":
            case "S":
                personPlay = personPlay;
                break;
            default:
                System.out.println("Error: Invalid input.");
            }


        computerInt = generator.nextInt(3);

        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
        }

        System.out.println("Computer's play: " + computerPlay);

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper covers rock. You lose.");
        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You win!!");
            else if (computerPlay.equals("S"))
                    System.out.println("Scissors cut paper. You lose.");
        }
        else if (personPlay.equals("S")) {
            if (computerPlay.equals("R"))
                System.out.println("Rock crushes scissors. You lose");
            else if (computerPlay.equals("P"))
                    System.out.println("Scissors cut paper. You win!!");
        }
    }
}
