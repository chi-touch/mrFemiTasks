package africa.semicolon.Chapter15.streamOfObject;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

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
                .collect(toMap((codePoint)->codePoint,
                        Character::toString));

    }

    public static Map<Integer, String> mapCodePointToCharacterMergeFunction(List<Integer> codePoints) {
        return codePoints.stream()
                .collect(toMap((codePoint)->codePoint,
                        Character::toString,(a,b)->b));

    }

    public static Map<Integer, String> mapCodePointToCharacterTakesThreeThings(List<Integer> codePoints) {
        return codePoints.stream()
                .collect(toMap((codePoint)->codePoint,
                        Character::toString,(a,b)->b,()->new Hashtable<>()));

    }


    public static String getNumbersFormatted(List<Integer> numbers) {
        return numbers.stream()
                .map((number)->number+"")
                .collect(Collectors.joining(",","[","]"));
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("spining...");
        for (int count = 0; count < 3; count++) {
            Thread.sleep(300);
            if (count ==2) System.out.println(new SecureRandom());


        }
    }
}
