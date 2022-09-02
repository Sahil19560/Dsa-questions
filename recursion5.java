public class recursion5 {
    public static int calculateSum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1=calculateSum(n-1);
        int sum=n+sumnm1;
        return sum;
    }
    public static void main(String args[]){
        int n=5;
      System.out.println(  calculateSum(n));
    }
    
}
