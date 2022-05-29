import java.util.Scanner;
public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;
        double discountStudio = 0;
        double discountApartment = 0;
        
double finalStudioPrice = 0;
double finalApartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }

        if (nights > 14 && (month.equals("May") || month.equals("October"))) {
            discountStudio = 0.3;
        } else if (nights > 14 && (month.equals("June") || month.equals("September"))) {
            discountStudio = 0.2;
        } else if (nights > 7 && (month.equals("May") || month.equals("October"))) {
            discountStudio = 0.05;
        }

        if (nights > 14) {
            discountApartment = 0.1;
        }
         finalStudioPrice = priceStudio * nights * (1 - discountStudio);
        finalApartmentPrice = priceApartment * nights * (1 - discountApartment);

        System.out.printf("%s %.2f %s \n", "Apartment:" , finalApartmentPrice , "lv.");
        System.out.printf("%s %.2f %s", "Studio:" , finalStudioPrice , "lv.");

    }   
    }
