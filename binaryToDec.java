public class binaryToDec {
    public static void binToDec(int binNUm){
        int mynum=binNUm;
        int pow=0;
        int decNum=0;
        while (binNUm>0) {
            int lastdigit= binNUm%10;
            decNum= decNum + (lastdigit* (int)Math.pow(2, pow));
            
            pow++;
            binNUm=binNUm/10;

        }
        System.out.println("decimal of "+mynum+" = "+decNum);
    }
    public static void main(String[] args) {
          binToDec(101);
    }
}
