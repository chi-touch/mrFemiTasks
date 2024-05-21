package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExampleStringToInteger10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,7,1,2,4,9,7,3,8,9,5,6);

        numbers.stream()//[10,4,7,1,2,4,9,7,3,8,9,5,6]
                .map((number)->String.format("number = %d", number))//[number = 10]
                .forEach(System.out::println);
    }
}
