package PaladinsTask3;

import java.util.Scanner;

public class ThreeTasks {
    public static void main(String args[]) {
        TaskOfCase();
        TaskWithCounter();
        TernaryOperatorTask();
    }

    private static void TernaryOperatorTask() {
        System.out.print("\n3. --------- \n");

        int[] nums = new int[]{5, 0, -3, 2};
        int i;
        for (i = 0; i < nums.length; i++) {
            double a = (nums[i] == 0 | nums[i] == 2) ? nums[i] + 2 : (double) nums[i] / 10;
            System.out.println(a);
        }
        for (i = 0; i < nums.length; i++) {
            String isFallsBetween0and5 = (nums[i] > 0 & nums[i] < 5) ? "Верно" : "Неверно";
            System.out.println(isFallsBetween0and5);
        }
    }

    private static void TaskWithCounter() {
        System.out.println("\n2. ---------");
        System.out.print("Введите число счетчика ");
        int number = intScanner();
        System.out.print("Введите максимум счетчика (i)");
        int i = intScanner();
        do {
            System.out.println("number = " + number + "; i = " + i);
            number++;
        } while (number < i);
        System.out.println("Заданное число больше или равно i");
    }

    private static void TaskOfCase() {
        System.out.print("\n1. --------- \n");
        String sArray[] = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };

        String sMonth, Season = "";
        for (int iMonth = 0; iMonth < sArray.length; iMonth++) {
            sMonth = sArray[iMonth];

            switch (iMonth) {
                case 11:
                case 0:
                case 1:
                    Season = "зима";
                    break;
                case 2:
                case 3:
                case 4:
                    Season = "весна";
                    break;
                case 5:
                case 6:
                case 7:
                    Season = "лето";
                    break;
                case 8:
                case 9:
                case 10:
                    Season = "осень";
            }
            System.out.println(sMonth + " это " + Season);
        }
    }

    private static int intScanner() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
            sc.next();
        }
        return sc.nextInt();
    }
}

