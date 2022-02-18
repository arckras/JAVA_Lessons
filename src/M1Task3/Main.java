package M1Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0, value, max, temp;

        System.out.print("\nВведите количество продуктов: ");
        value = new Scanner(System.in).nextInt();

        max = value;
        do {
            temp = combinations(value, max);
            result = result + temp;
            value--;
        } while (value > 1);

        System.out.println("Число блюд = " + result);
    }

    public static int combinations(int k, int n) {
        return placements(k, n) / factorial(k);
    }

    public static int placements(int k, int n) {
        return factorial(n) / factorial(n - k);
    }

    public static int factorial(int a) {
        if (a == 0 || a == 1) return 1;
        else {
            int fact = 1;
            for (int i = 2; i <= a; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}
