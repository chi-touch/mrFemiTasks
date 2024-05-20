package africa.semicolon.Chapter15.streamOfObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {

    public static void main(String[] args) throws IOException {
        String location = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\streamOfObject\\sample5.txt";
        Path path = Paths.get(location);

        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("happy married life Bolaji");
        writer.close();
    }
}
