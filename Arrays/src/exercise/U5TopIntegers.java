package exercise;
import java.util.Scanner;

public class U5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i <= arr.length - 1; i++){
            boolean bigger = true;
            for (int j = i + 1; j <= arr.length - 1; j++){
                if (Integer.parseInt(arr[i]) <= Integer.parseInt(arr[j])){
                    bigger = false;
                }
            }
            if (bigger){
                System.out.print(arr[i] + " ");
            }
        }
    }
}