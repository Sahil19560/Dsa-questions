public class reverseOfArray {
    public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[]={1,4,7,9,32,45,76};
        System.out.println("before");
        printArray(arr);
          reverse(arr);
         System.out.println("after");
          printArray(arr);   
    }
    
}
