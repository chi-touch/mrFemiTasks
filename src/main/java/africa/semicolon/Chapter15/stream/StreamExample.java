package africa.semicolon.Chapter15.stream;

import africa.semicolon.Chapter15.classWork.Transaction;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20,30,40,50);

        Stream<Integer> stream = numbers.stream();//[20,30,40,50] forEach takws each number and work on it

        stream.forEach((number) -> System.out.println(number));


        Stream<String> emptyStream = Stream.empty();

        Stream<Transaction> transactionStream = Stream.of(new Transaction("$100","12345"),
                new Transaction("$1000","23456"));
       transactionStream.forEach((transaction)-> System.out.printf("account with id%s has %s in it\n",
               transaction.getAccountNumber(),
               transaction.getAmount()));

        Stream<Integer> integerStream = Stream.generate(() ->new SecureRandom().nextInt());
        integerStream.forEach(System.out::println);
    }
}
