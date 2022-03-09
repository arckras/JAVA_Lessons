package PaladinTasks;

import java.util.Scanner;

public class TaskIfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        СomparisonWith10(sc);
        BooleanComparison(sc);
        StringComparison(sc);
        BooleanAndIntegerComparisons(sc);
    }

    private static void СomparisonWith10(Scanner sc) {
        int value;

        System.out.print("\n1. --------- ");
        System.out.print("\nВведите число ");
        value = sc.nextInt();

        if (value > 10) {
            System.out.printf("Число больше 10");
        } else if (value == 10) {
            System.out.printf("Число равно 10");
        } else {
            System.out.printf("Число меньше 10");
        }
    }

    private static void BooleanComparison(Scanner sc) {
        System.out.print("\n2. --------- ");
        boolean statement = true;
        int a, b;
        a = 10;
        b = 5;
        statement = a > b;
        if (statement) {
            System.out.println("\na > b " + statement);
        }
        a = 50;
        b = 25;
        if (statement) {
            System.out.println("a > b " + statement);
        }
        a = 67;
        b = 23;
        statement = a < b;
        if (statement) {
            System.out.println("a < b " + statement);
        }
        a = 90;
        b = 80;
        statement = a == b;
        if (statement) {
            System.out.println("a = b " + statement);
        }
        System.out.print("\nВведите число (60) ");
        a = sc.nextInt();
        b = 60;
        statement = a == b;
        if (statement) {
            System.out.println("a = b " + statement);
        }
        a = 100;
        System.out.print("Введите число (101) ");
        b = sc.nextInt();
        statement = a < b;
        if (statement) {
            System.out.println("a < b " + statement);
        }
        System.out.print("Введите число (30) ");
        a = sc.nextInt();
        b = 60;
        a = a + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println("a = b " + statement);
        }
        System.out.print("Введите число (73) ");
        a = sc.nextInt();
        b = 146;
        a = a + b / 2;
        statement = a == b;
        if (statement) {
            System.out.println("a = b " + statement);
        }
    }

    private static void StringComparison (Scanner sc){
        System.out.print("\n3. --------- ");
        sc.nextLine();
        String anser;
        System.out.print("\nЧто говорит кошка? ");
        anser = sc.nextLine().toLowerCase();
        if (anser.equals("мяу")) {
            System.out.println("Да верно");
        } else {
            System.out.println("Это говорит какое-то другое животное …");
        }
    }

    private static void BooleanAndIntegerComparisons (Scanner sc){
        System.out.print("\n4. --------- ");
        int value1, value2;
        boolean statement1, statement2;
        System.out.print("\nВведите число ");
        value1 = sc.nextInt();
        System.out.print("Введите число ");
        value2 = sc.nextInt();
        statement1 = value1 > value2;
        statement2 = value1 < value2;
        if (statement1) {
            System.out.println("Первое введённое число больше второго");
        } else if (statement2) {
            System.out.println("Первое введённое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}
