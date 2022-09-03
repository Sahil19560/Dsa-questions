public class firstOccurance {
    public static int fo(int arr[],int i, int key){
                if(i==arr.length){
                    return -1;
                }
                if(arr[i]==key){
                    return i;
                }

                return fo(arr,i+1,key);
    }
    public static void main(String args[]){
          int arr[]={1,3,7,3,6,7,8};
          System.out.println(fo(arr,0,7));
    }
    
}
