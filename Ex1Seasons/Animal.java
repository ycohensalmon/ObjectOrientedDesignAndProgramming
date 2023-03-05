package Ex1Seasons;

import java.lang.Math;

public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;

    protected String msg = "";

    public void setWeight(double w){
        this.weight = (int) Math.round(w);
    }

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if (this.weight < ((Animal)o).weight)
            return -1;
        else if (this.weight > ((Animal)o).weight)
            return 1;
        else
            return 0;
    }

    @Override
    public void changeSeason(){
        if (season == Season.FALL) {
            season = Season.WINTER;
        } else if (season == Season.SPRING) {
            season = Season.SUMMER;
        } else if (season == Season.SUMMER) {
            season = Season.FALL;
        } else if (season == Season.WINTER) {
            season = Season.SPRING;
        }
    }

    @Override
    public String toString(){
        return "My weight is: " + weight + " and my color is: " + color;
    }
}
