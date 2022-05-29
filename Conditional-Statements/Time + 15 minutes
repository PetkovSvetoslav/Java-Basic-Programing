package com.company;

import java.util.Scanner;

public class ctime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nnn = Integer.parseInt(scanner.nextLine());
        int lll = Integer.parseInt(scanner.nextLine());
        int ggg = lll + 15;
        
        if (ggg >= 60) {
            nnn = nnn + 1;
            ggg = ggg - 60;
        }
        
        if (nnn >= 24) {
            nnn = nnn - 24;
        }
        
        if (ggg < 10) {
            System.out.printf("%d:%02d", nnn, ggg);
        } else { System.out.printf("%d:%d", nnn, ggg);
        }
        
    }
}
