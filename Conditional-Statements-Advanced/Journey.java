import java.util.Scanner;
public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double age = Double.parseDouble(scanner.nextLine());
       String season = scanner.nextLine();
        double price = 0;
        
        if (age <= 100) {
            if (season.equals("summer")) {
                price = age * 0.30;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s %.2f" , "Camp -", price);
            } else if (season.equals("winter")) {
                price = age * 0.70;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s %.2f", "Hotel -" , price);
            }
        } else if (age <= 1000) {
            if (season.equals("summer")) {
                price = age * 0.40;
                System.out.println("Somewhere in Balkans");
                System.out.printf("%s %.2f" , "Camp -", price);
            } else if (season.equals("winter")) {
                price = age * 0.80;
                System.out.println("Somewhere in Balkans");
                System.out.printf("%s %.2f" , "Hotel -", price);
            }
        } else if (age > 1000) {

            price = age * 0.90;
            System.out.println("Somewhere in Europe");
            System.out.printf("%s %.2f" , "Hotel -", price);
        }


    }   
    }
