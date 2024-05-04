class BT1_lab5_Array {
    public static void main (String args[]) {

    }

    public static int maxEven(int[] array) {
        int max = -999999;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minOdd(int[] array) {
        int min = 999999;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sumMEMO(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
    
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] < minOdd) {
                minOdd = array[i];
            } else if (array[i] % 2 == 0 && array[i] > maxEven) {
                maxEven = array[i];
            }
        }
    
        if (minOdd == Integer.MAX_VALUE || maxEven == Integer.MIN_VALUE) {
            return 0;
        }
    
        return minOdd + maxEven;
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                prod *= a[i];
            }
        }
        return prod;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int[] a)  {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] input(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

}