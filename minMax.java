public class minMax {
    
    
    static class pair{
        int max;
        int min;
    }
    static pair getMinMax(int arr[],int n){
        pair minmax=new pair();
        if(n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
        }
        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
            
        }else{
            minmax.max=arr[1];
            minmax.min=arr[0];
        }
        
        for(int i=2;i<n;i++){
            if(arr[i]>minmax.max){
                minmax.max=arr[i];
            }else if(arr[i]<minmax.min){
                minmax.min=arr[i];
            }
        }
        return minmax;
    }
    public static void main(String args[])
    {   
                 int[] arr={-2,1,-4,5,3};
        int n=5;
        pair minmax = getMinMax(arr, n);
        System.out.println("min"+minmax.min);
        System.out.println("max"+ minmax.max);
 
    }
}


