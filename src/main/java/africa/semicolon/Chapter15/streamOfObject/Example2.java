package africa.semicolon.Chapter15.streamOfObject;

import java.io.IOException;
import java.io.PrintStream;

public class Example2 {

    public static void main(String[] args) {
        //Println is a method of java IOStream

        String fileLocation = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample2.txt";
        try (PrintStream printStream = new PrintStream(fileLocation)){
            System.setOut(printStream);
            printStream.println("There ia a tidy ");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
