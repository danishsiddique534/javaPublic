import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            int rev = 0;
            // while (num > 0) {
            //     int LastDigit = num % 10;
            //     System.out.print(LastDigit);
            //     num /=10;
            // }
             while (num>0) {
                int LastDigit = num%10;
                rev = (rev*10) + LastDigit;
                num/=10;
             }
             System.out.println(rev);
        }
    }
}
        