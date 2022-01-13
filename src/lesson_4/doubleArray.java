public class doubleArray {
    public doubleArray() {
    }

    public static void main(String[] args) {
        System.out.println("---Выводим суммы двух первых ячеек двумерного массива---");
        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);

        System.out.println("---Выводим матрицу массива оператором for---");
        for ( int i = 0; i < array.length; i++) {
            if (i != 0) {System.out.println();}
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
        }

        System.out.println("\n\n---Выводим матрицу массива оператором foreach---");
        int counter = 0;
        for (int Row[]: array) {
            if (counter != 0) {System.out.println();}
            for (int Column:Row) {
                System.out.printf("%3d",Column);
                counter++;
            }
        }
    }
}
