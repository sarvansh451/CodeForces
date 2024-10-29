import java.util.Scanner;
 
public class DotGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(findLastMove(n));
        }
        
        scanner.close();
    }
 
    public static String findLastMove(int n) {
        int position = 0;
        int move = 1;
        boolean isSakurakoTurn = true;
 
        while (Math.abs(position) <= n) {
            if (isSakurakoTurn) {
                position -= move;
            } else {
                position += move;
            }
            move += 2;
            isSakurakoTurn = !isSakurakoTurn;
        }
 
        return isSakurakoTurn ? "Kosuke" : "Sakurako";
    }
}
