package africa.semicolon.Chapter16;

import java.util.*;

public class Collections {

    public static void main(String[] args) {

        //String pull works like a collection it collects multiple strings

        Collection<String> words= new TreeSet<>();
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");

        System.out.println(words);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);

        List<Integer> number2 = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);


        Set<List<Integer>> set = new HashSet<>();
        set.add(numbers);
        set.add(number2);

        System.out.println(set);
//
//
//        List<List<Integer> lists = new ArrayList<>(numbers);


    }







}
