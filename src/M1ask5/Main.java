/*
Банк берет комиссию за перевод по принципу - с каждой сотни рублей изымается комиссия - 7 рублей.
 За неполную сотню также изымается 7 рублей. К примеру, за перевод одного рубля придется выложить 1 + 7 = 8 рублей.
 За перевод 101 рубля придется выложить уже 100 + 7 + 1 + 7 = 115 рублей

Пользователь вводит сумму, которую хочет перевести, а программа должна определить:
1. Максимально возможную сумму перевода (с учетом, что комиссия за перевод будет браться из переводимой суммы).
2. Комиссию за данный перевод.

Тест 1.
Сумма к переводу: 10 рублей
Ответ
Максимальная сумма: 3 рубля
Комиссия: 7 рублей

Тест 2.
Сумма к переводу: 108 рублей
Ответ
Максимальная сумма: 100 рублей
Комиссия: 7 рублей

Подсказка: 1 рубль во втором случае не получится перевести, так как не хватит на комиссию. Этот рубль останется на счете отправителя.
 */
package M1Task5;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int transferredMoney, maxMoney = 0, commission = 0, BANKINTEREST = 7, restMoney;

        System.out.print("\nСумма к переводу: ");
        transferredMoney = intScanner();

        /*
                int a;
        int b = 0;//комиссия
        int c = 0;//сумма к переводу
        int d = 0;//остаток

        if (x % 100 == 0) {
            b = x / 100 * 7;
        } else {
            b = x / 100 * 7 + 7;
        }
        if (x % 100 < 8) {
            //a = (x%100 < 8);

        }
        c = x - b;


        if (transferredMoney % 100 == 0) {
            commission = transferredMoney / 100 * BANKINTEREST;
        } else {
            commission = transferredMoney / 100 * BANKINTEREST + BANKINTEREST;
        }

        maxMoney = transferredMoney - commission;
        restMoney = transferredMoney - maxMoney-commission;


         */
        restMoney = transferredMoney - BANKINTEREST;

        //if (restMoney >= BANKINTEREST && restMoney >= 100) {
/*
        while (restMoney > 0) {
            if (restMoney > 100 - BANKINTEREST) {

                maxMoney = transferredMoney - BANKINTEREST;
                commission += BANKINTEREST;

                if (transferredMoney - 100 - commission > BANKINTEREST) {
                    restMoney = transferredMoney - 100 - commission;
                } else {
                    restMoney = transferredMoney - 100 - commission;
                    break;
                }
            } else {
                maxMoney = transferredMoney - BANKINTEREST;
                commission += BANKINTEREST;
                restMoney = transferredMoney - maxMoney - commission;
            }

        }
        //break;
        //   else  {
        */
        if (transferredMoney > 100) {
            int temp = transferredMoney / 100;
            commission += BANKINTEREST;
            restMoney = transferredMoney % 100;
        }
        if (restMoney >= 1 && restMoney < 100) {
            commission += BANKINTEREST;
        }

        if (transferredMoney < BANKINTEREST)
            System.out.println("Недостаточно средств");
    }


        System.out.println("Максимальная сумма: "+maxMoney);
        System.out.println("Комиссия: "+commission);
        System.out.println("Остаток: "+restMoney);

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