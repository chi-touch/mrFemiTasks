package africa.semicolon.Chapter15.streamOfObject;

import java.util.List;

public class StreamExampleSort9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,7,8,1,2,2,3,8,9,5,6);

        //it remove dulplicate. u remome duplicate first before sorting

       List<Integer> result =  numbers.stream()
                                    .distinct()
                                    .sorted()
                                    .toList();
        System.out.println(result);
    }
}
