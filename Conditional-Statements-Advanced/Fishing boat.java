package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        String season= scanner.nextLine();
        double ribari = Double.parseDouble(scanner.nextLine());
        double razhodiP = 3000;
        double razhodiL = 4200;
        double razhodiE = 4200;
        double razhodiZ = 2600;
        double sum = 0;
        double pari = 0;
        
        switch (season) {
            case "Spring":
                if (ribari <= 6) {
                    sum = razhodiP * 0.90;
                } else if (ribari > 7 && ribari <= 11) {
                    sum = razhodiP * 0.85;
                } else if (ribari > 12) {
                    sum = razhodiP * 0.75;
                }
                break;
            case "Summer":
                if (ribari <= 6) {
                    sum = razhodiL * 0.90;
                } else if (ribari > 7 && ribari <= 11) {
                    sum = razhodiL * 0.85;
                } else if (ribari > 12) {
                    sum = razhodiL * 0.75;
                }
                break;
            case "Autumn":
                if (ribari <= 6) {
                    sum = razhodiE * 0.90;
                } else if (ribari > 7 && ribari <= 11) {
                    sum = razhodiE * 0.85;
                } else if (ribari > 12) {
                    sum = razhodiE * 0.75;
                }
                break;
            case "Winter":
                if (ribari <= 6) {
                    sum = razhodiZ * 0.90;
                } else if (ribari > 7 && ribari <= 11) {
                    sum = razhodiZ * 0.85;
                } else if (ribari > 12) {
                    sum = razhodiZ * 0.75;
                }
                break;

        }
        if (season.equals("Winter") || season.equals("Summer") || season.equals("Spring")) {
            if (ribari % 2 == 0) {
                sum = sum * 0.95;
            }
        }

        pari = budjet - sum;
        
        if (pari >= 0) {
           System.out.printf("%s %.2f %s","Yes! You have" , Math.abs(pari) , "leva left.");
        } else  { System.out.printf("%s %.2f %s", "Not enough money! You need" , Math.abs(pari) , "leva."); }
    }
    }
