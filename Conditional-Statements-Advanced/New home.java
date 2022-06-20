package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String ftype = scanner.nextLine();
        double fcounter = Double.parseDouble(scanner.nextLine());
        double budjet = Double.parseDouble(scanner.nextLine());
        double finalSum = 0;
        double end = 0;
        
        switch(ftype) {
            case "Roses":
                finalSum = fcounter * 5;
                if (fcounter > 80) {
                    finalSum = finalSum * 0.90;
                }
                break;
            case "Dahlias":
                finalSum = fcounter * 3.80;
                if (fcounter > 90) {
                    finalSum = finalSum * 0.85;
                }
                break;
            case "Tulips":
                finalSum = fcounter * 2.80;
                if (fcounter > 80) {
                    finalSum = finalSum * 0.85;
                }
                break;
            case "Narcissus":
                finalSum = fcounter * 3.00;
                if (fcounter < 120) {
                    finalSum = finalSum * 1.15;
                }
                break;
            case "Gladiolus":
                finalSum = fcounter * 2.50;
                if (fcounter < 80) {
                    finalSum = finalSum * 1.20;
                }
                break;
        }
        
        if (budjet >= finalSum){
            end = budjet - finalSum;
            System.out.printf("%s %d %s %s %.2f %s", "Hey, you have a great garden with" , Math.round(fcounter) , ftype , "and" , Math.abs(end) , "leva left.");
        } else {
            end = finalSum - budjet;
            System.out.printf("%s %.2f %s", "Not enough money, you need" , Math.abs(end) , "leva more.");
        }
        
    }
}
