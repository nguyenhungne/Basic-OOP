public class BT2 {
    public static int findMin(int array[]) {
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        System.out.println(findMin(arrayTest));
    }
}
