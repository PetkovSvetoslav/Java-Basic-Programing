package com.company;
import java.util.Scanner;
public class steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String steps = scanner.nextLine();
        int goalCounter = 0;
        
        while (!"Going home".equals(steps)) {
            int currentSteps = Integer.parseInt(steps);
            goalCounter += currentSteps;
            
            if (goalCounter >= 10000) {
                int diff = Math.abs(goalCounter - 10000);
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d %s", diff, "steps over the goal!");
                break;
            }
            steps = scanner.nextLine();
        }
        
        if ("Going home".equals(steps)) {
            int stepsAfterGoingHome = Integer.parseInt(scanner.nextLine());
            goalCounter += stepsAfterGoingHome;
            
            if (goalCounter < 10000) {
                int difl = Math.abs(goalCounter - 10000);
                System.out.printf("%d %s", difl, "more steps to reach goal.");
            } else {
                int difl = Math.abs(goalCounter - 10000);
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d %s", difl , "steps over the goal!");
            }
            
        }
        
    }
}
