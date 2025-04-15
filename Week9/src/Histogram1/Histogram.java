package Histogram1;

import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();

        System.out.println("Enter numbers (1 to 100) . Type -1 to end:");

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.contains("-1")) break;

            String[] tokens = line.trim().split("\\t"); // tab-only split
            for (String token : tokens) {
                try {
                    int number = Integer.parseInt(token);
                    if (number >= 1 && number <= 100) {
                        values.add(number);
                    } else {
                        System.out.println("⚠️ Out of range: " + number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Invalid input: " + token);
                }
            }
        }

        int[] bins = new int[10]; // ranges 1-10, 11-20, ..., 91-100

        for (int num : values) {
            int index = (num - 1) / 10;
            bins[index]++;
        }

        System.out.println("\n📊 Histogram:");
        for (int i = 0; i < bins.length; i++) {
            int start = i * 10 + 1;
            int end = start + 9;
            System.out.printf("%2d - %3d | ", start, end);
            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}


