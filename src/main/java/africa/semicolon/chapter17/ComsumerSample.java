package africa.semicolon.chapter17;

import java.util.List;
import java.util.function.Consumer;

public class ComsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) ->{
            System.out.println("you have entered "+s);
            System.out.println("I am printing" +s);

        };
        List<String> names = List.of("john","joe","johnny");
        names.forEach(consumer);


    }
}
