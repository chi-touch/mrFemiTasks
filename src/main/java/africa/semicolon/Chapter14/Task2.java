package africa.semicolon.Chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
//        String word = "Hello word";
//
//        System.out.println(sentence(word));
    }
    public static String sentence(String word) {

//        String[] number = word.split(" ");
//        String reversed = "";
//
//        for (int i = number.length-1; i >=0 ; i--) {
//            reversed += number[i] + " ";
//        }
//        return reversed.trim();
        String value = "";
        for (int i = word.length()-1; i >= 0; i--) {
            value += word.charAt(i);
        }
        return value;
    }
    public static String reverseSentence(String word) {
        List<String> values = new ArrayList<>();
        int first = 0 ;
        int last = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i)== ' '){
                last = i -1;
                retriveValues(values,word, first, last);
                first = i +1;
            }
            else if (i == word.length() -1){
                last = i;
                retriveValues(values,word, first, last);
            }
        }
      List<String> reversedList =  reverseBuilder(values);
        return buildString(reversedList);
    }

    private static String buildString(List<String> reversedList) {
        StringBuilder properString = new StringBuilder();
        for (int i = 0; i < reversedList.size() ; i++) {
            if (i < reversedList.size() -1) {
                properString.append(reversedList.get(i))
                        .append(' ');
            }else {
                properString.append(reversedList.get(i));
            }
        }
        return properString.toString();
    }

    private static List<String> reverseBuilder(List<String> values) {
        List<String> reversedList = new ArrayList<>();
        for (int i = values.size() -1; i >= 0 ; i--) {
            reversedList.add(values.get(i));
        }
        return reversedList;
    }

    private static void retriveValues(List<String> values,String word,int first, int last) {
        StringBuilder newValues = new StringBuilder();
        for (int i = first; i <= last; i++) {
         newValues.append(word.charAt(i));
        }
        values.add(newValues.toString());

    }
}

//        int numberOfSpaces = countNumberSpaces(word);
//        String newWord = word;
//        String newString = word;
//        for (int indexj = 0; indexj < numberOfSpaces; indexj++){
//            String newEndString = "";
//            int endWordCount = countNextEndWord(newWord);
//            for (int index = newWord.length() - endWordCount; index < newWord.length(); index++) {
//                newEndString += word.charAt(index);
//            }
//            System.out.println(newEndString);
//            newString += newEndString + " ";
//            newWord = newWord.substring(0, newWord.length() - endWordCount);
//        }
//        return "";
//    }
//
//    private static int countNumberSpaces(String word) {
//        int spaces = 0;
//        for (int index = 0; index < word.length(); index++) {
//            if (word.charAt(index) == ' ')
//                spaces++;
//        }
//        return spaces;
//    }
//
//    private static int countNextEndWord(String word) {
//        int endWordCounter = 0;
//        for (int index = word.length() - 1; index >= 0; index--) {
//            if (word.charAt(index) != ' ')
//                endWordCounter++;
//        }
//        return endWordCounter;
//    }
//
//    public String getCurrentWord(String currentWord){
//
//        return "";

    /*
     String[] number = word.split(" ");
        String reversed = "";

        for (int i = number.length-1; i >=0 ; i--) {
            reversed += number[i] + " ";
        }
        return reversed.trim();


        String reverse = "";
        for (int i =word.length()-1; i >= 0 ; i--) {
            //reverse.charAt(i);
            reverse +=word.charAt(i);


        }
        return reverse
    */
