import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalEx {
    public static void main(String[] args) {

        var val1 = new BigDecimal("3.44");
        var val2 = new BigDecimal("2.74");

        BigDecimal res1 = val1.add(val2);
        System.out.println(res1);

        BigDecimal res2 = val1.subtract(val2);
        System.out.println(res2);

        BigDecimal res3 = val1.multiply(val2);
        System.out.println(res3);

        BigDecimal res4 = val1.divide(BigDecimal.ONE.divide(BigDecimal.TEN), RoundingMode.UP);
        System.out.println(res4);

        BigDecimal res5 = val1.divide(val2, 4, RoundingMode.DOWN);
        System.out.println(res5);
    }
}
