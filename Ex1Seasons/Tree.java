package Ex1Seasons;

public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    public void setHeight(double h){
        this.height = (int) Math.round(h);
    }

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public void changeSeason(){
        switch(season){
            case FALL -> season = Season.WINTER;
            case SPRING -> season = Season.SUMMER;
            case SUMMER -> season = Season.FALL;
            case WINTER -> season = Season.SPRING;
        }
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if (this.height == ((Tree)o).height)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString(){
        if(leavesColor == null)
            return "My height is: "+ height;
        else
            return "My height is: "+ height + " and my color is: " + leavesColor;
    }
}
