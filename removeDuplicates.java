public class removeDuplicates {
    public static void rd(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;

        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            rd(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            rd( str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String args[]){
      String str="appnnacollege";
      
      rd(str,0,new StringBuilder(""),new boolean[26]);
}
    
}
