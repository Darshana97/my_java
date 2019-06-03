import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4 {

    public static void main(String[] args) {

        String str = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
