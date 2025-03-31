import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter" + n + "numbers: ");
        for(int i=0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        for(int i=1;i<n;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest is this number: "+largest);

        scanner.close();
    }
}
