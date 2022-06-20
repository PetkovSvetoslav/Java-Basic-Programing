package com.company;
import java.util.Scanner;
public class sumLR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = Integer.parseInt(scanner.nextLine());
        int n = n1 * 2;
        int sum = 0;
        int sum2 = 0;
        int sumEnd = 0;
        int sumEnd2 = 0;
        
        for (int i = 1; i <= n; i++) {
            int n2 = Integer.parseInt(scanner.nextLine());
          if (i <= n1){
                sum = sum + n2;
            } else {
              sum2 = sum2 + n2;
          }
            sumEnd = sum + sum2;
            sumEnd2 = sum - sum2;
        }
        
        if (sumEnd2 == 0) {
            System.out.printf("%s %d","Yes, sum =" ,(sumEnd / 2));
        } else {
            System.out.printf("%s %d","No, diff =" ,Math.abs(sumEnd2));
        }
        
    }    
    }
