import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double day = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();
        double result = 0;
        
        switch (type) {
            case "room for one person":
                result = (day - 1) * 18.00;
                break;
            case "apartment":
                result = (day - 1) * 25.00;
                if (day < 10) {
                    result = result * 0.70;
                } else if (day >= 10 && day <= 15) {
                    result = result * 0.65;
                } else if (day > 15) {
                    result = result * 0.50;
                }
                break;
            case "president apartment":
                result = (day - 1) * 35.00;
                if (day < 10) {
                    result = result * 0.90;
                } else if (day >= 10 && day <= 15) {
                    result = result * 0.85;
                } else if (day > 15) {
                    result = result * 0.80;
                }
                break;

        }
        if (grade.equals("positive")) {
            result = result + (result * 0.25);
            System.out.printf("%.2f", result);
        } else if (grade.equals("negative")) {
            result = result - (result * 0.10);
            System.out.printf("%.2f", result);
        }

    }
}
