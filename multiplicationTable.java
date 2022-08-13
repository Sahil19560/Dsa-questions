import java.util.Scanner;
public class multiplicationTable {
   public static void printMultiplication(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number : ");
       int n=sc.nextInt();
       for(int i=1;i<=10;i++){
        System.out.println(n+"*"+i +"="+n*i);
       }
   }
    public static void main(String args[]){
            printMultiplication();
    }
    
}
