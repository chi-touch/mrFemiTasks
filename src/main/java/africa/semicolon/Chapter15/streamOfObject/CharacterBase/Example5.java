package africa.semicolon.Chapter15.streamOfObject.CharacterBase;

import java.io.*;

import static java.lang.System.out;

public class Example5 {
    public static void main(String[] args) {

        try(OutputStreamWriter writer = new OutputStreamWriter(out);
                BufferedWriter bufferWriter= new BufferedWriter(writer)){
            bufferWriter.write("Hello guy's It's break time and only 16 people are gonna eat");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }






    }
}
