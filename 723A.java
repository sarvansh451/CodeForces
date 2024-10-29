import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int a=Math.min(first,Math.min(second,third));
        int b=Math.max(first,Math.max(second,third));
        int ans=b-a;
        System.out.println(ans);
        scanner.close();
    }
}
