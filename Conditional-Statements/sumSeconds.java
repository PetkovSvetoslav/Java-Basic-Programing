package com.company;

import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        
        int time = number + number2 + number3;
        int min = time / 60;
        int sec = time % 60;
        
if (sec < 10){
    System.out.printf("%d:0%d",min,sec);
} else {
    System.out.printf("%d:%d",min,sec);
}

    }
}
