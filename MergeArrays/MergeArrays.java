package MergeArrays;

import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
       for(int i=0;i<n;i++){
        arr1[i]=scanner.nextInt();
       }

       int m = scanner.nextInt();
       int[] arr2 = new int[m];

       for(int j=0;j<m;j++){
        arr2[j]=scanner.nextInt();
       }

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       int[] res = new int[n+m];
       for(int p=0;p<n;p++){
        res[p]=arr1[p];
       }

       for(int q=0;q<m;q++){
        res[q+n]=arr2[q];
       }

       System.out.println(Arrays.toString(res));

       scanner.close();
    }
}
