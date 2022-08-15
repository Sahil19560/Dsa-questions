import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class sumOfDigit {
    public static void sumD(int number){
        int sum=0;
        
        while(number!=0){
            int lastDigit=number%10;
            sum+=lastDigit;
            number/=10;
        }

         System.out.println(sum);
        


    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number : ");
      int n=sc.nextInt();
      sumD(n);

    }
    
}
