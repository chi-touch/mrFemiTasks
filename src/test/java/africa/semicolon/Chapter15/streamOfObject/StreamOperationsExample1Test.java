package africa.semicolon.Chapter15.streamOfObject;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;



import static africa.semicolon.Chapter15.streamOfObject.StreamOperationsExample1.*;
import static org.junit.jupiter.api.Assertions.*;

public class StreamOperationsExample1Test {

    @Test
    public void testGetEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = getEvenNumbersOf(numbers);
        System.out.printf("even numbers of:%s are %s", numbers, evenNumbers);

        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());
    }

    @Test
    public void testGetEvenNumbersWithCollection() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var evenNumbers = getEvenNumbers(number);
        System.out.printf("even numbers of:%s are %s", number, evenNumbers);

        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());
    }


    @Test
    public void testMapCodePointToCharacter() {
        List<Integer> numbers = List.of(65, 97, 98, 66, 69, 48);
        Map<Integer, String> map = mapCodePointToCharacter(numbers);

        Map<Integer, String> expected =
                Map.of(
                        65, "A",
                        97, "a",
                        98, "b",
                        66, "B",
                        69, "E",
                        48, "0");

        assertNotNull(map);
        System.out.println(map);
        assertEquals(expected, map);
    }

    @Test
    public void testMapCodePointToCharacterMerge() {
        List<Integer> numbers = List.of(65,97, 97, 98, 66, 69, 48);
        Map<Integer, String> map = mapCodePointToCharacterMergeFunction(numbers);

        Map<Integer, String> expected =
                Map.of(
                        65, "A",
                        97, "a",
                        98, "b",
                        66, "B",
                        69, "E",
                        48, "0");

        assertNotNull(map);
        System.out.println(map);
        assertEquals(expected, map);
    }

    @Test
    public void testMapCodePointToCharacterThreeThings() {
        List<Integer> numbers = List.of(65,97, 97, 98, 66, 69, 48);
        Map<Integer, String> map = mapCodePointToCharacterTakesThreeThings(numbers);

        Map<Integer, String> expected =
                Map.of(
                        65, "A",
                        97, "a",
                        98, "b",
                        66, "B",
                        69, "E",
                        48, "0");

        assertNotNull(map);
        System.out.println(map);
        assertEquals(expected, map);
    }

    @Test
    public void testGetNumbersFormatted(){
        List<Integer> numbers = List.of(1,2,2,3,4,4,5,6,7,8,9,10);
        String  result = StreamOperationsExample1.getNumbersFormatted(numbers);
        String expected = "[1,2,2,3,4,4,5,6,7,8,9,10]";
        assertNotNull(result);
        System.out.println(result);
        assertTrue(result.startsWith("["));
        assertTrue(result.endsWith("]"));
        assertEquals(expected,result);
    }
}


