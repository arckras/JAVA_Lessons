/*
Пользователь вводит три отсортированных массива длины 4 A, B, C.
Найти все пары чисел из A и B равные значениям в С.

Например
A [1, 2, 4, 7]
B [2, 5, 7, 8]
C [1, 3, 5, 9] то ответы 1+2=3, 1+8=9, 2+7=9, 4+5=9, 7+2=9
 */
package M1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите " + (j + 1) + " число " + (i + 1) + "го массива ");
                array[i][j] = sc.nextInt();
            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[row][j] > array[row][j + 1]) {
                        int tmp = array[row][j];
                        array[row][j] = array[row][j + 1];
                        array[row][j + 1] = tmp;
                    }
                }
            }
        }

        for (int row_a : array[0]) {
            for (int row_b : array[1]) {
                for (int row_c : array[2]) {
                    if (row_a + row_b == row_c) System.out.printf("%n%d + %d = %d", row_a, row_b, row_c);
                }
            }
        }
    }
}
