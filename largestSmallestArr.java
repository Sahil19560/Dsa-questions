import java.util.*;
public class largestSmallestArr {
    public static int ls(int arr[]){
          int smallest=Integer.MAX_VALUE;
          int largest=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
          if(arr[i]>largest){
                 largest=arr[i];
          }
          if(arr[i]<smallest){
            smallest=arr[i];
          }
        }
        System.out.println("smallest no. is : "+smallest);
        System.out.print("largest No. is :");
        return largest;
    }
    public static void main(String args[]){
        int arr[]={1,4,5,7,2,9};
        
        System.out.println(ls(arr));

    }
}
