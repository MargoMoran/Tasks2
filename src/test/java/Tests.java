import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static AllTasks.Tasks.*;

public class Tests {

    @Test
    public void firstTest() {
        String season = "WINTER";
        System.out.println(whatSeason(season));
    }

    @Test
    public static void secondTest() {
        int prise = 500;
        System.out.println(whatPrice(prise));
    }

    @Test
    public void thirdTest() {
        int finger = 2;
        System.out.println(fingerNumber(finger));
    }

    @Test
    public void fourthTest() {
        String day = "Суббота";
        System.out.println(whichDay(day));
    }

    @Test
    public void fifthTest() {
        int[] array = {1, 3, 5, 0, 2};
        System.out.println(maxOfArray(array));
    }
}

