public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        String msg = "Olive tree. ";
        switch (getCurrentSeason()) {
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
