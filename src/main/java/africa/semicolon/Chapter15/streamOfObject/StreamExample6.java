package africa.semicolon.Chapter15.streamOfObject;

import java.util.stream.IntStream;

public class StreamExample6 {
    public static void main(String[] args) {
        String word ="Hello";

//        IntStream intStream = word.chars();
//        intStream.forEach(System.out::println);

        //or

       Boolean result = word.chars()
                .filter((numbers) -> numbers>100)
                .mapToObj((numbers) -> Boolean.TRUE)
                .reduce(false, (a,b) ->a !=b);

        System.out.println(result);

    }
}
