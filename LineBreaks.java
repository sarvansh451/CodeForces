import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for (int testCase = 0; testCase < t; testCase++) {
            int numwords = scanner.nextInt();
            int maxchar = scanner.nextInt();
            scanner.nextLine();
            
            int[] arr = new int[numwords];
            for (int j = 0; j < numwords; j++) {
                String str = scanner.nextLine();
                arr[j] = str.length();
            }
 
            findans(arr, maxchar);
        }
    }
 
    public static void findans(int[] arr, int maxchar) {
        int sum = 0;
        int count = 0;
 
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > maxchar) {
                break;
            }
            sum += arr[i];
            count++;
        }
 
        System.out.println(count);
    }
}
