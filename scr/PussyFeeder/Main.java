package PussyFeeder;

import java.util.Scanner;

public class Main {

    static String arrayCats[][] = {
            {"Чёрный", "1"},
            {"Белый", "2"},
            {"Серый", "3"},
            {"Полосатый", "6"},
            {"Чужой", "7"}
    };
    static int numberOfPackage;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int choiceActions;
        int maxChoiceActions = 4;
        int choiceCat;

        for (; ; ) {
            //вывод базы
            do {
                for (int i = 0; i < arrayCats.length; i++) {
                    int countCat = i + 1;
                    System.out.printf("\n  " + countCat + ". %-9s кот - %s (пакетов)", arrayCats[i]);
                }
                //вывод меню
                System.out.println("\n\nМеню:");
                System.out.println("  1. Добавить/Убрать пакет ... коту");
                System.out.println("  2. Добавить/Убрать пакет всем котам");
                System.out.println("  3. Добавить/Убрать пакет четным котам");
                System.out.println("  4. Добавить/Убрать пакет нечетным котам");
                System.out.print("Выберите цифру (666 - выход): ");

                while (!sc.hasNextInt()) {
                    System.out.println("Вы ввели не целое число");
                    sc.next();
                }
                choiceActions = (char) sc.nextInt();

            } while (choiceActions < 1 | choiceActions > maxChoiceActions & choiceActions != 666);

            if (choiceActions == 666) break;

            //выбор действия
            switch (choiceActions) {
                case 1:
                    adOrRemove();   //добавляем пакет или убираем
                    System.out.println("Выберите номер кота");

                    while (!sc.hasNextInt()) {   //проверяем на целочиленность
                        System.out.println("Вы ввели не целое число");
                        sc.next();
                    }

                    choiceCat = sc.nextInt();
                    if (isBowl(choiceCat))
                        putPackage(choiceCat); //проверяем наполненность миски и меняем в ней число пакетов
                    break;
                case 2:
                    adOrRemove();
                    boolean isBowls = true;
                    for (int i = 1; i < arrayCats.length + 1; i++) {
                        if (!isBowl(i)) {
                            isBowls = false;
                            break;
                        }
                    }
                    if (isBowls) {
                        for (int i = 1; i < arrayCats.length + 1; i++) {
                            putPackage(i);
                        }
                    }
                    break;
                case 3:
                    adOrRemove();
                    isBowls = true;
                    for (int i = 2; i < arrayCats.length + 1; i+=2) {
                        if (!isBowl(i)) {
                            isBowls = false;
                            break;
                        }
                    }
                    if (isBowls) {
                        for (int i = 2; i < arrayCats.length + 1; i+=2) {
                            putPackage(i);
                        }
                    }
                    break;

                case 4:
                    adOrRemove();
                    isBowls = true;
                    for (int i = 1; i < arrayCats.length + 1; i+=2) {
                        if (!isBowl(i)) {
                            isBowls = false;
                            break;
                        }
                    }
                    if (isBowls) {
                        for (int i = 1; i < arrayCats.length + 1; i+=2) {
                            putPackage(i);
                        }
                    }
                    break;
            }
        }
    }

    public static void adOrRemove() {
        //метод определяет добавлять пакет или убирать
        int anser = 0;
        do {
            System.out.println("Добавить пакет? (1/0)");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не целое число");
                sc.next();
            }
            anser = sc.nextInt();
        } while (anser < 0 | anser > 1);
        numberOfPackage = anser == 1 ? 1 : -1;
        return;
    }

    public static boolean isBowl(int numberCat) {
        //метод проверяет миски
        int bowl = Integer.parseInt(arrayCats[numberCat - 1][1]) + numberOfPackage;
        if (bowl > 7) {
            System.out.println("\n\nУ кота с именем \"" + arrayCats[numberCat - 1][0] + "\" миска УЖЕ ПОЛНА!");
            return false;
        }
        if (bowl < 0) {
            System.out.println("\n\nУ кота с именем \"" + arrayCats[numberCat - 1][0] + "\" миска УЖЕ ПУСТА!");
            return false;
        }
        return true;
    }

    public static void putPackage(int numberCat) {
        //метод добавляет/убирает пакеты
        int bowl = Integer.parseInt(arrayCats[numberCat - 1][1]) + numberOfPackage;
        arrayCats[numberCat - 1][1] = String.valueOf(bowl);
    }
}
