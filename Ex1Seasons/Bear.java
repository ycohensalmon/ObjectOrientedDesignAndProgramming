package Ex1Seasons;

import Ex1Seasons.Animal;
import Ex1Seasons.Color;

public class Bear extends Animal {
    Bear(int weight, Season season) {
        super(weight,season, Color.BROWN);
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        Season season = getCurrentSeason();
        if (season == Season.SUMMER) {
            setWeight(weight * (1 + 1/3.0));
            msg = "";
        } else if (season == Season.SPRING) {
            setWeight(weight * 0.75);
            msg = "";
        } else if (season == Season.FALL) {
            setWeight(weight * 1.25);
            msg = "";
        } else if (season == Season.WINTER) {
            setWeight((weight * 0.8));
            msg = "I am sleeping. ";
        }
    }

    @Override
    public String toString() {
        return "Bear. " + msg + super.toString();
    }
}
