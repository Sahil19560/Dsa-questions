public class subArrays {
    public static void printsubArr(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int start=i;

            for(int j=i;j<arr.length;j++){
                int end=j; 
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                
                }
                count++;
            
                System.out.println();
                
            }
            System.out.println();
        
        }
        
        System.out.println("count subarrays=" + count);
    }
    public static void main(String args[]){

        int arr[]={2,4,6,8,10};
        printsubArr(arr);
        
    }
}
