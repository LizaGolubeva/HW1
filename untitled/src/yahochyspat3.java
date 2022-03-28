import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class yahochyspat3 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/1.txt");
        PrintWriter writer = new PrintWriter("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/2.txt");
        Scanner scan = new Scanner(reader);
        LinkedList<Integer> list = new LinkedList<>();
        while (scan.hasNext()) {
            int number = scan.nextInt();
            if (number == 0){
                break;
            } else if(number>0) {
                list.add(number);
            }
        }
        while (list.size() != 0){
            writer.println(list.pollLast());
        }
        writer.close();
    }
}