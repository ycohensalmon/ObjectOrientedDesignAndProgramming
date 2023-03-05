package Ex1Seasons;

import Ex1Seasons.Color;

public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season, Color.GREEN);
    }

    @Override
    public String toString() {
        String msg = "Olive tree. ";
        if (getCurrentSeason() == Season.FALL) {
            msg += "I give fruit. " + super.toString();
        } else {
            msg += super.toString();
        }
        return msg;
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        if (getCurrentSeason() == Season.WINTER) {
            setHeight(height + 5);
        } else if (getCurrentSeason() == Season.SUMMER) {
            setHeight(height + 10);
        } else if (getCurrentSeason() == Season.SPRING) {
            setHeight(height + 10);
        } else if (getCurrentSeason() == Season.FALL) {
            setHeight(height + 5);
        }
    }
}
