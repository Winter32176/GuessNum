package com.company;

public class GameResult {
    private String name;
    private int AttemptsCount;
    private int totalNumberOfAttempts;
    private long time;

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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
