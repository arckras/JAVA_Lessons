package M1Task2;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        String[][] arrTime = new String[2][];
        arrTime[0] = new String[]{"07:00", "00:10", "00:05", "00:03"};
        arrTime[1] = new String[]{"22:58", "00:02", "00:60", "00:43", "00:20"};
        String trainParking = "00:03";
        LocalTime trainStart, trainFinish;

        System.out.printf("\n%s%s%s", "Прибытие", " | Стоянка | ", "Отправление");
        for (int i = 0; i < arrTime.length; i++) {
            trainStart = LocalTime.parse(arrTime[i][0]);
            System.out.printf("\n%10s%10s%8s", "|", "|", trainStart);
            for (int j = 1; j < arrTime[i].length; j++) {
                trainFinish = trainStart.plusMinutes(timePoint(arrTime[i][j]));
                trainStart = trainFinish.plusMinutes(timePoint(trainParking));
                System.out.printf("\n%6s   | %6s  | %7s", trainFinish, trainParking, trainStart);
            }
            System.out.println();
        }
    }

    public static int timePoint(String arr) {
        String arrForSplit[];
        arrForSplit = arr.split(":");
        return Integer.parseInt(arrForSplit[1]);
    }
}

