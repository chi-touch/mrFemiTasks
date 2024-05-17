package africa.semicolon.chapter17;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
//        BiConsumer<String,String> biConsumer = (firstname,surname)->  System.out.println(firstname + " " + surname);
//            biConsumer.accept("femi","ola");
//        };

    BiConsumer<String,Integer> biConsumer = (firstname,age)->  System.out.println(firstname +" "+ "you are" +" "+ age+" "+"years old");
            biConsumer.accept("solomon",10);
};

    }
