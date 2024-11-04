import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int luckyCount = 0;

        while (n > 0) {
            int lastDigit = (int)(n % 10);
            if (lastDigit == 4 || lastDigit == 7) {
                luckyCount++;
            }
            n /= 10;
        }

        boolean isLuckyCount = luckyCount > 0 && (luckyCount == 4 || luckyCount == 7);
        
        if (isLuckyCount) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
