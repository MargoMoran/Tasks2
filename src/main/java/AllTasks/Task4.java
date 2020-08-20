package AllTasks;
import org.testng.annotations.Test;

public class Task4 {
    @Test
    public void fourthTest() {
        System.out.println(whichDay("Суббота"));}

    public static String whichDay(String today){
        String day = today.toLowerCase();
        if (day.contains("суббота") || day.contains("воскресенье")) return "Выходной!";
        else if (day.contains("понедельник") || day.contains("вторник") || day.contains("среда") || day.contains("четверг") || day.contains("пятница"))return "Будний=(";
        else return "Ты неправильно ввел день недели";}}
