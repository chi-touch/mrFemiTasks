package africa.semicolon.chapter17;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {

    public static void main(String[] args) {
        BinaryOperator<Double> binaryOperator = (number,num)-> number / num;
        System.out.println(binaryOperator.apply(5.0,10.0));
    }
}
