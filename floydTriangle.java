public class floydTriangle {
    public static void ft(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter++);
                
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
          ft(5);
    }
    
}
