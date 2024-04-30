package africa.semicolon.Chapter15;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class WebScraper {
    public static void main(String[] args) {
        //https://www.google.com/welcome.html?name=john&age=11
        //scheme ->https
        //domain name --> www.google.com
        //path-->/welcome.html?name=john&age=11

        try {
            String location = "https://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte data:bytes){
                System.out.println(String.valueOf(data));
            }
        }catch (Exception ex){
            System.err.println("Error:" +ex.getMessage());
            ex.printStackTrace();
        }


    }
}
