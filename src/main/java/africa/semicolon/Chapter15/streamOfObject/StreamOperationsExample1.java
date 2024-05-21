package africa.semicolon.Chapter15.streamOfObject;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperationsExample1 {
    public static  List<Integer> getEvenNumbersOf(List<Integer>numbers){
        return numbers.stream()
                .filter((number)->number%2 !=0)
                .collect(Collectors.toList());
    }

    //collect is an stream api. By using class Collector to tell the collect the type of data structure,type of collection to collect


    public static Collection<Integer> getEvenNumbers(List<Integer>numbers){
        return numbers.stream()
                .filter((number)->number%2 !=0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints) {
        return codePoints.stream()
                .collect(Collectors.toMap((codePoint)->codePoint,
                        Character::toString));

    }

}
