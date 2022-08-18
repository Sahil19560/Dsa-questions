public class linearSearch {
    public static void ls(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        int arr[]={1,6,8,5,4,8,3};
        int key;
        ls(arr,8);
    }
}
