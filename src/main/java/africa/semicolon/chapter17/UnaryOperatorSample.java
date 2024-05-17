package africa.semicolon.chapter17;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (melody)->melody + " whooped micheal";
        System.out.println(unaryOperator.apply("Melody"));
    }
}
