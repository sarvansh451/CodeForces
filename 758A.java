import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int sum = 0;
 
        for (int i = 0; i <= t; i++) {
            String poly = scanner.nextLine();
            int faces = findfaces(poly);
            sum += faces;
        }
 
        System.out.println(sum);
        scanner.close();
    }
 
    public static int findfaces(String poly) {
        int count = 0;
        if (poly.equals("Tetrahedron")) {
            count = count + 4;
        }
        if (poly.equals("Octahedron")) {
            count = count + 8;
        }
        if (poly.equals("Cube")) {
            count = count + 6;
        }
        if (poly.equals("Dodecahedron")) {
            count = count + 12;
        }
        if (poly.equals("Icosahedron")) {
            count = count + 20;
        }
        return count;
    }
}
