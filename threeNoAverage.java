import java.util.Scanner;
public class threeNoAverage {
    public static double threeNoAverg(double a,double b,double c){
        
    return (a+b+c)/3;
    }
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter value of a");
       double a=sc.nextDouble();
 
       System.out.println("enter value of b");
       double b=sc.nextDouble();
 
       System.out.println("enter value of c");
       double c=sc.nextDouble();
 
      System.out.println("average of three no. is : " + threeNoAverg(a,b,c)); 
    }
}
