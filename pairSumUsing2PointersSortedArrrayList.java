
import java.util.ArrayList;
public class pairSumUsing2PointersSortedArrrayList {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int rp=list.size()-1;
        int lp=0;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(6);
            int target=10;
            System.out.println(pairSum(list,target));
        
    }
    
}
