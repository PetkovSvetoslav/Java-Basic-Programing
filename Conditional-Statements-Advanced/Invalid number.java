package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = Double.parseDouble(scanner.nextLine());

        if (number < 0) {
            System.out.println("invalid");
        } else if (number > 0 && number < 100) {
            System.out.println("invalid");
        } else if (number > 200) {
            System.out.println("invalid");
        }

    }
}
