import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i % 2 == 0) ? '#' : '.';
            }
            if (i % 4 == 1) {
                arr[i][m - 1] = '#';
            }
            if (i % 4 == 3) {
                arr[i][0] = '#';
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
