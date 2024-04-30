package africa.semicolon.Chapter14;

public class FunctionWithOutAdditionSign {


    public static int withOutAdditionOperator(int value, int value2) {
        if(value2 == 0)return value;
        int sum = value ^ value2;
        int result1 = (value & value2)<<1;
        return  sum ^ result1;
    }

//    public static int additionOfANegativeNumbers(int qust, int qust2) {
//        if ()
//    }
}
