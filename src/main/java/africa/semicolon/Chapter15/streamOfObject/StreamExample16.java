package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample16 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);

        numbers = numbers.stream()
                        .limit(2)
                        .toList();
        System.out.println(numbers);

        //Note: it first pull just any number of element u want to pull from it. u use limit to control the numbers of element collected from the stream
    }
}
