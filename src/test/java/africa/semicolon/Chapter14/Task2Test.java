package africa.semicolon.Chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void testToReverseASentence(){
       String word = "It is still a beautiful world";
       String expect = "world beautiful a still is It";

        assertEquals(expect,Task2.reverseSentence(word));
    }

}