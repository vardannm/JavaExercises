import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if(num<=1){
            isPrime = false;
        }
        else {
            for (int i = 2 ; i<= Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime =false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(num+"number is prime");
        } else {
            System.out.println(num+"number is not prime");
        }

        scanner.close();
    }
}
