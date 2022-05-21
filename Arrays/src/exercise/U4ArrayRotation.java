package exercise;
import java.util.Scanner;

public class U4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++){
            String arr2 = arr[0];
            for (int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = arr2;
        }
        System.out.println(String.join(" ", arr));
    }
}