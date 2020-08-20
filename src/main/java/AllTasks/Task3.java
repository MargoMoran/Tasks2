package AllTasks;
import org.testng.annotations.Test;

public class Task3 {
    @Test
    public void thirdTest() {
        System.out.println(fingerNumber(2));}

    public static String fingerNumber(int finger){
        switch (finger) {
            case 1: return "Большой";
            case 2: return "Указательный";
            case 3: return "Средний";
            case 4: return "Безымянный";
            case 5: return "Мизинец";
            default:return "Ты - мутант!";
        }
    }
}