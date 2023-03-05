package Ex1Seasons;

import Ex1Seasons.Animal;
import Ex1Seasons.Color;

public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, calcColor(season));
    }

    private static Color calcColor(Season s){
        return (s == Season.WINTER) ? Color.WHITE : Color.BROWN;
    }

    @Override
    public String toString() {
        return "Caribou: " + msg + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        Season s = getCurrentSeason();
        if (s == Season.SPRING) {
            color = Color.BROWN;
            msg = "";
        } else if (s == Season.WINTER) {
            color = Color.WHITE;
            msg = "I am migrating south. ";
        } else if (s == Season.SUMMER) {
            msg = "I am migrating north. ";
        } else if (s == Season.FALL) {
            msg = "";
        }
    }
}
