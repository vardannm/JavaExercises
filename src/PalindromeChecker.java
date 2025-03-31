import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything");
        String input = scanner.nextLine();
        String clearedInput = input.replaceAll("[\\W_]+","").toLowerCase();
        String reversed = "";
        for(int i = clearedInput.length()-1 ;i>0; i--){
            reversed += clearedInput.charAt(i);
        }
        if(clearedInput.equals(reversed)){
            System.out.println("your word is a Palindrome");
        }else {
            System.out.println("you word is not a palindrome");
        }
       scanner.close();
    }
}
