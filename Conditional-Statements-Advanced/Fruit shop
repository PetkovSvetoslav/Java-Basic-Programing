package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String frut = scanner.nextLine();
        String day = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());
        double total = 0;
        
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") ) {
            switch (frut) {
                case "banana":
                    total = num * 2.50;
                    break;
                case "apple":
                    total = num * 1.20;
                    break;
                case "orange":
                    total = num * 0.85;
                    break;
                case "grapefruit":
                    total = num * 1.45;
                    break;
                case "kiwi":
                    total = num * 2.70;
                    break;
                case "pineapple":
                    total = num * 5.50;
                    break;
                case "grapes":
                    total = num * 3.85;
                    break;
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (frut) {
                case "banana":
                    total = num * 2.70;
                    break;
                case "apple":
                    total = num * 1.25;
                    break;
                case "orange":
                    total = num * 0.90;
                    break;
                case "grapefruit":
                    total = num * 1.60;
                    break;
                case "kiwi":
                    total = num * 3.00;
                    break;
                case "pineapple":
                    total = num * 5.60;
                    break;
                case "grapes":
                    total = num * 4.20;
                    break;
            }

        }
        
        if (total > 0) {
            System.out.printf("%.2f", total);
        } else {
            System.out.println("error");
        }

    }    
    }
