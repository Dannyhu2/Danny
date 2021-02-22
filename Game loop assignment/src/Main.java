import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int w;
        int l;
        w = 0;
        l = 0;
        while (true) {
            //Starts scanner
            Scanner scanner = new Scanner(System.in);
            //Makes a message to tell the person to type rock paper or scissor
            System.out.println("+==========================================+");
            System.out.println("Type in rock paper or scissor");
            //Makes a string called choice and choice will be what the user inputs into the scanner
            String choice = scanner.next();
            //Checks if the input is rock paper or scissor then continues the rest of the code
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissor")) {
                //Generates a random integer between 1 and 3.
                int random = (int) (Math.random() * 3 + 1);
                //Makes the random integer into a string that is rock paper or scissor.
                String opponentMove = " ";
                if (random == 1) {
                    opponentMove = "rock";
                }
                if (random == 2) {
                    opponentMove = "paper";
                }
                if (random == 3) {
                    opponentMove = "scissor";
                }

                System.out.println("Computer chose: " + opponentMove + "      You chose: "+ choice);
                //Checks if the outcome will be a tie.
                if ((choice.equals(opponentMove))) {
                    System.out.println("It's a tie.");
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                //Checks all possible outcomes and prints if it is a win or lose for the user playing.
                if (choice.equals("rock") && opponentMove.equals("paper")) {
                    System.out.println("You Lose");
                    l = l + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                if (choice.equals("rock") && opponentMove.equals("scissor")) {
                    System.out.println("You Win");
                    w = w + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                if (choice.equals("paper") && opponentMove.equals("rock")) {
                    System.out.println("You Win");
                    w = w + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                if (choice.equals("paper") && opponentMove.equals("scissor")) {
                    System.out.println("You Lose");
                    l = l + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                if (choice.equals("scissor") && opponentMove.equals("rock")) {
                    System.out.println("You Lose");
                    l = l + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);
                }
                if (choice.equals("scissor") && opponentMove.equals("paper")) {
                    System.out.println("You Win");
                    w = w + 1;
                    System.out.println("Wins: " + w + " Losses: " + l);

                }
                //If the user input from line 14 is wrong it will print this line
            } else {
                System.out.println("Please input rock paper or scissor");
            }
        }
    }
}
