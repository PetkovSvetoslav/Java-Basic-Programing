import java.util.Scanner;
public class for1lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       String text = scanner.nextLine();
       int lk = text.length();
       int resM = 0;

        for (int i = 0; i < lk; i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a': resM += 1; break;
                case 'e': resM += 2; break;
                case 'i': resM += 3; break;
                case 'o': resM += 4; break;
                case 'u': resM += 5; break;
            }
        }
        System.out.println(resM);
    }    
    }
