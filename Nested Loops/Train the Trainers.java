package com.company;
import java.util.Scanner;
public class nestedL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
double sumAll = 0;
double count = 0;

        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            String name = scanner.nextLine();
            
            if (name.equals("Finish")) {
                break;
            }
            double sumEnd = 0;
            
    for (int i = 0; i < n; i++) {
        double sum = Double.parseDouble(scanner.nextLine());
        sumEnd += sum;
        count++;
    }
    sumAll += sumEnd;
    System.out.printf("%s - %.2f.\n", name, sumEnd / n);
}

        System.out.printf("Student's final assessment is %.2f.", sumAll / count );
        
    }
}
