import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) throws Oshibka {
        Scanner scanner = new Scanner(System.in); // сначала вводим строку а после количество повторений
        String text = scanner.nextLine();
        int number = scanner.nextInt();
        if (number >= 0) {
                for (int i = 0; i < number; i++) {
                    System.out.println(text);
                }
            }  else {
            throw new Oshibka("Вы ввели неверное число");
        }

    }
    public static class Oshibka extends Exception{
        public Oshibka(String message) {
            super(message);
        }
    }

}