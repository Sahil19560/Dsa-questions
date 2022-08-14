public class binaryToDecimal {
    public static void binToDecimal(int binNum){
        
        int pow=0;
        int decNum=0;

        while(binNum>0){
            
            int lastDigit=binNum%10;
            int mynum=binNum;
            decNum=decNum+(lastDigit*(int)Math.pow(2,0));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String args[]){
       binToDecimal(111);
    }
}
