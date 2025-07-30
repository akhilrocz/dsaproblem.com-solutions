
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] arr = new int[n];

        List<Integer> a = Arrays.asList(1,2,2,4,-1,10,-9,10);
       // a.stream().forEach(System.out::println);

        //Set<Integer> c = a.stream().distinct().collect(Collectors.toSet());

        //c.forEach(System.out::println);

        int result = a.stream().filter(e->e>0).reduce(0, (c,b)-> c+ b);

        System.out.println(result);

        // for(int i=0;i<n;i++){
        //     arr[i]=scanner.nextInt();
        // }

        // Set<Integer> set = new HashSet<>();

        // for(int j=0;j<n;j++){
        //     set.add(arr[j]);
        // }

        // for(Integer num:set){
        //     System.out.print(num+" ");
        // }

        // scanner.close();
    }
}
