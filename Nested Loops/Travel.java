package com.company;
import java.util.Scanner;
public class travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        while (!input.equals("End")) {
            String destination = input;
            double price = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            
            while (price > sum) {
                double money = Double.parseDouble(scanner.nextLine());
                sum = sum + money;
            }
            
            System.out.printf("Going to %s!\n", destination);
            input = scanner.nextLine();
        }
        
    }     
    }
