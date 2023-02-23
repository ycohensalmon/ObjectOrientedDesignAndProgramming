package Ex1Seasons;

import Ex1Seasons.Color;

public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,calcColor(season));
    }

    private static Color calcColor(Season s){
        Color c;
        switch (s){
            case Season.FALL -> c = Color.YELLOW;
            case Season.WINTER -> c = null;
            default -> c = Color.GREEN;
        }
        return c;
    }

    @Override
    public String toString() {
        String msg = "Fig tree. ";
        switch (getCurrentSeason()) {
            case Season.WINTER ->  msg += toString() + "and I have no leaves";
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
                setHeight(height * 1.2);
                leavesColor = null;
            }
            case Season.SUMMER: {
                setHeight(height * 1.3);
                leavesColor = null;
            }
            case Season.SPRING: {
                setHeight(height * 1.3);
                leavesColor = Color.GREEN;
            }
            case Season.FALL: {
                setHeight(height * 1.2);
                leavesColor = Color.YELLOW;
            }
        }
    }
}
