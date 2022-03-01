/*
Напишите консольную программу, которая выводит пользователю следующие сообщения:
“Введите первую переменную” - и пользователь с консоли определяет value1.
“Введите вторую переменную” - и пользователь с консоли определяет value2.
"Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение".
Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер
2. Пусть пользователь вводит в программе номер операции, и в зависимости от этого номера
программа совершает нужную операцию и выводит результат.
Если введенное пользователем число не соответствует никакой операции (например, число 120),
то выведите пользователю сообщение о том, что операция неопределена. Решите задачу через switch-case.
 */

package LiveCoding1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value1, value2, choiceAction;
        String result = "\nОперация не определена";

        System.out.print("\nВведите первую переменную: ");
        value1 = getIntScanner();
        System.out.print("Введите вторую переменную: ");
        value2 = getIntScanner();

        System.out.println("\nМеню:");
        System.out.println("  1. Сложение: ");
        System.out.println("  2. Вычитание: ");
        System.out.println("  3. Умножение: ");
        System.out.println("  4. Деление: ");
        System.out.print("Введите номер операции: ");

        choiceAction = getIntScanner();

        switch (choiceAction) {
            case 1:
                result = Integer.toString(value1 + value2);
                break;
            case 2:
                result = Integer.toString(value1 - value2);
                break;
            case 3:
                result = Integer.toString(value1 * value2);
                break;
            case 4:
                if (value2 != 0) {
                    result = Double.toString((double) value1 / value2);
                } else {
                    result = "На ноль делить нельзя!";
                }
        }
        System.out.println("\nOтвет: " + result);
    }

    static int getIntScanner() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.print("Вы ввели не целое число! Попробуйте ещё раз: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
