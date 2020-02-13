package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Want to play?");
        Game_Start_OR_Not();

        String answer;
        Random random = new Random();
        do {

            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Hello, " + name + "!");
            System.out.println("Guess the number from 1-100");
            int myNumber = random.nextInt(100) + 1;
            System.out.println("Cheat: " + myNumber);


            for (int i = 0; i < 10; i++) {
                int userNumber = askGuess();

                if (myNumber == userNumber) {
                    System.out.println("Congratulations, you win " + name + "!");
                    break;
                }
                if (i == 9) {
                    System.out.println("You lose " + name + "!");
                    System.out.println("Number was: " + myNumber);
                    break;
                }
                if (myNumber > userNumber) {
                    System.out.println("Your number is less");
                } else {
                    System.out.println("Your number is bigger");
                }


            }
            System.out.println("Again? yes/no");
            answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Starting  new the game");
            }
        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("Good bye");

    }


    private static void Game_Start_OR_Not() {
        for (; ; ) {
            String Answer = scan.next();
            if (Answer.equalsIgnoreCase("no")) {
                System.out.println("Good bye!");
                System.exit(1);
            } else if (Answer.equalsIgnoreCase("yes")) {
                System.out.println("Starting  new the game");
                break;
            } else {
                System.out.println("Enter Yes or No");
            }
        }
    }


    static int askGuess() {
        for (; ; ) {
            try {
                System.out.println("Enter your guess");
                int num = scan.nextInt();
                if (num >= 1 & num <= 100) {
                    return num;
                } else {
                    System.out.println("Enter the number from 1-100");
                }


            } catch (InputMismatchException wrong_input) {
                String str = scan.next();
                System.out.println(str + " isn't number");

            }

        }
    }


}


























