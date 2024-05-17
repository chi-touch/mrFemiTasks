package africa.semicolon.chapter17;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (decimalNumber)-> Double.valueOf(decimalNumber).intValue();
        int number = doubleToIntFunction.applyAsInt(20.88);
        System.out.println(number);
    }
}
