package Postcode;

import java.util.Scanner;

public class PostCodeReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PostEntry[] records = new PostEntry[25];
        int count = 0;

        System.out.println("Enter up to 25 entries using **TAB-separated** format:");
        System.out.println("Format: FirstName<TAB>LastName<TAB>PostCode");
        System.out.println("Type 'done' to finish.");

        while (input.hasNextLine() && count < 25) {
            String line = input.nextLine();
            if (line.equalsIgnoreCase("done")) break;

            // Only accept tab-separated input
            String[] parts = line.trim().split("\\t");
            if (parts.length == 3) {
                records[count] = new PostEntry(parts[0], parts[1], parts[2]);
                count++;
            } else {
                System.out.println("⚠️ Invalid input! Please use TAB between values.");
            }
        }

        System.out.println("\n📋 Collected Entries:");
        for (int i = 0; i < count; i++) {
            records[i].display();
        }

        input.close();
    }
}

