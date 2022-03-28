import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dz1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.print("Hello ");
        System.out.print(text);
        System.out.print("!");
    }
}