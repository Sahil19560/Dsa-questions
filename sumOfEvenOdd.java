import java.util.*;
public class sumOfEvenOdd {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
   
    int choice;
    int evenSum=0;
    int oddSum=0;
    
     do{ 
        System.out.println("enter the value of n");
        int number=sc.nextInt();
           if(number%2==0){
            evenSum+=number;
           }else{
            oddSum+=number;
          
           }
           System.out.println("if u want to enter more number enter 1 or nor prees 0:");
           choice=sc.nextInt();
     }while(choice==1);
     System.out.println("evensum: " +evenSum);
     System.out.println("oddSum: "+oddSum);
}
}
