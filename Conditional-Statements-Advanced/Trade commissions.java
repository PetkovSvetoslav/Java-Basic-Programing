package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String type = scanner.nextLine();
        double day = Double.parseDouble(scanner.nextLine());
        double kom = 0;
        
        switch (type) {
            case "Sofia":
                if (day > 0 && day <= 500) {
                    kom = day * 0.05;
                } else if (day > 500 && day <= 1000) {
                    kom = day * 0.07;
                } else if (day > 1000 && day <= 10000) {
                    kom = day * 0.08;
                } else if (day > 10000) {
                    kom = day * 0.12;
                }
                break;
            case "Varna":
                if (day > 0 && day <= 500) {
                    kom = day * 0.045;
                } else if (day > 500 && day <= 1000) {
                    kom = day * 0.075;
                } else if (day > 1000 && day <= 10000) {
                    kom = day * 0.10;
                } else if (day > 10000) {
                    kom = day * 0.13;
                }
                break;
            case "Plovdiv":
                if (day > 0 && day <= 500) {
                    kom = day * 0.055;
                } else if (day > 500 && day <= 1000) {
                    kom = day * 0.08;
                } else if (day > 1000 && day <= 10000) {
                    kom = day * 0.12;
                } else if (day > 10000) {
                    kom = day * 0.145;
                }
                break;

        }

        if (kom <= 0) {
            System.out.println("error");
        } else { System.out.printf("%.2f", kom); }

    }
}
