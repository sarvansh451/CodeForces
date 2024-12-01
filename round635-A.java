import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            find(a, b, c, d);
            System.out.println();
        }

        scanner.close();
    }

    public static void find(int a, int b, int c, int d) {
        System.out.print(b + " " + c + " " + c);
    }
}
