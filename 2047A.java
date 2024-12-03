import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            happydays(arr);
        }
    }
 
    public static void happydays(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
 
        int count = 0;
        for (int num : prefixSum) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num && sqrt % 2 != 0) {
                count++;
            }
        }
 
        System.out.println(count);
    }
}
