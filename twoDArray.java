import java.util.*;
public class twoDArray {
    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                  if(matrix[i][j]==key){
                    System.out.println("element found at index : "+i+","+j);
                    return true;

                  }

            }
        }
        return false;
    }
           public static void main(String args[]){
            int n=3,m=3;
            int matrix[][]=new int[n][m];
            Scanner sc=new Scanner(System.in);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            search(matrix,8);
           }   
}
