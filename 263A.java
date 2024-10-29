import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
 
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
 
        int swaps = 0; 
        int indexi = 0;
        int indexj = 0;
 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    indexi = i;
                    indexj = j;
                    break;
                }
            }
        }
 
        swaps = Math.abs(indexi - 2) + Math.abs(indexj - 2);
        System.out.println(swaps);
    }
}
