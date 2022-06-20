package com.company;
import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numTo = Double.parseDouble(scanner.nextLine());
        String inputM = scanner.nextLine();
        String outputM = scanner.nextLine();
        
        if (inputM.equals("mm")) {
            numTo = numTo / 1000;
        } else  if (inputM.equals("cm")) {
            numTo = numTo / 100;
        } else  if (inputM.equals("m")) {
            numTo = numTo;
        }
        
        if (outputM.equals("mm")) {
            System.out.printf("%.3f", (numTo * 1000));
        } else  if (outputM.equals("cm")) {
            System.out.printf("%.3f", (numTo * 100));
        } else  if (outputM.equals("m")) {
            System.out.printf("%.3f", numTo);
        }
        
    }
}
