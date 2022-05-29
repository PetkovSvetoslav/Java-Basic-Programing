import java.util.Scanner;

public class vol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        
        double weekS = 0;
        double gameS = 0;
        double gameH = 0;
       double gamePraznik = 0;
        double allgame = 0;
        double endGame = 0;
        
        weekS = 48 - h;
        gameS = weekS * 3.00 / 4.00;
        gameH = gameH + h;
        gamePraznik = p * 2.00 / 3.00;
        allgame = gamePraznik + gameH + gameS;
        
        if (name.equals("leap")) {
            endGame = allgame * 1.15;
            System.out.printf("%.2f", Math.floor(endGame));
        } else {
            System.out.printf("%.2f", Math.floor(allgame));
        }
        
    }
}
