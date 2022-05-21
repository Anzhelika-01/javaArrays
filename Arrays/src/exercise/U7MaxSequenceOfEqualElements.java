package exercise;

import java.util.Scanner;

public class U7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int longestIndex = 0;
        int currentIndex = 0;
        int maxCounter = 0;
        int currentCounter = 0;

        for (int i = 0; i < numbers.length - 1; i++){
                 if (Integer.parseInt(numbers[i]) ==
                         Integer.parseInt(numbers[i + 1])){
                     currentCounter++;
                     currentIndex = i;
                 }
                 else {
                     currentCounter = 0;
                 }
             if (currentCounter > maxCounter){
                 maxCounter = currentCounter;
                 longestIndex = currentIndex + 1;
             }
        }
        for (int j = longestIndex - maxCounter; j <= longestIndex; j++){
            System.out.print(Integer.parseInt(numbers[j]) + " ");
        }
    }
}
