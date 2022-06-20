package com.company;
import java.util.Scanner;
public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        int numI = Integer.parseInt(scanner.nextLine());
        int lice = num * numI;
        int sum = 0;
        String step = scanner.nextLine();
        
        while (!"STOP".equals(step)) {
            int num2 = Integer.parseInt(step);
            sum = sum + num2;
            
            if (sum >= lice) {
                System.out.printf("%s %d %s", "No more cake left! You need", (sum - lice), "pieces more.");
                return;
            }
            
            step = scanner.nextLine();
        }
        
            if ("STOP".equals(step)) {
                System.out.printf("%d %s",Math.abs(lice - sum) , "pieces are left.");
            } else if (lice < sum) {
                System.out.printf("%d %s",(lice - sum), "pieces are left.");
        } else  if (sum >= lice) {
               System.out.printf("%s %d %s", "No more cake left! You need", (sum - lice), "pieces more.");
            }
            
    }
}
