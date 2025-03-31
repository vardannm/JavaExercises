import java.util.Scanner;
import java.util.Arrays;
public class SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers with spaces");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int[] nums = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }
        int missing = findSmallestMissingPositive(nums);
        System.out.println("The smallest missing positive ineger is: " + missing);
        scanner.close();
    }
    public static int findSmallestMissingPositive(int[] nums){
        Arrays.sort(nums);
        int smallest =1 ;

        for(int num : nums){
            if(num == smallest){
                smallest++;
            }
        }
        return smallest;
    }
}
