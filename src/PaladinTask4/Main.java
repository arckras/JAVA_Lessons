package PaladinTask4;

import java.util.Scanner;

public class Main {
    /*
По 4 уроку (циклы, конструкции for / foreach):
Факториал.
    1. Реализовать метод, который будет вычислять и возвращать факториал переданного
        в качестве аргумента числа. Факториал вычисляется по формуле: 1 * 2 * 3 * … * n.
Четные числа в заданном диапазоне.
    2. Реализовать метод, который будет принимать в качестве аргумента два числа,
        определяющие границы диапазона и выводить в консоль все четные числа находящиеся в нем.
    3. Массив в обратном порядке.
        Реализовать метод, который будет:
            - принимать через ввод первым параметром длину массива (массив пусть будет строковый);
            - принимать через ввод его элементы;
            - и затем выводить элементы этого массива в обратном порядке в одну строчку.
    4. Инвертировать двумерный массив.
    */
    public static void main(String args[]) {

        System.out.print("\n1. --------- \n");
        int factorial = 17;
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(factorial + "! = " + result);

        System.out.print("\n2. --------- \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начало диапазона ");
        int val1 = sc.nextInt();
        System.out.print("Введите конец диапазона ");
        int val2 = sc.nextInt();
        System.out.print("Чётные числа диапазона: ");
        for (int i = val1; i <= val2; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }

        System.out.print("\n3. --------- \n");
        System.out.print("Введите длинну массива ");
        val1 = sc.nextInt();
        String array[] = new String[val1];
        for (int i = 0; i < val1; i++) {
            System.out.print("Введите значение ");
            array[i] = sc.next();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n4. --------- \n");
        int matr[][] = {{3, 9}, {8, 7}, {1, 2}};
        System.out.println("Иcходный массив");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        int temp;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length / 2; j++) {
                temp = matr[i][j];
                matr[i][j] = matr[i][matr[0].length - j - 1];
                matr[i][matr[0].length - j - 1] = temp;
            }
        }

        System.out.println("Инвертированный массив");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
