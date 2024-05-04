public class BT9 {
    public static int[] divisibleNumbers(int arr[], int k) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                result[index++] = arr[i];
            }
        }
        
        return result;
    }
}