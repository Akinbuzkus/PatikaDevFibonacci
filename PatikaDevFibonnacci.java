
import java.util.Scanner;


public class PatikaDevFibonnacci {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number of fibonacci :");
        int number=scan.nextInt();
        int fibo;
        int sum=0;
        for(int i=0;i<=number;i++){
             fibo=+i;
            sum+=fibo;
            System.out.print(i+" ");
        }
        System.out.println("fibonnaci :"+sum);
    }
}
