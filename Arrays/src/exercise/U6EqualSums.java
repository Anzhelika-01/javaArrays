package exercise;

import java.util.Scanner;

public class U6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        boolean exist = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int left = i - 1; left >= 0; left--) {
                leftSum += Integer.parseInt(numbers[left]);
            }
            for (int right = i + 1; right < numbers.length; right++) {
                rightSum += Integer.parseInt(numbers[right]);
            }
            if (leftSum == rightSum){
                System.out.println(i);
                exist = true;
                break;
            }
        }
        if (!exist){
            System.out.println("no");
        }
    }
}