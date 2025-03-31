import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence is:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
    }
}
