package Ex1Seasons;

import Ex1Seasons.Color;

public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,calcColor(season));
    }

    private static Color calcColor(Season s){
        Color c;
        if(s == Season.FALL){
            c = Color.YELLOW;
        } else if (s == Season.WINTER) {
            c = null;
        } else {
            c = Color.GREEN;
        }
        return c;
    }

    @Override
    public String toString() {
        String msg = "Fig tree. ";
        Season s = getCurrentSeason();
        if (s == Season.WINTER){
            msg += super.toString() + " and I have no leaves";
        } else if (s == Season.SUMMER) {
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
            setHeight(height + 20);
            leavesColor = null;
        } else if (getCurrentSeason() == Season.SUMMER) {
            setHeight(height + 30);
            leavesColor = Color.GREEN;
        } else if (getCurrentSeason() == Season.SPRING) {
            setHeight(height + 30);
            leavesColor = Color.GREEN;
        } else if (getCurrentSeason() == Season.FALL) {
            setHeight(height + 20);
            leavesColor = Color.YELLOW;
        }
    }
}
