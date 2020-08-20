package AllTasks;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void firstTest() {
        System.out.println(whatSeason("WINTER"));}

    public static String whatSeason(String season){
        switch (season.toLowerCase()) {
            case "winter": return ("It is cold");
            case "summer": return ("It is hot");
            case "spring": return ("It is rainy");
            case "autumn": return ("It is windy");
            default:return "This season does not exist =(";
        }
    }
}