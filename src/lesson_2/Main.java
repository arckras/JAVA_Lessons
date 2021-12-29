package lesson_2;

import java.util.Scanner;

public class Main<aGreaterThenB> {

    public static void main(String[] args) {
        // int
        int a = 7;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5, 23);
        System.out.println();
        //boolean
        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;

        if (aLessThenB) {
            System.out.println("a < b");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a >= b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a <= b");
        } else {
            System.out.println("False");
        }
        System.out.println();

        //ввод числа
        int userInput = new Scanner(System.in).nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    static void sum(int x, int y) {
        int printSum = (x + y);
        System.out.println(printSum);

    }
}