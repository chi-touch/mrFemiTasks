package africa.semicolon.Chapter15.stream.CharacterBase;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Example4 {
    public static void main(String[] args) {

        try(InputStreamReader inputStreamReader = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println("Enter your data: ");
            String data = reader.readLine();
            System.out.println("you entered: "+ data);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
