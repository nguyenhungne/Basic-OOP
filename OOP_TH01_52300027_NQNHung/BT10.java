public class BT10 {
    public static int findThirdLagest(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            } else if (i > secondMax) {
                thirdMax = secondMax;
                secondMax = i;
            } else if (i > thirdMax) {
                thirdMax = i;
            }
        }

        return thirdMax;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5};

        System.out.println(findThirdLagest(arrayTest));
    }
}
