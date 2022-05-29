package com.company;
import java.util.Scanner;
public class godzilaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double budget = Double.parseDouble(scanner.nextLine());
        double statist = Double.parseDouble(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        
        double decorPrice = budget * 0.10;
        double priceStatist = statist * clothes;
        
        if (statist > 150) {
            priceStatist = priceStatist * 0.90;
        }
        
        double sum = decorPrice + priceStatist;
        
        if (sum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs " + "%.2f" + " leva more.", (sum - budget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with " + "%.2f" + " leva left.", (budget - sum) );
        }
}
}
