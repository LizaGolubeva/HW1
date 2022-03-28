import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class yahochyspat2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/Users/elizavetagolubeva/IdeaProjects/untitled/src/com/company/1.txt");
        Scanner scan = new Scanner(reader);
        int number = scan.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            arrayDeque.add(scan.nextInt());
        }
        Object [] array = arrayDeque.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}