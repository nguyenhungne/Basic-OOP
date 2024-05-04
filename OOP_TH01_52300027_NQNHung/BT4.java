public class BT4 {
    public static int countElement(int arr[], int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5, 3, 3, 3};

        System.out.println(countElement(arrayTest, 3));
    }
}
