
import java.util.*;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,5,10};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("max element is "+max);
    }
}
