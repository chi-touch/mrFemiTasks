package africa.semicolon.Chapter15.streamOfObject;

import java.util.stream.IntStream;

public class StreamExample2 {
    public static void main(String[] args) {
//        for (int number = 1; number <11 ; number++) {
////            if (number %2 ==0) System.out.println(number);
////
////        }
        //instead of using for loop

        IntStream.rangeClosed(1,10)
                .filter((number) ->number%2 ==0)
                .forEach(System.out::println);

        //this is for add method
        IntStream.rangeClosed(1,10)
                .filter((number) ->number%2 ==0)
                .sum();


//
    }
}
