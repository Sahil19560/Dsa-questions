public class binaryStrings {
    public static void bs(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        bs(n-1,0,str+"0");
        if(last==0){
            bs(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
     bs(3,0,"");
    }
    
}
