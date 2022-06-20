package com.company;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
        
        for (int i = number; i > 1; i--) {
            System.out.println(i);
        }
        
        for (int i = 0; i < number; i+=3) {
            System.out.println(i);
        }
        
        for (int i = 0; i <= number; i+=2) {
            System.out.println(Math.round(Math.pow(2,i)));
        }

    }
}
