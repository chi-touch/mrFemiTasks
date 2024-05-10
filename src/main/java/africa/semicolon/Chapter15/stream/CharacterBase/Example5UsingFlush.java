package africa.semicolon.Chapter15.stream.CharacterBase;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static java.lang.System.out;

public class Example5UsingFlush {
    public static void main(String[] args) {

        try(OutputStreamWriter writer = new OutputStreamWriter(out);
                BufferedWriter bufferWriter= new BufferedWriter(writer)){
            String data = "Hello guy's It's break time and only 16 people are gonna eat";
          //  bufferWriter.write(writer,data.length());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
