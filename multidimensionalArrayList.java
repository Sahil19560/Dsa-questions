import java.util.ArrayList;
public class multidimensionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        list1.add(0);list1.add(1);
        list2.add(3);list2.add(4);
        list3.add(5);list3.add(6);
        main.add(list1);
        main.add(list2);
        main.add(list3);
        System.out.println(main);
        for(int i=0;i<main.size();i++){
            ArrayList<Integer> currList=main.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j));

            }
            System.out.println();
        }
        

    }
    
}
