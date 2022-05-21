package exercise;

import java.util.Scanner;

public class U1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++){
            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];
        }
        for (int peoples: people){
            System.out.print(peoples + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}