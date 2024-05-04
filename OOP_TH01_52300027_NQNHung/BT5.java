public class BT5 {
    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public static int countPrime(int arr[]) {
        int count = 0;

        for (int i : arr) {
            if (isPrime(i) == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(countPrime(arrayTest));
    }
}
