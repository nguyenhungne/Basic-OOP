public class BT1 {
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        System.out.println(findMax(arrayTest));
    }
}