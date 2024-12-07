import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] arr = new long[(int) n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
 
            long sum_odd = 0, sum_even = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum_even += arr[i];
                } else {
                    sum_odd += arr[i];
                }
            }
 
            long odd_places = n / 2;
            long even_places = (n + 1) / 2;
 
            if (odd_places > 0 && even_places > 0 &&
                sum_odd % odd_places == 0 &&
                sum_even % even_places == 0 &&
                (sum_odd / odd_places == sum_even / even_places)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
 
