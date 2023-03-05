package Ex1Seasons;

import Ex1Seasons.Season;
import Ex1Seasons.Seasonable;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();
    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {

        String report = "";
        for (Seasonable element:seasonables) {
            report += element.toString() + "\n";
        }
        return report;
    }
}