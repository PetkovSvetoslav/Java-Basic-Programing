package com.company;
import java.util.Scanner;
public class sumP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.nextLine();
        int sumP = 0;
        int sumNot = 0;
        
while (!"stop".equals(n)) {
    int num = Integer.parseInt(n);
    
    if (num < 0) {
        System.out.println("Number is negative.");
    }
    
    if (num >= 0) {
        if (num % 2 == 1 || num == 2) {
            sumP += num;

        } else {
            sumNot += num;
        }
      
    }
n = scanner.nextLine();

}
        System.out.printf("Sum of all prime numbers is: %d\n", sumP);
        System.out.printf("Sum of all non prime numbers is: %d", sumNot);
        
    }
}
