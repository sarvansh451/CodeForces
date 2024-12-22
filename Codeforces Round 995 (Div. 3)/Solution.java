import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            day(n, a, b, c);
        }
    }
 
    public static void day(int n, int a, int b, int c) {
        int cycleSum = a + b + c;
        int fullCycles = n / cycleSum;
        int operations = fullCycles * 3;
        int sum = fullCycles * cycleSum;
        int remaining = n - sum;
 
        if (remaining > 0) {
            if (remaining > a) {
                remaining -= a;
                operations++;
            } else {
                operations++;
                remaining = 0;
            }
        }
        if (remaining > 0) {
            if (remaining > b) {
                remaining -= b;
                operations++;
            } else {
                operations++;
                remaining = 0;
            }
        }
        if (remaining > 0) {
            if (remaining > c) {
                remaining -= c;
                operations++;
            } else {
                operations++;
                remaining = 0;
            }
        }
 
        System.out.println(operations);
    }
}