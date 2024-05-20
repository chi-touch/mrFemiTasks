package africa.semicolon.Chapter15.streamOfObject.CharacterBase;

import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample.txt";

        char[] fileChars = new char[1024];
        try (FileReader fileReader = new FileReader(fileLocation)){
           int numberOfCharactersRead = fileReader.read(fileChars);
            displayFileContent(numberOfCharactersRead, fileChars);
        } catch(IOException e) {
            System.err.println("ERROR:" + e.getMessage());
        }
    }

    private static void displayFileContent(int numberOfCharactersRead, char[] fileChars) {
        for (int counter = 0; counter < numberOfCharactersRead; counter++) {
            System.out.print(fileChars[counter]);
        }
    }
}
