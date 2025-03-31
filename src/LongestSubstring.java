import java.util.Scanner;
import java.util.HashSet;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        int maxLength = findTheLongestString(input);
        System.out.println(maxLength);
        scanner.close();
    }
    public static int findTheLongestString(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLenght = 0;

        for(int right =0;right< s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxLenght = Math.max(maxLenght,right-left+1);
        }
        return maxLenght;
    }
}
