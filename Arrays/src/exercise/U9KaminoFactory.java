package exercise;

import java.util.Locale;
import java.util.Scanner;

public class U9KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int currentIndex;
        int count = 0;
        int dnaPosition = 0;
        int currentCount = 0;
        int sum = 0;
        int bestSum = 0;
        int DNALength = Integer.parseInt(scanner.nextLine());
        String[] dna = new String[DNALength];
        String command = scanner.nextLine();

        while (!command.equals("Clone them!")){
            dna[dnaPosition] = command.replaceAll("!", " ");
            String[] subsequence = command.split("!++");

            for (int i = 0; i < DNALength; i++) {
                if (subsequence[i].equals("1")){
                    index = i;
                    for (int j = i; i < DNALength; i++){
                        sum += j;
                        if (subsequence[j].equals("1")){
                            count++;
                        }
                        else {
                            break;
                        }
                    }
                }
                if (count >= currentCount){
                    currentCount = count;
                    currentIndex = index;
                    dnaPosition++;
                }
                count = 0;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", dnaPosition,
                );

    }
}