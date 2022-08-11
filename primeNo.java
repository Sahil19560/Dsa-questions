import java.util.*;
public class primeNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is a prime number");
        }else{
             boolean isBoolean=true;
             for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isBoolean=false;
                    
                }
                if(isBoolean==true){
                    System.out.println("N IS PRIME");

                }else{
                    System.out.println("n is not prime");
                }


             }
        }
    }
    
}
