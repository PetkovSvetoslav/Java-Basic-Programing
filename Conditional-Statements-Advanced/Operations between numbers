import java.util.Scanner;
 
public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
 
        int output = 0;
        boolean ifOdd = true;
        boolean ifEven = true;
 
        switch (operator){
            case "+":
                output = n1+n2;
                ifOdd = (n1+n2)%2==1;
               ifEven = (n1+n2)%2==0;
                if (ifOdd){
                    System.out.printf("%d %s %d = %d - odd",n1,operator,n2,output);
                }else if (ifEven){
                    System.out.printf("%d %s %d = %d - even",n1,operator,n2,output);
                }break;
            case "-":
                output = n1-n2;
                ifOdd = (n1-n2)%2!=0;
                ifEven = (n1-n2)%2==0;
                if (ifOdd){
                    System.out.printf("%d %s %d = %d - odd",n1,operator,n2,output);
                }else if (ifEven){
                    System.out.printf("%d %s %d = %d - even",n1,operator,n2,output);
                }break;
            case "*":
                output = n1*n2;
                ifOdd = (n1*n2)%2==1;
                ifEven = (n1*n2)%2==0;
                if (ifOdd){
                    System.out.printf("%d %s %d = %d - odd",n1,operator,n2,output);
                }else if (ifEven){
                    System.out.printf("%d %s %d = %d - even",n1,operator,n2,output);
                }break;
            case "/":
                if (n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
 
                }else {
                    double f1 = n1;
                    double f2 = n2;
 
                    double devidingOutput = f1 / f2;
                    System.out.printf("%.0f %s %.0f = %.2f",f1,operator,f2,devidingOutput);
                }break;
            case "%":
                if (n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
 
                }else {
                    output = n1 % n2;
                    System.out.printf("%d %s %d = %d", n1, operator, n2, output);
                }break;
        }
    }
}
