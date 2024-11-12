import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> v = new ArrayList<>(n);
        int odd = 0;
 
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            v.add(value);
            if (value % 2 != 0) {
                odd++;
            }
        }
 
        odd /= 2;
 
        for (int i = 0; i < v.size(); i++) {
            int x = v.get(i);
            if (x % 2 != 0) {
                if (odd > 0) {
                    odd--;
                    x--;
                } else {
                    x++;
                }
            }
            System.out.println(x / 2);
        }
 
        scanner.close();
    }
}
