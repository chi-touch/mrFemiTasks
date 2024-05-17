package africa.semicolon.chapter17;

import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args) {
        //it works with two generic type the argument it takes and the what it returns

        Function<String, Integer> function = (word)-> word.length();

        //u can remove the parenthesis in the word when there is two argument
        //Function<String, Integer> function = word-> word.length();
        System.out.println(function.apply("Jagaban"));
    }
}
