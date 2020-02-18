package com.company;

public class GameResult {
    private long timeReal;
    private String UTC;
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
}
