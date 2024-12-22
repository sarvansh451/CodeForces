import java.util.Scanner;
 
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }
 
            for (int j = 0; j < n; j++) {
                arr2[j] = scanner.nextInt();
            }
 
            int result = calculateMaxDiff(n, arr1, arr2);
            System.out.println(result);
        }
        scanner.close();
    }
 
    public static int calculateMaxDiff(int n, int[] arr1, int[] arr2) {
        int maxDiff = arr1[n - 1];
 
        for (int k = n - 2; k >= 0; k--) {
            int diff = arr1[k] - arr2[k + 1];
            if (diff > 0) {
                maxDiff += diff;
            }
        }
 
        return maxDiff;
    }
}