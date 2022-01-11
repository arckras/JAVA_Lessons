
package lesson_4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("---Выводим год с 1980 по 1985---");
        int year = 1980;

        for(int j = 0; j < 6; ++j) {
            System.out.println("Год " + year++);
        }

        System.out.println("");
        System.out.println("---Выводим значения ячеек массива оператором for---");
        int[] araiV1 = new int[]{1, 2, 3, 4, 5};
        araiV1[3] = 67;

        for(int j = 0; j < araiV1.length; ++j) {
            System.out.println(araiV1[j]);
        }

        System.out.println("");
        System.out.println("---Выводим значения ячеек массива оператором foreach---");
        araiV1[3] = 68;
        for(int item: araiV1){
            System.out.println(item);
        }
    }
}