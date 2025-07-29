
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int max=-1;
        int second_max = -1;

        for(int j=0;j<n;j++){
            if(arr[j]>max){
                second_max=max;
                max=arr[j];  //1  //2 //3  //4  //5
            }  else if(arr[j]!=max && arr[j]>second_max){
                second_max=arr[j];
            }
        }
       
        System.out.println(second_max);

        scanner.close();
    }
}
