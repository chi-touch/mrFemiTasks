package africa.semicolon.Chapter15.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example3 {

    //Note:there are two categories of IOStream
    //they are 1.

    public static void main(String[] args) {


        String fileLocation = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\stream\\sample3.txt";
        try (var inputStream = new FileInputStream(fileLocation);
             var dataInputStream = new DataInputStream(inputStream)) {
            byte[] fileDate = dataInputStream.readAllBytes();
            System.out.println(new String(fileDate));
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println("Error:" + exception.getMessage());
        }
    }



}
