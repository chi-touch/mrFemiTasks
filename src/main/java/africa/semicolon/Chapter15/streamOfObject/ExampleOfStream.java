package africa.semicolon.Chapter15.streamOfObject;

import java.io.IOException;
import java.io.PrintStream;

public class ExampleOfStream {

    public static void main(String[] args) {

        String  fileLocation ="C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample.txt";;
        try(PrintStream printStream = new PrintStream(fileLocation)){
            printStream.println("Hello World");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
