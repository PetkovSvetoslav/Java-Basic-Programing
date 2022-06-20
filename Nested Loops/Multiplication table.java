package com.company;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                int res = i * j;
                System.out.printf("%d * %d = %d%n", i, j, res);
            }
        }
        
    }
}
