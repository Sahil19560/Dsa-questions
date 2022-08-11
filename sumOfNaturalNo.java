import java.util.*;
public class sumOfNaturalNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        int sum=0;
        int counter=0;
        while(counter<=n){
            sum+=counter;
            counter++;

        }
        System.out.println(sum);

    }
}
