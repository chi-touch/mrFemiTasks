package africa.semicolon.Chapter15.stream;

import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20,30,40,50);

        Stream<Integer> stream = numbers.stream();//[20,30,40,50] forEach takws each number and work on it

        stream.forEach((number) -> System.out.println(number));
    }
}
