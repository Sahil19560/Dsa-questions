public class tillingProblem {
    public static int tp(int n){

        if(n==0 || n==1){
            return 1;        
        }
        //vertically choice 
        int nm1=tp(n-1);
        //horizontally
        int nm2=tp(n-2);
        int totalWays=nm1+nm2;
        return totalWays;
    }
    public static void main(String args[]){
            System.out.println(tp(4));
    }
    
}
