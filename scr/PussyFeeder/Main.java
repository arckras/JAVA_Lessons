package PussyFeeder;

import java.util.Scanner;

public class Main {

    static String arrayCats[][] = {{"Чёрный", "1"}, {"Белый", "2"}, {"Серый", "3"}, {"Полосатый", "6"},
            {"Чужой", "7"}};
    static int positiveOrNegativeCatPackage;

    public static void main(String args[]) {

        int choiceActions;
        final int MAXACTIONS = 4;
        int choiceCat;

        for (; ; ) {
            do {
                for (int i = 0; i < arrayCats.length; i++) {
                    int countCat = i + 1;
                    System.out.printf("\n  " + countCat + ". %-9s кот - %s (пакетов)", arrayCats[i]);
                }
                System.out.println("\n\nМеню:");
                System.out.println("  1. Добавить/Убрать пакет ... коту");
                System.out.println("  2. Добавить/Убрать пакет всем котам");
                System.out.println("  3. Добавить/Убрать пакет нечетным котам");
                System.out.println("  4. Добавить/Убрать пакет четным котам");
                System.out.print("Выберите цифру (666 - выход): ");

                choiceActions = (char) intScanner();
            } while (choiceActions < 1 | choiceActions > MAXACTIONS & choiceActions != 666);

            if (choiceActions == 666) break;

            switch (choiceActions) {
                case 1:
                    adOrRemovePackage();
                    System.out.print("Выберите номер кота ");
                    choiceCat = intScanner();
                    if (isTheBowlReady(choiceCat)) putPackageInBowl(choiceCat);
                    break;
                case 2:
                    putPackageInBowls(1, true);
                    break;
                case 3:
                    putPackageInBowls(1, false);
                    break;
                case 4:
                    putPackageInBowls(2, false);
                    break;
            }
        }
    }

    private static int intScanner() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
            sc.next();
        }
        return sc.nextInt();
    }

    private static void adOrRemovePackage() {
        int anser = 0;
        do {
            System.out.print("Добавить пакет? (1/0) ");
            anser = intScanner();
        } while (anser < 0 | anser > 1);
        positiveOrNegativeCatPackage = anser == 1 ? 1 : -1;
    }

    private static boolean isTheBowlReady(int numberCat) {
        int bowl = Integer.parseInt(arrayCats[numberCat - 1][1]) + positiveOrNegativeCatPackage;
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

    private static void putPackageInBowl(int numberCat) {
        int bowl = Integer.parseInt(arrayCats[numberCat - 1][1]) + positiveOrNegativeCatPackage;
        arrayCats[numberCat - 1][1] = String.valueOf(bowl);
    }

    private static void putPackageInBowls(int initCountFor, boolean allBowls) {
        boolean isBowlsReady = true;
        int i;
        adOrRemovePackage();
        for (i = initCountFor; i < arrayCats.length + 1; ) {
            if (!isTheBowlReady(i)) {
                isBowlsReady = false;
                break;
            }
            if (allBowls == true) {i++;} else {i += 2;}
        }
        if (isBowlsReady) {

            for (i = initCountFor; i < arrayCats.length + 1; ) {
                putPackageInBowl(i);
                if (allBowls == true) {i++;} else {i += 2;}
            }
        }
    }
}