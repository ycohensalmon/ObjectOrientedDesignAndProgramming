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
            case FALL ->  msg += "I give fruit. " + super.toString();
            default ->      msg += super.toString();
        }
        return msg;
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()){
            case WINTER: {
                setHeight(height * 1.05);
            }
            case SUMMER: {
                setHeight(height * 1.1);
            }
            case SPRING: {
                setHeight(height * 1.1);
            }
            case FALL: {
                setHeight(height * 1.05);
            }
        }
    }
}
