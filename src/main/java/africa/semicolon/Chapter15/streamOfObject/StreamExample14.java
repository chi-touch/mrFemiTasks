package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample14 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50,60);

        System.out.println(numbers.stream()
                .flatMapToInt((element)->IntStream.of(element *2))
                .summaryStatistics());

        //Note: it return all the five elements form the summary statistics that is su,ave,max,min.to get the any one u write summaryStatistics.getSum
    }
}
