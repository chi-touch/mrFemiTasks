package africa.semicolon.Chapter15.classWork;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
    void testToGetLetters() throws IOException {
        String myWord = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\classSample.txt";
        int digit2 = 2;
        assertEquals(digit2, ClassWork.toGetLetters(myWord));
    }

    @Test
    void  testTransaction() throws IOException {
        String location = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\Trasaction.Json";
        BigDecimal expected = new BigDecimal("4000");
        assertEquals(expected, ClassWork.totalTransactions(location));
    }

    @Test
    void testToWord(){
        String  expected = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\classSample.txt";
        int digit = 2;
        assertEquals(digit, ClassWork.toWord(expected));

    }



    @Test
    void testThatTakesADate() throws IOException {
      List<Transaction> expected = ClassWork.daily(LocalDate.of(2024,5,1));
      assertEquals(2,expected.size());
    }




    @Test
    public void testForTwoDate() throws IOException {
      List<Transaction> expected = ClassWork.getTwoDate(LocalDate.of(2024,6,17), LocalDate.of(2024,6,17));
      assertEquals(2,expected.size());
    }


//    @Test
//    public void testToGetTheAverageTransactionAmountForSpecifiedPeriod() throws IOException {
//        double expected = ClassWork.averageTransaction(LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7));
//        assertEquals(5000.0, expected, 0.0);
//
//    }
//
//    @Test
//    public void testToGetAccountNumberAndAccountSummery() throws IOException {
//        AccountSummary accountSummary = ClassWork.getAccountSummary("12345678", LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 7));
//        assertEquals("12345678", accountSummary.getAccountNumber());
//
//        double expectedBalance = 10000.0;
//        assertEquals(expectedBalance, accountSummary.getBalance(), 0.001);
//        String expectedSummary = "Account Number: 12345678\nBalance: " + expectedBalance;
//        assertEquals(expectedSummary, accountSummary.getAccountSummary());
//    }


}