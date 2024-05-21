package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExample7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

       System.out.println(numbers.stream()
                .reduce(0,(identity,element)-> identity + element));


    }
}
