package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample13 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50,60);

        double average =numbers.stream().flatMapToInt((element)-> IntStream.of(element*2))
                .average().orElseThrow(()->new RuntimeException(("number not present")));
        System.out.println(average);

    }
}
