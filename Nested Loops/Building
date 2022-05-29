package com.company;
import java.util.Scanner;
public class building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        
        for (int i = x; i >= 1; i--) {
            String buff = "";
            for (int z = 0; z < y; z++) {
                if (i == x) {
                    buff += "L" + i + z + " ";
                } else if (i % 2 == 0) {
                    buff += "O" + i + z + " ";
                } else buff += "A" + i + z + " ";
            }
            System.out.println(buff);
        }
        
 }
}
