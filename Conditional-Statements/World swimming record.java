package com.company;
import java.util.Scanner;
public class swimmRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double rekord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsM = Double.parseDouble(scanner.nextLine());
        
        double distanceSec = distance * secondsM;
        double delay = Math.floor(distance / 15) * 12.50;
        double time = distanceSec + delay;
        
        if (time < rekord) {
            System.out.printf("Yes, he succeeded! The new world record is " + "%.2f" + " seconds.", time);
        } else {
            System.out.printf("No, he failed! He was " + "%.2f" + " seconds slower.", (time - rekord));
        }
        
}
}
