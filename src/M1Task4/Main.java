/*
Вывести профессию и имя самого взрослого члена Колхоза "Междуработники" села Махнево.

В первой строке - целое число N, обозначающее количество людей. Далее следуют N строк, в каждой из которых указаны
 имя, профессия и возраст (ЧЕРЕЗ ПРОБЕЛ).

Пример:
3
John Mechanic 18
Mark Chairman 45
Ivan Trucker 30

Выод
"Chairman Mark is the eldest."
 */

package M1Task4;

public class Main {
    public static void main(String[] args) {
        String humanVillageMahneevo[][] = {
                {"John", "Mechanic", "18"},
                {"Mark", "Chairman", "45"},
                {"Ivan", "Trusker", "30"},
                {"Иван", "Дурак", "98"}
        };

        int age = 0, row = 0, temp = 0;
        for (int i = 0; i < humanVillageMahneevo.length; i++) {
            temp = Integer.parseInt(humanVillageMahneevo[i][2]);
            if (temp > age) {
                age = temp;
                row = i;
            }
        }
        System.out.println(humanVillageMahneevo[row][0]+ " " + humanVillageMahneevo[row][1] + " is the eldest.");
    }
}