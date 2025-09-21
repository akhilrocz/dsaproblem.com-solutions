import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prod=1;
        for(int i=1;i<=n;i++){
            prod*=i;
        }

        int count=0;

        String s = String.valueOf(prod);
        for(int j=s.length()-1;j>=0;j--){
            if(s.charAt(j)==1){
                count++;
            }
        }

        System.out.println(count);



        scanner.close();
    }
}
