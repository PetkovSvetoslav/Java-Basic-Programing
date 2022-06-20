package com.company;

import java.util.Scanner;

public class lili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = Integer.parseInt(scanner.nextLine());
        double cel = Double.parseDouble(scanner.nextLine());
        int igra = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double toys = 0;
        double sumEnd = 0;
        double si = 0;

        for (double i = 1; i <= age; i++) {
            if (i % 2 == 0) {
            si = 10 * (i / 2);
            sum = (sum + si) - 1;
            } else {
            toys = toys + 1;
            }
        }
        
        sumEnd = sum + (toys * igra);
        
        if (cel <= sumEnd) {
            System.out.printf("%s %.2f", "Yes!" , (sumEnd - cel));
        } else {
            System.out.printf("%s %.2f", "No!" , (cel - sumEnd));
        }

    }
}
