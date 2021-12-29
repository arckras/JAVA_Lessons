package lesson_3;

public class Main {
    public static void main(String[] args) {

        int num = 0;

        //оператор switch
        System.out.println("\n---оператор switch---");
        switch (num) {
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
        //оператор if
        System.out.println("\n---оператор if---");
        if (num != 8 && num != 1 && num != 9) {
            System.out.println("Число не равно 1, 8, 9");
        } else System.out.println("Число равно 1, 8 или 9");

        if (num == 0 || num == 1) {
            System.out.println("Число равно 1 или 0");
        } else {
            System.out.println("Число не равно ни 1, ни 0");
        }

        //оператор loops - счёт до ста
        System.out.println("\n---оператор loops - счёт до ста---");
        loops ();

        //оператор while - високосный год
        System.out.println("\n---оператор while - високосный год---");
        int year = 85;                //текущий год, который мы сами выбрали
        while (year >= 0){
            if (year % 4 == 0){
                System.out.println("Високосный год: " + year);
            }
            year--;
        }

        //тернарный оператор - краткая запись
        System.out.println("\n---тернарный оператор - краткая запись---");
        System.out.println("возвращет " + magic (num));
    }

    public static void loops () {

        int counter = 1;
        while (counter < 100) {
            counter++;
            System.out.println(counter);
        }
    }

    public static int magic(int x){
        // if (x==10){
        //     return 1;
        // } else{
        //     return 0;
        // }
        return x == 10 ? 1 : 0;
        // До ? идёт условие (x==10)
        //“?” - это IF;
        //“:” - это ELSE
    }
}