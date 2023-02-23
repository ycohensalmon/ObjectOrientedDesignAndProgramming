public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, calcColor(season));
    }

    private static Color calcColor(Season s){
        Color c;
        switch (s){
            case WINTER -> c = Color.WHITE;
            default -> c = Color.BROWN;
        }
        return c;
    }

    @Override
    public String toString() {
        return "Caribou: " + msg + toString();
    }

    @Override
    public void changeSeason() {
        changeSeason();
        switch (getCurrentSeason()){
            case SPRING: {
                color = Color.BROWN;
                msg = "";
            }
            case WINTER: {
                color = Color.WHITE;
                msg = " I am migrating south. ";
            }
            case SUMMER: {
                msg = " I am migrating north. ";
            }
            case FALL: {
                msg = "";
            }
        }
    }
}
