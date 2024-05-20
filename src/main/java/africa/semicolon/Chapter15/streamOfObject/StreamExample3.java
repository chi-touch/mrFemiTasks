package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,25,30,40,50);

        numbers.stream()//[10,20,30,40,50]
                .filter((numb)-> numb%2!=0)
                //.forEach((numb)->System.out.println(numb)); or use methodReference to ensure that it applies to every method in the streamOfObject. when the lambda parameter is the same with what you are passing through the streamOfObject. the filterExpression takes in the predicate it takes out the element of the strings tht return false
                .forEach(System.out::println);
    }
}
