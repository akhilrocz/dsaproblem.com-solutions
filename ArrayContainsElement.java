
import java.util.*;
public class ArrayContainsElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        Arrays.sort(arr);

        int target = scanner.nextInt();

        //binary search

        int left=0;
        int right = arr.length-1;

        while(left<right){
            int mid =left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(true);
                return;
            }else if(arr[mid]<target){
                left=mid+1;
            }else if(arr[mid]>target){
                right=mid-1;
            }
            scanner.close();
        }


        System.out.println(false);


    }
    
}
