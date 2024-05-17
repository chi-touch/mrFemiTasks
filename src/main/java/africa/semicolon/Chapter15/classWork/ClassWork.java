package africa.semicolon.Chapter15.classWork;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ClassWork {

    public static Transaction[] deserialize(String json) throws JsonProcessingException {
        ObjectMapper
                objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Transaction[].class);
    }

    public static int calculate(String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        String location = Files.readString(path);
        Transaction[] transactions = deserialize(location);
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount().intValue();
        }
        return sum;
    }

    public static Transaction[] serialize(Transaction transaction){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(transaction);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return new Transaction[0];
    }

    public static int toWord(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))){
                count++;
            }

        }
        return count;

    }

    public static int toGetLetters(String location) throws IOException {
        Path path = Paths.get(location);
        String text = Files.readString(path);
        String[] sentences = text.split("[A-z]\\.");
        System.out.println(Arrays.toString(sentences));
        return sentences.length;
    }
}


