package com.company;

public class GameResult {
    private long t1;
    private String name;
    private int AttemptsCount;
    private int totalNumberOfAttempts;
    private long timeGame;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttemptsCount() {
        return AttemptsCount;
    }

    public void setAttemptsCount(int attemptsCount) {
        AttemptsCount = attemptsCount;
    }

    public int getTotalNumberOfAttempts() {
        return totalNumberOfAttempts;
    }

    public void setTotalNumberOfAttempts(int totalNumberOfAttempts) {
        this.totalNumberOfAttempts = totalNumberOfAttempts;
    }

    public long getTimeGame() {
        return timeGame;
    }

    public void setTimeGame(long timeGame) {
        this.timeGame = timeGame;
    }

    public long getT1() {
        return t1;
    }

    public void setT1(long t1) {
        this.t1 = t1;
    }

    public String getUTC() {
        return UTC;
    }

    public void setUTC(String UTC) {
        this.UTC = UTC;
    }
}
