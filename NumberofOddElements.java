
import java.util.*;

public class NumberofOddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
