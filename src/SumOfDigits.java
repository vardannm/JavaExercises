import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();

        int sum = 0;
        while(input!=0){
            sum += input%10;
            input /= 10;
        }
        System.out.println(sum);
        scanner.close();
        System.out.println(123%10);
        System.out.println(123/10);
    }
}
