package africa.semicolon;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void  testToGetHighest(){
        int[] numbers = {-1,2};
        assertEquals(-2,Task1.highest(numbers));

    }

    @Test
    public void  testToGetHighest2(){
        int[] numbers = {1, -5, 10, -14, 0};
        assertEquals(70,Task1.highest(numbers));

    }

    @Test
    public void  testToGetHighest3(){
        int[] numbers = {1};
        assertEquals(0,Task1.highest(numbers));

    }

    @Test
    public void  testToGetHighest4(){
        int[] numbers = {};
        assertEquals(0,Task1.highest(numbers));

    }
}