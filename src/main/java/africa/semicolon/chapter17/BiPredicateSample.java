package africa.semicolon.chapter17;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate =(me, you)-> me.length() ==you.length();
        System.out.println(biPredicate.test("Melody", "mavellous"));

    }
}
