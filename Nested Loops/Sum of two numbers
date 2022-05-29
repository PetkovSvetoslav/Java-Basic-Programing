package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int countAll = 0;
        boolean g = false;
        
        for (int i = n; i <= n2; i++) {
            for (int j = n; j <= n2; j++) {
                countAll += 1;
              if ((i + j) == magic) {
                  g = true;
                  System.out.printf("%s%d %s%d %s %d %s %d%s","Combination N:", countAll,"(", i ,"+" , j , "=" ,magic , ")");
                  break;
              }
                }
                
            if (g) {
                break;
            }
            
            }
            
        if (!g) {
            System.out.printf("%d %s %d", countAll, "combinations - neither equals", magic);
        } 
        
        } 
        }
