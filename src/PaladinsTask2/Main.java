package PaladinsTask2;


import java.util.Scanner;

public class Main {
    /*
    По уроку 2 (if/else):
  1.  Объявляется переменная value, которую определяет пользователь через ввод.
        Если переменная больше 10, то в консоль выводится “Число больше 10”.
        Иначе в консоль выводится “Число меньше 10”.

  2. Объявляется переменная statement типа boolean, в которой сравниваются значения a и b.
        Выведите в консоль statement, если:
    a > b, где a = 10, b = 5;
    a > b, где a = 50, b = 25;
    a < b, где a = 67, b = 23;
    a == b, где a = 90, b = 80;


    * a == b, где a = ввод пользователя, b = 60;
    * a < b, где a = 100, b = ввод пользователя, вывод должен быть true.
    * a == b, где b = 60, a = ввод пользователя + b/2, вывод должен быть true;


    ** a == b, где a = ввод пользователя + b/2, b = 146, вывод должен быть true. Объяснить решение.

    3. Объявляется переменная answer типа String, которую определяет пользователь через сканер.
     В консоль выводится вопрос: “Что говорит кошка?”.
     Если пользователь вводит ответ “мяу” с учетом регистра (т.е. может вводится “МяУ”, что тоже верно),
     в консоль выводится “Да, верно!”, иначе в консоль выводится “Это говорит какое-то другое животное…”

    4. Объявляется две целочисленных переменных value1 и value2, значения которых вводит пользователь.
     Также объявляются две переменных типа boolean: statement1 и statement2.
     В statement1 - value1 больше value2, в statement2 - value1 меньше value2.
     Если statement1 - true, нужно вывести в консоль "Первое введённое число меньше второго" и выйти.
     Если statement2 - true, вывести в консоль "Первое введённое число больше второго".
     Иначе вывести в консоль "Числа равны".



    */
    public static void main(String args[]) {

        int value;
        String out;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n1. --------- ");
        System.out.print("\nВведите число ");
        value = sc.nextInt();
        out = value > 10 ? "Число больше 10" : "Число меньше 10";//в задании не предусмотрено число равное 10
        System.out.println(out);

        System.out.print("\n2. --------- ");
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
        System.out.print("\nВведите число (60) ");
        a = sc.nextInt();
        b = 60;
        if (a == b) System.out.println("a = b " + statement);//60
        a = 100;
        System.out.print("Введите число (101) ");
        b = sc.nextInt();
        if (a < b) System.out.println("a < b " + statement);//101
        System.out.print("Введите число (30) ");
        a = sc.nextInt();
        b = 60;
        a = a + b / 2;
        if (a == b) System.out.println("a = b " + statement);//30
        System.out.print("Введите число (73) ");
        a = sc.nextInt();
        b = 146;
        a = a + b / 2;
        if (a == b) System.out.println("a = b " + statement);//73
        //объяснения смотри в коде

        System.out.print("\n3. --------- ");
        sc.nextLine();
        String anser;
        System.out.print("\nЧто говорит кошка? (Мяу) ");
        anser = sc.nextLine().toLowerCase();
        out = anser.equals("мяу") ? "Да верно" : "Это говорит какое-то другое животное …";
        System.out.println(out);

        System.out.print("\n4. --------- ");
        int value1, value2;
        boolean statement1, statement2;
        System.out.print("\nВведите число ");
        value1 = sc.nextInt();
        System.out.print("Введите число ");
        value2 = sc.nextInt();
        statement1 = value1 > value2;
        statement2 = value1 < value2;
        System.out.print("\nВывод будет неправилен, поскольку в задании неустранимая ошибка\n\n");
        if (statement1) System.out.println("Первое введённое число меньше второго");//в задании ошибка
        if (statement2) {
            System.out.println("Первое введённое число больше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}