package PaladinsTask1;

import java.util.Scanner;

public class Main {
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
        String family, name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите value1 ");
        value1 = sc.nextInt();
        System.out.print("Введите value2 ");
        value2 = sc.nextInt();
        System.out.println("Сумма = " + value1 + value2);
        System.out.println("Разность = " + (value1 - value2));
        System.out.println("Произведение = " + value1 * value2);
        double division = (double) value1 / value2;
        System.out.printf("Частное = %.5f", division);

        sc.nextLine();
        System.out.print("\nВведите Фамилию ");
        family = sc.nextLine();
        System.out.print("Введите Имя ");
        name = sc.nextLine();
        System.out.print("Введите возраст ");
        age = sc.nextInt();

        System.out.println("\nvalue1 = " + value1);
        System.out.println("value2 = " + value2);

        System.out.println("\nФамилия: " + family);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
