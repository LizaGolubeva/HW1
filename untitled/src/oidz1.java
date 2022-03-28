import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oidz1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fin = new FileReader("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/1.txt");
        int c;
        while ((c = fin.read()) != -1) System.out.print((char) c);
    }
}