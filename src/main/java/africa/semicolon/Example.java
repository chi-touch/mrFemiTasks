package africa.semicolon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    //TODO: java.io and java.nio


    //paths
    // windows ==>C:\DELL\Desktop\ : this is important to know the direction where files are save;
    //unix ==> /home/ust/ ...

    public static void main(String[] args) {
        try {

            //Step:1
            Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\sample.txt");

            //Step:2

            Files.createFile(path);
            //Files.deleteIfExists(path);

        }catch(IOException exception){
            exception.printStackTrace();
        }

    }
}
