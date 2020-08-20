package AllTasks;
import org.testng.annotations.Test;

public class Task2 {
    @Test
    public static void secondTest() {
        System.out.println(whatPrise(500));}

    public static String whatPrise(int prise){
        if (prise<1000) {return "Цена нормальная";}
        else {return "Цена завышена";} }
        }


