package exercise;
import java.util.Scanner;

public class U3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];

        for (int i = 1; i <= n; i++){
            String[] num = scanner.nextLine().split(" ");
            if (i % 2 == 1){
                arr1[i - 1] = num[0];
                arr2[i - 1] = num[1];
            }
            else {
                arr1[i - 1] = num[1];
                arr2[i - 1] = num[0];
            }
        }

        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}