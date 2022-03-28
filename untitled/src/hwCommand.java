import java.util.Scanner;

public class hwCommand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создаем объект сканер
        String text = scanner.nextLine();//ввод с клавы ко
        if (text.equals("hello")) {
            System.out.println("Hello, world!");
        }
    }
}


