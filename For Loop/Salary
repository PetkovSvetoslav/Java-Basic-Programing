package com.company;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        double zap = Double.parseDouble(scanner.nextLine());
        
        for (int i = 1; i <= num; i++) {
           String n = scanner.nextLine();
            switch (n) {
                case "Facebook":
                    zap = zap - 150;
                    break;
                case "Instagram":
                    zap = zap - 100;
                    break;
                case "Reddit":
                    zap = zap - 50;
                    break;
            }
            
            if (zap <= 0) {
                System.out.println("You have lost your salary."); return;
            }
            
        }
        
        if (zap > 0) {
            System.out.printf("%.0f",zap);
        }
        
}
}
