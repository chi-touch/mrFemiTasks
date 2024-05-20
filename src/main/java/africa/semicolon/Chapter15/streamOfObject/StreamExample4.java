package africa.semicolon.Chapter15.streamOfObject;

import africa.semicolon.Chapter15.classWork.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Transaction> numbers = List.of(new Transaction("$2000","12345"),
                                 new Transaction("$1000","98769"),
                                 new Transaction("$100","24689"));


//        numbers.stream()//[{"$2000","12345"},{"$1000","98769"},{"$100","24689"}]
//                .filter((transaction)->new BigDecimal(transaction.getAmount().
//                        .substring(1))
//                        .compareTo(new BigDecimal(100))<=0)
//                .forEach(System.out::println);




    }
}
