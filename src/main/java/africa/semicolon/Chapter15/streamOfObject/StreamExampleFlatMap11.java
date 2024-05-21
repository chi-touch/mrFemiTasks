package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExampleFlatMap11 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1,2,3,4,5),
                List.of(10,20,30,40,50),
                List.of(100,200,300,400,500)
        );

        //flatMap return a stream it takes all the elment and tr
       System.out.println(lists.stream()//[[1,2,3,4,5)],[10,20,30,40,50)],[100,200,300,400,500]]
                .flatMap((list)-> list.stream())
                .toList());


    }
}
