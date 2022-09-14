public class gridWaysProblem {
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){
            return 1;

        }else{
            if(i==n || j==m){
                return 0;
            }
        }
        //rightWays 
        int w1= gridWays(i,j+1,n,m);
        //downWays
        int w2=gridWays(i+1,j,n,m);
        return w1+w2;
    }
    public static void main(String arg[]){
        int n=3,m=3;
        System.out.print(gridWays(0,0,n,m));

    }
    
}
