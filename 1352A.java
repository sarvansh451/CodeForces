import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int number = scanner.nextInt();
            findRoundNumber(number);
        }
        scanner.close();
    }
 
    public static void findRoundNumber(int number) {
        List<Integer> ans = new ArrayList<>();
 
        int multiplier = 1;
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                ans.add(digit * multiplier);
            }
            multiplier *= 10;
            number /= 10;
        }
 
        System.out.println(ans.size()); 
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
