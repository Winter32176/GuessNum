package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
                .thenComparing(GameResult::getTime)
                .thenComparing(GameResult::getTotalNumberOfAttempts))
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
//            System.out.printf("Name: %-" + maxLenght + "s  %3d attempts out of %-3d  Time: %3.2f %n", r.getName(),
//               r.getAttemptsCount(), r.getTotalNumberOfAttempts(), r.getTime() / 1000.0);
//        }

//        leaders.sort(Comparator.comparing(GameResult::getAttemptsCount).thenComparing(GameResult::getTime));             ////  сортирует исходник

//        int count = 0;
//        for (GameResult r : leaders) {
//            System.out.printf("Name: %-" + maxLenght + "s  %-3d attempts out of %-3d  Time: %3.2f %n", r.getName(),
//                r.getAttemptsCount(), r.getTotalNumberOfAttempts(), r.getTime() / 1000.0);
//
//            System.out.println("");
//            count++;
//            if (count < 5) break;
//        }

    }

    public void load() {
        File file = new File("leaderHistory");
        try (Scanner in = new Scanner(file)) {

            while (in.hasNext()) {
                String name = in.next();
                int n = in.nextInt();
                int m = in.nextInt();
                long time = in.nextLong();

                GameResult r = new GameResult();
                r.setName(name);
                r.setAttemptsCount(n);
                r.setTotalNumberOfAttempts(m);
                r.setTime(time);

                leaders.add(r);
            }

        } catch (IOException e) {
            System.out.println("Cannot load leaderboard. Creating new");
        }


    }

    public void save() {
        File file = new File("leaderHistory");
        try (PrintWriter out = new PrintWriter(file)) {
            for (GameResult r : leaders) {
                out.printf("%s %d %d %d %n", r.getName(), r.getAttemptsCount(), r.getTotalNumberOfAttempts(), r.getTime());
            }

        } catch (IOException e) {
            System.out.println("ERROR File unattainable");
        }
    }

}
