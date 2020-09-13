import org.testng.annotations.Test;

import java.io.UncheckedIOException.*;

import java.util.Arrays;

import static AllTasks.Tasks.*;

public class Tests {

    @Test
    public void firstTest() throws Exception {
        String season = "WINTER";
        System.out.println(whatSeason(season));
    }

    @Test
    public static void secondTest() throws Exception {
        int prise = 500;
        System.out.println(whatPrice(prise));
    }

    @Test
    public void thirdTest() throws Exception {
        int finger = 2;
        System.out.println(fingerNumber(finger));
    }

    @Test
    public void fourthTest() throws Exception {
        String day = "Суббота";
        System.out.println(whichDay(day));
    }

    @Test
    public void fifthTest() throws Exception {
        int[] array = {1, 3, 5, 0, 2};
        System.out.println(maxOfArray(array));
    }

    @Test
    public void sixthTest() throws Exception {
        int[] array2 = {1, 3, 5, 0, 2, 7};
        System.out.println(Arrays.toString(reversedArray(array2)));
    }

    @Test
    public void seventhTest() throws Exception {
        int[] array3 = {1, -3, 0, 2, -1, -16, 77, 445, 444, 12, -77};
        System.out.println(Arrays.toString(twoMax(array3)));
    }

    @Test
    public void eighthTest() throws Exception {
        int[] array4 = {10, 5, 2, 324, 0, 7, 4, 15, 12};
        System.out.println(getNum(array4));
    }

}