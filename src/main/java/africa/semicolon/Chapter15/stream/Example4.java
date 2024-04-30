package africa.semicolon.Chapter15.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {

    //Note:there are two categories of IOStream
    //they are 1.

    public static void main(String[] args) {


        String fileLocation = "C:\\Users\\User\\IdeaProjects\\mrFemiTasks\\src\\main\\java\\africa\\semicolon\\Chapter15\\stream\\sample3.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileLocation, true)
                ){
            String data = "\nInvest your money wisely, stop playing sporty bet";
            fileOutputStream.write(data.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println("Error:" + exception.getMessage());
        }
    }



}
