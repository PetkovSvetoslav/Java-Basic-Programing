package com.company;
import java.util.Scanner;
public class histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        
        for (int i = 1; i <= n1; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 200) {
                p1 = p1 + 1;
            } else if (n >= 200 && n <= 399) {
                p2 = p2 + 1;
            } else if (n >= 400 && n <= 599) {
                p3 = p3 + 1;
            } else if (n >= 600 && n <= 799) {
                p4 = p4 + 1;
            } else if (n >= 800 && n <= 1000) {
                p5 = p5 + 1;
            }
        }
        
        double lp1 = (p1 / n1) * 100;
        double lp2 = (p2 / n1) * 100;
        double lp3 = (p3 / n1) * 100;
        double lp4 = (p4 / n1) * 100;
       double lp5 = (p5 / n1) * 100;

        System.out.printf("%.2f%s\n",lp1,"%");
        System.out.printf("%.2f%s\n",lp2,"%");
        System.out.printf("%.2f%s\n",lp3,"%");
        System.out.printf("%.2f%s\n",lp4,"%");
        System.out.printf("%.2f%s\n",lp5,"%");
        
    }   
    }
