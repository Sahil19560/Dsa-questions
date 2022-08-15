public class invertedHalhPyramid {
    public static void ihp(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(rows>cols||rows==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
     ihp(4,4);
    }
    
}
