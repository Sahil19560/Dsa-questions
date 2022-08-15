import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int number){
        int rev=0;
        int palindrome=number;
        while(palindrome!=0){
            int rem=palindrome%10;
            rev=rev*10+rem;
            palindrome/=10;

        }
        if(rev==number){
            return true;
        }else{
           return false;
        }
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number : ");
            int n=sc.nextInt();
            if(isPalindrome(n)){
                System.out.println(n+" is palindrome");
            }else{
                System.out.println(n+" is notpalindrome");
            }
        }    
}
