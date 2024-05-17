package africa.semicolon.Chapter15.classWork;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

import static africa.semicolon.Chapter15.classWork.Type.DEBIT;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassWorkTest {

    @Test
    void testToCalculate() throws IOException {
        String expected = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\Trasaction.Json";
        //String expected ="C:\\Users\\User\\Desktop\\Trasaction.Json";
        int total = 4000;
        assertEquals(total, ClassWork.calculate(expected));
    }

    @Test
    void testToWord(){
        String  expected = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\classSample.txt";
        int digit = 2;
        assertEquals(digit, ClassWork.toWord(expected));

    }

    @Test
    void testToGetLetters() throws IOException {
        String myWord = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\classSample.txt";
        int digit2 = 2;
        assertEquals(digit2, ClassWork.toGetLetters(myWord));
    }

}