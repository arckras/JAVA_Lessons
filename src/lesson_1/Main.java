package lesson_1;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Ну, здравствуй World!\n");
        int valu1 = 0;
        int valu2 = 5;
        int sum = valu1 + valu2;
        System.out.println("Сумма " + sum);
        int multiply = valu1 * valu2;
        System.out.println("Произведение " + multiply);
        int difference = valu1 - valu2;
        System.out.println("Разность " + difference);
        String scanner = (new Scanner(System.in)).next();
        System.out.println(scanner);
    }
}
