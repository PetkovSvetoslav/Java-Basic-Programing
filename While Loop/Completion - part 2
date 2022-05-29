package com.company;
import java.util.Scanner;
public class completion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    String name = scanner.nextLine();
    double i = 1;
    boolean isEx = false;
    double minGrade = 0;
    double sumGrade = 0;
    
    while (i <= 12) {
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade < 4.00) {
            minGrade++;
            if (minGrade == 2) {
                isEx = true;
                break;
            }
            continue;
        }
        sumGrade += grade;
        i++;

    }
    
   if(isEx) {
       System.out.printf("%s %s %.0f %s",name, "has been excluded at" ,i , "grade");
    } else {
        double avg = sumGrade / 12;
       System.out.printf("%s %s %.2f",name , "graduated. Average grade:",avg);
    }
    
}
}
