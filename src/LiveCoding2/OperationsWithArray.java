package LiveCoding2;

import java.util.Scanner;

public class OperationsWithArray {
    static int array[] = new int[0];

    public static void main(String[] args) {

        int choiceActions;
        final int MAXACTIONS = 6;

        if (array.length == 0) {
            System.out.println("\nМассив пуст. Необходимо его заполнить.");
            getArray();
        }

        for (; ; ) {
            do {
                System.out.println("\n\nМеню:");
                System.out.println("  1. Ввести массив чисел");
                System.out.println("  2. Вывести массив чисел");
                System.out.println("  3. Изменить элемент массива");
                System.out.println("  4. Удалить элемент массива");
                System.out.println("  5. Добавить элемент массива");
                System.out.println("  6. Заполнить массив числом");
                System.out.print("Выберите цифру (" + (MAXACTIONS + 1) + " - выход): ");

                choiceActions = intScanner();
            } while (choiceActions < 1 | choiceActions > MAXACTIONS & choiceActions != (MAXACTIONS + 1));

            if (choiceActions == (MAXACTIONS + 1)) break;

            switch (choiceActions) {
                case 1:
                    getArray();
                    break;
                case 2:
                    printArray(array);
                    break;
                case 3:
                    changeArrayElement();
                    break;
                case 4:
                    deleteArrayElement();
                    break;
                case 5:
                    addArrayElement();
                    break;
                case 6:
                    fillArrayWithNumber();
                    break;
            }
        }
    }

    private static void getArray() {
        System.out.print("\nВведите размер массива: ");
        array = new int[intScanner()];
        int i = 0;

        for (int element : array) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = intScanner();
            i++;
        }
    }

    private static void printArray(int array[]) {
        System.out.print("\nЗначения:  ");
        for (int i : array) {
            System.out.printf("%2d  ", i);
        }
    }

    private static void changeArrayElement() {
        System.out.print("\nИндекс:    ");
        for (int i = 1; i < array.length + 1; i++) System.out.printf("[%d] ", i);
        printArray(array);

        System.out.print("\nВведите индекс элемента для изменения: ");
        int temp = intScanner();
        System.out.print("Введите новое значение: ");
        array[temp - 1] = intScanner();

        System.out.print("\nИндекс:    ");
        for (int i = 1; i < array.length + 1; i++) System.out.printf("[%d] ", i);
        printArray(array);
    }

    private static void deleteArrayElement() {
        System.out.print("\nИндекс:    ");
        for (int i = 1; i < array.length + 1; i++) System.out.printf("[%d] ", i);
        printArray(array);

        System.out.print("\nВведите индекс элемента для удаления: ");
        int temp = intScanner() - 1;
        int tempArray[] = new int[array.length - 1];
        for (int i = 0, j = 0; i < tempArray.length; i++, j++) {
            if (i == temp) i++;
            tempArray[j] = array[i];
        }

        array = tempArray;

        System.out.print("\nИндекс:    ");
        for (int i = 1; i < array.length + 1; i++) System.out.printf("[%d] ", i);
        printArray(array);
    }

    private static void addArrayElement() {
        //    System.out.print("\nИндекс:    ");
        //    for (int i = 1; i < array.length + 1; i++) System.out.printf("[%d] ", i);
        printArray(array);

        System.out.print("\nВведите добавляемое значение: ");
        int temp = intScanner() ;
        int tempArray[] = new int[array.length + 1];
        int i;
        for (i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        tempArray[i ] = temp;
        array = tempArray;
        printArray(array);
    }

    private static void fillArrayWithNumber() {
        System.out.print("\nВведите число для заполнения: ");
        int temp = intScanner();
        for (int i = 0; i < array.length; i++) {
            array[i] = temp;
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
}