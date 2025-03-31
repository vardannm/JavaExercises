import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int input = scanner.nextInt();
        int factorialNumber = 1;
        for(int i = input ; i>1 ; i--){
            factorialNumber *= i;
        }
        System.out.println("this factorial for your number: " + factorialNumber );

        scanner.close();
    }
}
