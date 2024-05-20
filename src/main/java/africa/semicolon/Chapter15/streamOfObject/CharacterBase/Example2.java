package africa.semicolon.Chapter15.streamOfObject.CharacterBase;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) {

        String  fileLocation ="C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample.txt";;
        try(FileWriter fileWriter = new FileWriter(fileLocation)){
            fileWriter.write("Hello World");
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }

    }
}
