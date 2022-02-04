package PaladinsTask3;

import java.util.Scanner;

public class Main {
    /*
Объявляется переменная answer типа String, которую определяет пользователь через сканер.
 В консоль выводится вопрос: “Что говорит кошка?”.
 Если пользователь вводит ответ “мяу” с учетом регистра (т.е. может вводится “МяУ”, что тоже верно),
 в консоль выводится “Да, верно!”, иначе в консоль выводится “Это говорит какое-то другое животное…”

    */
    public static void main(String args[]) {
        String anser, out;
        Scanner sc = new Scanner(System.in);
        System.out.print("Что говорит кошка? ");
        anser = sc.nextLine().toLowerCase();
        out = anser.equals("мяу") ? "Да верно" :"Это говорит какое-то другое животное …";
        System.out.println(out);
    }
}
