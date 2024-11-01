import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);

        // Adjust for overlap if maxIndex is before minIndex
        if (maxIndex > minIndex) {
            swaps -= 1;
        }

        System.out.println(swaps);
    }
}
