package Ex1Seasons;

import Ex1Seasons.Color;

public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season, Color.GREEN);
    }

    @Override
    public String toString() {
        String msg = "Olive tree. ";
        switch (getCurrentSeason()) {
            case Season.SUMMER ->  msg += "I give fruit. ";
            default ->      msg += toString();
        }
        return msg;
    }
    @Override
    public void changeSeason() {
        changeSeason();
        switch (getCurrentSeason()){
            case Season.WINTER: {
                setHeight(height * 1.05);
            }
            case Season.SUMMER: {
                setHeight(height * 1.1);
            }
            case Season.SPRING: {
                setHeight(height * 1.1);
            }
            case Season.FALL: {
                setHeight(height * 1.05);
            }
        }
    }
}
