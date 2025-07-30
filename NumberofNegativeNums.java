
import java.util.*;
public class NumberofNegativeNums {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,-1,-2,-3);

        
        int result = (int)list.stream().filter(e->e<0).count();

        System.out.println(result);

    }
}
