import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class yahochyspat {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/1.txt");
        PrintWriter writer = new PrintWriter("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/2.txt");
        Scanner scan = new Scanner(reader);
        Stack<Integer> stack = new Stack<>();
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0){
                break;
            } else if(number>0) {
                stack.push(number);
            }
        }
        reader.close();
        while (stack.size() != 0){
            int a = stack.pop();
            writer.println(a);
        }
        writer.close();
    }
}