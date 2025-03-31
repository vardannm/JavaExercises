import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int input = scanner.nextInt();
        if (input%3==0 && input%5==0){
            System.out.println("your number is fizzbuzz");
        } else if (input%2==0 ) {
            System.out.println("buzz");
        } else if (input%5==0) {
            System.out.println("fizz");
        }else {
            System.out.println("neither of these");
        }
        scanner.close();
    }
}
