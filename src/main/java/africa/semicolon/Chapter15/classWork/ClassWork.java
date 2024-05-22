package africa.semicolon.Chapter15.classWork;

import africa.semicolon.Chapter15.JsonSerialization.JsonSerializier;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static africa.semicolon.Chapter15.JsonSerialization.JsonSerializier.deserializeTrans;
import static java.util.stream.Collectors.toList;

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

    public static BigDecimal totalTransactions(String location) throws IOException {
        Path path = Paths.get(location);
        String location1 = Files.readString(path);
        Transaction[] json = deserializeTrans(location1);
        BigDecimal total = new BigDecimal(0);

        for (Transaction transaction : json) {
            total = total.add(transaction.getAmount());
        }
//        return Arrays.stream(transactions).map(Transaction::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);

        return total;
    }

    public static int toGetLetters(String location) throws IOException {
        Path path = Paths.get(location);
        String text = Files.readString(path);
        String[] sentences = text.split("[A-z]\\.");
        System.out.println(Arrays.toString(sentences));
        return sentences.length;
    }

    public static List<Transaction> daily(LocalDate date) throws IOException {
        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\Trasaction.Json");
        String location = Files.readString(path);
        Transaction[] transactions = deserializeTrans(location);
        return Arrays.stream(transactions).filter((transaction) -> transaction.getDate().equals(date)).toList();
    }



    public static List<Transaction> getTwoDate(LocalDate startDate, LocalDate endDate) throws IOException {
        Path path  = Paths.get("C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\classWork\\Trasaction.Json");
        String location = Files.readString(path);
        Transaction[] transactions = deserializeTrans(location);
        return Arrays.stream(transactions)
                .filter(transaction ->
                        transaction.getDate().compareTo(startDate) >=0 &&
                        transaction.getDate().compareTo(endDate)<=0)
                .toList();
    }


}


