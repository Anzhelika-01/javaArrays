package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class U10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        String index = scanner.nextLine();
        String direction ;
        int flyLength;

        while (!index.equals("end")){
            direction = scanner.nextLine();
            flyLength = Integer.parseInt(scanner.nextLine());
            index = scanner.nextLine();
        }


    }
}
