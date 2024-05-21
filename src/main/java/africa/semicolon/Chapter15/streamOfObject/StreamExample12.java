package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample12 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "ABCD","HELLO","Hey"
        );

        System.out.println(list.stream()//["ABCD","HELLO","Hey"]
                .flatMap((element)->
                        Stream.of(new StringBuilder(element).reverse()))
                                .toList());

        //to take it back to the original

//        System.out.println(list.stream()//["ABCD","HELLO","Hey"]
//                .flatMap((element)->
//                        Stream.of(new StringBuilder(element).reverse()))
//                .toList().stream()
//                .map(element -> Stream.of(new StringBuilder(element).reverse()))
//                .toList());
//
    }
}
