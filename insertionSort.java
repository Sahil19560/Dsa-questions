public class insertionSort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void is(int arr[]){
        for(int i=1;i<arr.length;i++){
            int prev=i-1;
            int curr=arr[i];
           while(prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                  prev--;
           }  
           arr[prev+1]=curr;
    }
    
}
    public static void main(String args[]){
           int arr[]={5,4,3,2,1};
           is(arr);
           printarr(arr);

    }
    
}
