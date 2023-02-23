public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,calcColor(season));
    }

    private static Color calcColor(Season s){
        Color c;
        switch (s){
            case FALL -> c = Color.YELLOW;
            case WINTER -> c = null;
            default -> c = Color.GREEN;
        }
        return c;
    }

    @Override
    public String toString() {
        String msg = "Fig tree. ";
        switch (getCurrentSeason()) {
            case WINTER ->  msg += toString() + "and I have no leaves";
            case SUMMER ->  msg += "I give fruit. ";
            default ->      msg += toString();
        }
        return msg;
    }
    @Override
    public void changeSeason() {
        changeSeason();
        switch (getCurrentSeason()){
            case WINTER: {
                setHeight(height * 1.2);
                leavesColor = null;
            }
            case SUMMER: {
                setHeight(height * 1.3);
                leavesColor = null;
            }
            case SPRING: {
                setHeight(height * 1.3);
                leavesColor = Color.GREEN;
            }
            case FALL: {
                setHeight(height * 1.2);
                leavesColor = Color.YELLOW;
            }
        }
    }
}
