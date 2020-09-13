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
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
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

    public static int[] twoMax(int[] array3) {
        int max1 = array3[0];
        int max2 = array3[1];
        for (int i = 0; i < array3.length; i++)
            if (array3[i] > max1) {
                max1 = array3[i];
            }
        for (int i = 0; i < array3.length; i++)
            if (max1 > array3[i] && array3[i] > max2) {
                max2 = array3[i];
            }
        int[] myResultArray = new int[2];
        myResultArray[0] = max1;
        myResultArray[1] = max2;

        return myResultArray;
    }

    public static int getNum(int[] array) {
        int NumCount = 0;
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (((array[i] % 2) == 0) && ((array[i] % 3) != 0)) {
                array[i] = num;
                NumCount++;
            }
        }
        return NumCount;
    }
}