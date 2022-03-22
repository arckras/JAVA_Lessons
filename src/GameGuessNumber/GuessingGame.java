package GameGuessNumber;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int lowLimit = 0;
        int upperLimit = 100;
        int numberOfAttempts = 10;
        int randomNumber = (int) (Math.random() * 100 + 1);
        int userInput;
        boolean isGuess = true;

        for (int i = 1; i <= numberOfAttempts; ++i) {

            System.out.println("Попытка № " + i + " из " + numberOfAttempts);
            System.out.println("Угадай число от " + lowLimit + " до " + upperLimit + " ");

            userInput = integerScanner();

            if (userInput <= lowLimit | userInput >= upperLimit) {
                System.out.println("\nЧисло вне диапазона!");
            } else {
                if (userInput < randomNumber) {
                    System.out.println("\nЗагадано большее число");
                    lowLimit = userInput;
                } else if (userInput > randomNumber) {
                    System.out.println("\nЗагаданно меньшее число");
                    upperLimit = userInput;
                } else if (userInput == randomNumber) {
                    System.out.println("\nУРА!!! Вы угадали");
                    isGuess = false;
                    break;
                }
            }
        }
        if (isGuess) System.out.println("УВЫ, Нужна другая стратегия");
    }

    private static int integerScanner() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
            sc.next();
        }
        return sc.nextInt();
    }
}
