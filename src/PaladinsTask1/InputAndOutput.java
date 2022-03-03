package PaladinsTask1;

import java.util.Scanner;

public class InputAndOutput {
    /*
        По 1 уроку:
        Первые две задачи с hackerrank на ввод и вывод.
        Объявите две целочисленные переменные value1 и value2, значения которых указывает пользователь
         через ввод. Выведите в консоль сумму двух этих чисел, их разность, произведение и частное.
        Объявите переменные соответствующих типов для фамилии, имени и возраста и присвойте
         им значения посредством ввода. Выведите значения этих переменных в консоль.
        Вывод в формате:
        Фамилия: Петров
        Имя: Петя
        Возраст: 34
    */
    public static void main(String args[]) {
        int value1, value2, age;
        Double quotient;
        String surname, name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите value1 ");
        value1 = sc.nextInt();
        System.out.print("Введите value2 ");
        value2 = sc.nextInt();
        System.out.println("Сумма = " + (value1 + value2));
        System.out.println("Разность = " + (value1 - value2));
        System.out.println("Произведение = " + value1 * value2);
        quotient = (double) value1 / value2;
        System.out.printf("Частное = %.5f", quotient);

        sc.nextLine();
        System.out.print("\n\nВведите Фамилию ");
        surname = sc.nextLine();
        System.out.print("Введите Имя ");
        name = sc.nextLine();
        System.out.print("Введите возраст ");
        age = sc.nextInt();
        System.out.println("\nФамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
