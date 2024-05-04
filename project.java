public class project {
    public static int findArray(int arr[], int n) {
        for (int x : arr) {
            if (x == n) {
                return 1;
            }
        }

        return -1;
    }

    // public static void squareArray(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = arr[i] * arr[i];
    //     }

    // }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        System.out.println(findArray(arrayTest, 3));
        System.out.println(findArray(arrayTest, 0));
    }
}
