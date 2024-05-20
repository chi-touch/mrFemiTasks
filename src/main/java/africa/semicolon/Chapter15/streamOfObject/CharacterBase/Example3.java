package africa.semicolon.Chapter15.streamOfObject.CharacterBase;

import java.io.*;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {

        String  fileLocation ="C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample.txt";;
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println(reader.lines().collect(Collectors.joining("\n")));

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
