import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

     int temp=n;
     while(temp>=10){
        int sum=0;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }

        temp=sum;
     }

     System.out.println(temp);
        scanner.close();
    }
}
