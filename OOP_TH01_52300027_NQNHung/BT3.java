public class BT3 {
    public int sumArray(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        BT3 bt3 = new BT3();
        System.out.println(bt3.sumArray(arrayTest));
    }
}
