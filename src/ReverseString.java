import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the word");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1 ; i>=0; i--){
            reversed += input.charAt(i);
        }
        System.out.println("reversed: " + reversed);
        scanner.close();
    }
}
