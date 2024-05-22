package africa.semicolon.Chapter17Examples;

import java.util.stream.IntStream;

public class SumingAndFilteringStream {
    public static void main(String[] args) {
        System.out.printf(
                "Sum of the triples of the even numbers is: %d%n",
                IntStream.rangeClosed(1,10)
                        .filter(x->x%2 ==0)
                        .map(x->x*3).sum());
    }
}
