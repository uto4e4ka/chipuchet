package com.example.chipuchet.tools;

public class CardsInfo {
    String name,score,type;

    public CardsInfo(String name, String score, String type) {
        this.name = name;
        this.score = score;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getType() {
        return type;
    }
}
