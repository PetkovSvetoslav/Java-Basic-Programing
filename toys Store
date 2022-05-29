package com.company;
import java.util.Scanner;
public class toysStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double str = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine());
        double doll = Double.parseDouble(scanner.nextLine());
        double bear = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double truck = Double.parseDouble(scanner.nextLine());
    double toycount = puzzle + doll + bear + minions + truck;
    double money = (puzzle * 2.6) + (doll * 3.00) + (bear * 4.1) + (minions * 8.2) + (truck * 2.00);
    if (toycount >=50) {
        money = money * 0.75;
    }
    money = money * 0.9;
    if ( money >= str) {
        double result = Math.abs(money - str);
        System.out.printf("%s %.2f %s","Yes!" , result , "lv left.");
    } else {
       double result = Math.abs(money - str);
        System.out.printf("%s %.2f %s","Not enough money!" , result , "lv needed.");
    }
}
}
