package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class LeaderBoard {
    private ArrayList<GameResult> leaders = new ArrayList<>();

    public void addLeader(GameResult gr) {
        leaders.add(gr);
    }

    public void leaderboard1() {
        System.out.println("Leaderboard");
        int maxLenght = leaders.stream()
                .mapToInt(r -> r.getName().length())
                .max()
                .orElse(0);


        leaders.stream().sorted(Comparator.comparing(GameResult::getAttemptsCount)
                .thenComparing(GameResult::getTime))
                .limit(5)
                .forEach(r -> System.out.printf("Name: %-" + maxLenght + "s  %3d attempts out of %-3d  Time: %3.2f %n", r.getName(), r.getAttemptsCount(),
                        r.getTotalNumberOfAttempts(), r.getTime() / 1000.0));

//        int maxLenght = 0;
//        for (GameResult r : leaders) {
//            maxLenght = Math.max(maxLenght, r.getName().length());
//
////            if (r.getName().length() > maxLenght) maxLenght = r.getName().length();
//        }

//        for (int i = 0; i < Math.min(leaders.size(), 5); i++) {
//            GameResult r = leaders.get(i);
//            System.out.printf("Name: %-" + maxLenght + "s  %3d attempts out of %-3d  Time: %3.2f %n", r.getName(), r.getAttemptsCount(), r.getTotalNumberOfAttempts(), r.getTime() / 1000.0);
//        }

//        leaders.sort(Comparator.comparing(GameResult::getAttemptsCount).thenComparing(GameResult::getTime));  сортирует исходник

//        int count = 0;
//        for (GameResult r : leaders) {
//            System.out.printf("Name: %-" + maxLenght + "s  %-3d attempts out of %-3d  Time: %3.2f %n", r.getName(), r.getAttemptsCount(), r.getTotalNumberOfAttempts(), r.getTime() / 1000.0);
//            System.out.println("");
//            count++;
//            if (count < 5) break;
//        }

    }
}
