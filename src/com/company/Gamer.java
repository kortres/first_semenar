package com.company;

public class Gamer {
    private  String gamerName;
    private  int countGames;

    public Gamer(String gamerName, int countGames) {
        this.gamerName = gamerName;
        this.countGames = countGames;
    }

    public Gamer(String gamerName) {
        this.gamerName = gamerName;
        this.countGames = 0;
    }

    public Gamer() {

        this.gamerName = "";
        this.countGames = 0;
    }

    public String getGamerName() {
        return gamerName;
    }

    public int getCountGames() {
        return countGames;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public void setCountGames(int countGames) {
        this.countGames = countGames;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "gamerName='" + gamerName + '\'' +
                ", countGames=" + countGames +
                '}';
    }
}
