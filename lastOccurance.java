public class lastOccurance {
    public static int lastOccur(int arr[], int key,int i){
                  if(i==arr.length){
                    return -1;
                  }
                  int isFound=lastOccur(arr,key,i+1);
                  if(isFound==-1 && arr[i]==key){
                    return i;
                  }
                  return isFound;

    }
    public static void main(String args[]){
          int arr[]={5,5,5,5,5};
        System.out.println(lastOccur(arr,5,0));
    }
    
}
