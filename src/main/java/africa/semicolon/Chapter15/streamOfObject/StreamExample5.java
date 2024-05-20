package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY","ASDFG","ABCDEFF","ABC");
        numbers.stream()//["QWERTY","ASDFG","ABCDEFF","ABC"]
                .map((word)->word.length())//[6,5,7,3]
                .forEach(System.out::println);
    }
}
