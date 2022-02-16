import sun.plugin.dom.exception.BrowserNotSupportedException;

public class Main {

    public static void main(String[] args) {
        System.out.println("---Выводим год с 1980 по 1985---");
        int year = 1980;

        for (int i = 0; i < 6; ++i) {
            System.out.println("Год " + year++);
        }

        System.out.println("");
        System.out.println("---Выводим значения ячеек массива оператором for---");
        int[] array = new int[]{1, 2, 3, 4, 5};
        array[3] = 67;

        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }

        System.out.println("");
        System.out.println("---Выводим значения ячеек массива оператором foreach---");
        array[3] = 68;

        for (int row : array) {
            System.out.println(row);
        }
        System.out.println(""); 
    }
}
