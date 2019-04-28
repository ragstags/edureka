/**
 * Created by nadimchouglay on 28/04/2019.
 */
public class LambdasPractice {

    interface NumericTest{
        boolean compute(int n);
    }

    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2==0);
        NumericTest isNegative = n -> (n<0);

        System.out.println(isEven.compute(6));
        System.out.println(isNegative.compute(-5));
    }
}
