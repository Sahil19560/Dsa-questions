public class recursion3 {
    public static int calculateFact(int n){
       if(n==0){
        return 1;
       } 
       int fnm1=calculateFact(n-1);
       int factorial=n*fnm1;
       return factorial;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(calculateFact(n));
    }
}
