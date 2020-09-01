package AllTasks;

public class Tasks {
    public static String whatSeason(String season) {
        switch (season.toLowerCase()) {
            case "winter":
                return ("It is cold");
            case "summer":
                return ("It is hot");
            case "spring":
                return ("It is rainy");
            case "autumn":
                return ("It is windy");
            default:
                return "This season does not exist =(";
        }
    }

    public static String whatPrice(int price) {
        if (price < 1000) {
            return "Цена нормальная";
        } else {
            return "Цена завышена";
        }
    }

    public static String fingerNumber(int finger) {
        switch (finger) {
            case 1:
                return "Большой";
            case 2:
                return "Указательный";
            case 3:
                return "Средний";
            case 4:
                return "Безымянный";
            case 5:
                return "Мизинец";
            default:
                return "Ты - мутант!";
        }
    }

    public static String whichDay(String day) {
        if (day.equalsIgnoreCase("суббота") || day.equalsIgnoreCase("воскресенье")) return "Выходной!";
        else if (day.equalsIgnoreCase("понедельник") || day.equalsIgnoreCase("вторник") || day.equalsIgnoreCase("среда") || day.equalsIgnoreCase("четверг") || day.equalsIgnoreCase("пятница"))
            return "Будний=(";
        else return "Ты неправильно ввел день недели";
    }

    public static int maxOfArray(int[] array) {
        int max = array[0];
        for (int x = 1; x < array.length; x++) max = Math.max(max, array[x]);
        return max;
    }

    public static int[] reversedArray(int[] array2) {
        for (int i = 0; i < array2.length / 2; i++) {
            int res = array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = res;
        }
        return array2;
    }
}
