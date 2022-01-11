package lesson_4;

public class doubleArray {

    public static void main(String[] args) {
        System.out.println("---Вывод суммы значений ячеек двумерного массива---");
        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);

        System.out.println("\n---Вывод массива циклом For---");
        int i, j;
        for(i = 0; i < array.length; i++) {
            if (i != 0)  {System.out.println();}
            for(j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
        }

        System.out.println("\n\n---Вывод массива циклом ForEach---");
        i = 0;
        for (int item []: array) {
            if (i!=0) {System.out.println();}
            for (int data: item) {
                System.out.printf("%3d", data);
                i++;
            }
        }
    }
}