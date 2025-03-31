import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the Operation(+,-,*,/)");
        char operator = scanner.next().charAt(0);

        double result;


        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if(num1!=0){
                result = num1/num2;}
                else{
                    System.out.println("cant divide");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid operator");
                return;
        }
        System.out.println("Result"+result);
        scanner.close();
    }
}
