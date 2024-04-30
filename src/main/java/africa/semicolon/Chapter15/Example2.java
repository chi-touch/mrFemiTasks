package africa.semicolon.Chapter15;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {

        //Step:1
        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\");
       // System.out.println(path);

        try(DirectoryStream <Path> directoryStream = Files.newDirectoryStream(path)){
           // or directoryStream.forEach(System.out::println);
           path.forEach(p ->{if(Files.isDirectory(p)) System.out.println(p);});

        }catch(IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

    //DirectoryStream : is a generic object helps return directorystream object  file that contains all the directories
}

