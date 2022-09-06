public class friendsPairing {
    public static int pairs(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice single
        int fnm1=pairs(n-1);
        //pair
        int fnm2=pairs(n-2);
        int pairWays=fnm2*(n-1);
         int totalPairs=fnm1+pairWays;
         return totalPairs;
    }
 public static void main(String args[]){
          System.out.println(pairs(3));
 }    
}
