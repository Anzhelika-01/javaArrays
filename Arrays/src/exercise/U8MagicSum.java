package exercise;

import java.util.Scanner;

public class U8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int n = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (Integer.parseInt(numbers[i]) +
                        Integer.parseInt(numbers[j]) == n){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}