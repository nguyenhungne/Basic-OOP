import java.math.BigDecimal;

public class BT8 {
    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }    
}
