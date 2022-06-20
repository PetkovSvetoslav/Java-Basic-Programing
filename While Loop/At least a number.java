package com.company;
import java.util.Scanner;
public class while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String ccc = scanner.nextLine();
    int maxN = Integer.MAX_VALUE;
    
    while (!ccc.equals("Stop")) {
        int num = Integer.parseInt(ccc);
        if (num < maxN) {
            maxN = num;
        }
        ccc = scanner.nextLine();
    }
    
    System.out.println(maxN);
    
}  
}
