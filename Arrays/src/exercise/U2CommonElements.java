package exercise;
import java.util.Scanner;

public class U2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements1 = scanner.nextLine().split(" ");
        String[] elements2 = scanner.nextLine().split(" ");

        for (String element2 : elements2) {
            for (String element1 : elements1) {
                if (element2.equals(element1)) {
                    System.out.print(element2 + " ");
                }
            }
        }
    }
}