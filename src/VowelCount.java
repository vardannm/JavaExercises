import java.util.Locale;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String input = scanner.nextLine();

        int vowels = 0;

        input  = input.toLowerCase();

        for(int i = 0 ; i < input.length();i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        System.out.println("number of vowl "+vowels);
        scanner.close();

    }
}
