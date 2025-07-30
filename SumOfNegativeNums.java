import java.util.*;

public class SumOfNegativeNums {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, -2, -3, 4, 5, 10, -6);
        int result = list.stream().filter(e -> e < 0).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
