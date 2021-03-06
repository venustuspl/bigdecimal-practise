import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalEx {
    public static void main(String[] args) {
        // simple operations
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

        //precision
        double a = 0.1 + 0.1 + 0.1;
        double b = 0.3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        var c = new BigDecimal("0.1").add(new BigDecimal("0.1"))
                .add(new BigDecimal("0.1"));
        var d = new BigDecimal("0.3");

        System.out.println(c);
        System.out.println(d);
        System.out.println(c.equals(d));

        //rounding
        var x = new BigDecimal("5.54");
        BigDecimal x2 = x.setScale(1, RoundingMode.FLOOR);
        System.out.println(x2);

        var y = new BigDecimal("5.94");
        BigDecimal y2 = y.setScale(1, RoundingMode.CEILING);
        System.out.println(y2);

        //compare
        Double valA = 123.000;
        Double valB = 123.0;
        System.out.println("Object compare result: " + valA.compareTo(valB));
        System.out.println("Object equals result: " + valA.equals(valB));
        var z = new BigDecimal("1.6");
        var w = new BigDecimal("1.60");

        System.out.println(z.equals(w));
        System.out.println(z.compareTo(w));

        // create 2 BigDecimal objects
        BigDecimal bg1, bg2;

        bg1 = new BigDecimal("10");
        bg2 = new BigDecimal("10.0");

        //create int object
        int res;

        res = bg1.compareTo(bg2); // compare bg1 with bg2
        System.out.println(bg1.equals(bg2));

        String str1 = "Both values are equal ";
        String str2 = "First Value is greater ";
        String str3 = "Second value is greater";

        if (res == 0)
            System.out.println(str1);
        else if (res == 1)
            System.out.println(str2);
        else if (res == -1)
            System.out.println(str3);

        //compareTo() gives the ordering of objects, used typically in sorting objects in ascending or descending order while equals() will only talk about the equality and say whether they are equal or not.
        //"myString".compareTo(null);  //Throws java.lang.NullPointerException
        //"myString".equals(null);     //Returns false
    }
}
