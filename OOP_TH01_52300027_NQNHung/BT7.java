public class BT7 {
    public static void squareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        squareArray(arrayTest);

        for (int i = 0; i < arrayTest.length; i++) {
            System.out.print(arrayTest[i] + " ");
        }
    }
}
