package com.company;

import java.util.ArrayList;

public class LeaderBoard {
    private ArrayList<GameResult> leaders = new ArrayList<>();

    public void addLeader(GameResult gr) {
        leaders.add(gr);
    }

    public void leaderboard1() {
        System.out.println("Leaderboard");
        int maxLenght = 0;

        for (GameResult r : leaders) {
            if (r.name.length() > maxLenght) {
                maxLenght = r.name.length();
            }
        }

        for (GameResult r : leaders) {
            System.out.printf("Name: %-" + maxLenght + "s %2d attempts out of %2d Time: %3.2f %n", r.name, r.AttemptsCount, r.totalNumberOfAttempts, r.time / 1000.0);
            System.out.println("");
        }

        System.out.println("Good bye");
    }
}
