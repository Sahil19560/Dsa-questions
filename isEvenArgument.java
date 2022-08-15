import java.util.*;
public class isEvenArgument {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
      System.out.println("enter value");
      int a=sc.nextInt();
      if(isEven(a)){
        System.out.println("no. is even");
      }else{
        System.out.println("no. is not even");
      }
    }
    
}
