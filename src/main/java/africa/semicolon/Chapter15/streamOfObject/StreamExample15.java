package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;
import java.util.stream.IntStream;

public class StreamExample15 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);

        var stats = (numbers.stream()
                .flatMapToInt((element)->IntStream.of(element *2))
                .summaryStatistics());
        System.out.println(stats);
        stats.accept(10);
        System.out.println(stats);

        //Note: it return all the five elements form the summary statistics that is su,ave,max,min.to get the any one u write summaryStatistics.getSum
    }
}
