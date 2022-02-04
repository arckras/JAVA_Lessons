package PaladinsTask3;

import java.util.Scanner;

public class Main {
    /*
По уроку 3 "Сопоставление switch, цикл while и тернарные операторы":
    1. В переменной month хранится число из интервала от 1 до 12 в соответствии с месяцами.
        Определите, в какую пору года попадает этот месяц (зима, лето, весна, осень) и
        выведите значение в консоль.
        Задание с *: сделать переменную month типа String и проименовать месяцы как “Январь”, “Февраль”
         и далее.
    2. Объявляется две целочисленные переменные: number и i. Обе эти переменные вводит пользователь.
        Если переменная number < i, то до тех пор, пока это условие выполняется,
            нужно выводить в консоль любую фразу и увеличивать number на 1, а потом выйти из цикла.
            Иначе вывести "Заданное число больше или равно i".
    3. Использовать тернарные операторы:
        а. Если переменная a равна нулю или равна двум, то прибавьте к ней 7,
            иначе поделите ее на 10. Выведите новое значение переменной на экран.
            Проверьте при a, равном 5, 0, -3, 2.
        b. Если переменная a больше нуля и меньше 5-ти, то выведите 'Верно',
            иначе выведите 'Неверно'. Проверьте при a, равном 5, 0, -3, 2.
    */
    public static void main(String args[]) {

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
        String sMonth;
        for (int iMonth = 0; iMonth < sArray.length; iMonth++) {
            sMonth = sArray[iMonth];
            if (iMonth == 11 | iMonth <= 1) {
                System.out.println(sMonth + " это зима");
            } else if (iMonth >= 2 & iMonth <= 4) {
                System.out.println(sMonth + " это весна");
            } else if (iMonth >= 5 & iMonth <= 7) {
                System.out.println(sMonth + " это лето");
            } else {
                System.out.println(sMonth + " 'это осень");
            }
        }

        System.out.print("\n2. --------- \n");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int i = 5;
        do {
            System.out.println("number = " + number + "; i = " + i);
            number++;
        } while (number < i);
        System.out.println("Заданное число больше или равно i");

        System.out.print("\n3. --------- \n");
        int[] nums = new int[]{5, 1, -3, 2};
        for (i = 0; i < nums.length; i++) {
            int a = (nums[i] == 0 | nums[i] == 2) ? nums[i] + 2 : nums[i] / 10;
            System.out.println(a);
        }
        for (i = 0; i < nums.length; i++) {
            String b = (nums[i] > 0 & nums[i] < 5) ? "Верно" : "Неверно";
            System.out.println(b);
        }
    }
}

