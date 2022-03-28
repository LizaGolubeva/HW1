import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class oidz3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/1.txt");
        Scanner scan = new Scanner(reader);
        int max = 0;
        String name = null;
        String ex = null;
        while (scan.hasNext()){
            ex = scan.nextLine();
            if (ex.length()>max){
                max = ex.length();
                name = ex;
            }
        }
        System.out.println(name);
        System.out.print("Самая большая строка имеет длину = ");
        System.out.print(max);
    }
}