package africa.semicolon.Chapter15.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10 {

    public static void main(String[] args) throws IOException {
        String location = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\stream\\sample5.txt";
        Path path = Paths.get(location);

        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("happy married life Bolaji");
        writer.close();
    }
}
