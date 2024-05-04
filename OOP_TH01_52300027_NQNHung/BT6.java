public class BT6 {
    public static int find(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        System.out.println(find(arrayTest, 3));
    }
}
