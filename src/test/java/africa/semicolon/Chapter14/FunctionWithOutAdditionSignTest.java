package africa.semicolon.Chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionWithOutAdditionSignTest {

    @Test
    public void testToAddTwoNumbers(){
        int qust = 2;
        int qust2 = 3;
        int result = 5;
        assertEquals(5,FunctionWithOutAdditionSign.withOutAdditionOperator(qust,qust2));
    }

//    @Test
//    public void testToAddTwoNegativeNumbers(){
//        int qust = -2;
//        int qust2 = 3;
//        int result = -2^ 3;
//        assertEquals(1,FunctionWithOutAdditionSign.additionOfANegativeNumbers(qust,qust2));
//    }




}