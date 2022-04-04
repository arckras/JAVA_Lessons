package PaladinTask4;

import java.util.Scanner;

public class ConstructionsAndCycles {
    public static void main(String args[]) {
        factorial();
        evenNumbers();
        reverseOrder();
        invertMatrix();
    }

    private static void invertMatrix() {
        System.out.print("\n4. --------- \n");
        int matr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        System.out.println("Иcходная квадратная матрица");
        for (int row[] : matr) {
            for (int column : row) {
                System.out.printf("%3d", column);
            }
            System.out.println();
        }

        int temp, rowMax = matr.length;
        for (int i = 0; i < rowMax; i++) {
            int columnMax = (int) Math.ceil(matr[i].length / 2);
            for (int j = 0; j <= columnMax; j++) {
                if (i != rowMax - 1 || j != columnMax) {
                    temp = matr[i][j];
                    matr[i][j] = matr[rowMax - i - 1][matr[0].length - j - 1];
                    matr[rowMax - i - 1][matr[i].length - j - 1] = temp;
                }
            }
        }

        System.out.println("\nИнвертированная квадратная матрица");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("%3d", matr[i][j]);
            }
            System.out.println();
        }
    }

    private static void reverseOrder() {
        System.out.print("\n3. --------- \n");
        System.out.print("Введите длинну массива ");
        int val1 = intScanner();
        int array[] = new int[val1];
        for (int i = 0; i < val1; i++) {
            System.out.print("Введите значение ");
            array[i] = intScanner();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static void evenNumbers() {
        System.out.println("\n2. ---------");
        System.out.print("Введите начало диапазона ");
        int val1 = intScanner();
        System.out.print("Введите конец диапазона ");
        int val2 = intScanner();
        System.out.print("Чётные числа диапазона: ");
        for (int i = val1; i <= val2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void factorial() {
        System.out.println("\n1. ---------");
        System.out.print("Введите число для вычисления факториала: ");
        int factorial = intScanner();
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(factorial + "! = " + result);
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
