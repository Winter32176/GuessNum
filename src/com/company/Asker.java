package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    static Scanner scan = new Scanner(System.in);

    static boolean askAnotherGame() {
        for (; ; ) {
            String answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Starting  new the game");
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                return false;
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

    static void Starting_Game() {
        System.out.println("Want to play?");
        boolean T_F = askAnotherGame();
        if (!(T_F)) {
            System.out.println("Good bye!");
            System.exit(1);
        }
    }

    static int totalNumberOfAttempts() {
        System.out.println("How many attempts you want? Enter the number");
        return scan.nextInt();
    }
}
