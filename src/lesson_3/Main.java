package lesson_3;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        System.out.println("\n---оператор switch---");
        switch(num) {
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }

        System.out.println("\n---оператор if/else---");
        if (num == 1) {
            System.out.println("Число равно 1");
        } else if (num == 8) {
            ++num;
        } else {
            System.out.println("Число не равно 1, 8, 9");
        }

        System.out.println("\n---оператор if/else - через быстрые операторы---");
        comparisonsOperators(num);
        System.out.println("\n---оператор loops - счёт до ста---");
        loops();
        System.out.println("\n---оператор while - високосный год---");

        for(int year = 85; year >= 0; --year) {
            if (year % 4 == 0) {
                System.out.println("Високосный год: " + year);
            }
        }

        System.out.println("\n---тернарный оператор - краткая нотация---");
        System.out.println("возвращет " + magic(num));
    }

    public static void comparisonsOperators(int num) {
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8, 9");
        } else {
            System.out.println("Число равно 1, 8 или 9");
        }

        if (num != 0 && num != 1) {
            System.out.println("Число не равно ни 1, ни 0");
        } else {
            System.out.println("Число равно 1 или 0");
        }

    }

    public static void loops() {
        for(int counter = 1; counter <= 100; ++counter) {
            System.out.println(counter);
        }

    }

    public static int magic(int x) {
        return x == 10 ? 1 : 0;
    }
}
