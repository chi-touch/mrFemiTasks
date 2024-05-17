package africa.semicolon.chapter17;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
//        BiConsumer<String,String> biConsumer = (firstname,surname)->  System.out.println(firstname + " " + surname);
//            biConsumer.accept("femi","ola");
//        };
//
        BiConsumer<String,Integer> biConsumer = (firstname,age)->
                printFullName(firstname,age);
        biConsumer.accept("solomon",10);

        Map<String, Integer> map = Map.of(
                "john", 10,
                "san", 15,
                "Jason", 25
        );


    }

    private static void printFullName(String firstName, int age){
        System.out.println(firstName +" "+ age);
    }


}



