package com.company;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (current > n){
            isBigger = true;
            break;
                }
                System.out.println(current + " ");
                current++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }

    }
}