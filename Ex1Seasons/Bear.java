package Ex1Seasons;

import Ex1Seasons.Animal;
import Ex1Seasons.Color;

public class Bear extends Animal {
    Bear(int weight, Season season) {
        super(weight,season, Color.BROWN);
    }

    @Override
    public void changeSeason() {
        changeSeason();
        Season season = getCurrentSeason();
        switch(season){
            case Season.SUMMER: {
                setWeight(weight * (1 + 1/3));
                msg = "";
            }
            case Season.SPRING: {
                setWeight(weight *= 0.75);
                msg = "";
            }
            case Season.FALL: {
                setWeight(weight *= 1.25);
                msg = "";
            }
            case Season.WINTER: {
                setWeight((weight * 0.8));
                msg = " I am sleeping. ";
            }

        }
    }

    @Override
    public String toString() {
        return "Ex1Seasons.Bear. " + msg + toString();
    }
}