package PaladinsTask2;


import java.util.Scanner;

public class Main {
    /*
    По уроку 2 (if/else):
    Объявляется переменная value, которую определяет пользователь через ввод.
        Если переменная больше 10, то в консоль выводится “Число больше 10”.
        Иначе в консоль выводится “Число меньше 10”.

    Объявляется переменная statement типа boolean, в которой сравниваются значения a и b.
        Выведите в консоль statement, если:
    a > b, где a = 10, b = 5;
    a > b, где a = 50, b = 25;
    a < b, где a = 67, b = 23;
    a == b, где a = 90, b = 80;


    * a == b, где a = ввод пользователя, b = 60;
    * a < b, где a = 100, b = ввод пользователя, вывод должен быть true.
    * a == b, где b = 60, a = ввод пользователя + b/2, вывод должен быть true;


    ** a == b, где a = ввод пользователя + b/2, b = 146, вывод должен быть true. Объяснить решение.

    */
    public static void main(String args[]) {

        int value;
        String out;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        value = sc.nextInt();
        out = value > 10 ? "Число больше 10" : "Число меньше 10";//в задании не предусмотрено число равное 10
        System.out.println(out);

        boolean statement = true;
        int a, b, c;
        a = 10;
        b = 5;
        if (a > b) System.out.println("\na > b " + statement);
        a = 50;
        b = 25;
        if (a > b) System.out.println("a > b " + statement);
        a = 67;
        b = 23;
        if (a < b) System.out.println("a < b " + statement);//при этих условиях вывода никогда не будет
        a = 90;
        b = 80;
        if (a == b) System.out.println("a = b " + statement);//при этих условиях вывода никогда не будет
        System.out.print("\nВведите число ");
        a = sc.nextInt();
        b = 60;
        if (a == b) System.out.println("a = b " + statement);//60
        a = 100;
        System.out.print("Введите число ");
        b = sc.nextInt();
        if (a < b) System.out.println("a < b " + statement);//101
        System.out.print("Введите число ");
        a = sc.nextInt();
        b = 60;
        a = a + b / 2;
        if (a == b) System.out.println("a = b " + statement);//30
        System.out.print("Введите число ");
        a = sc.nextInt();
        b = 146;
        a = a + b / 2;
        if (a == b) System.out.println("a = b " + statement);//73
        //объяснения смотри в коде
    }
}