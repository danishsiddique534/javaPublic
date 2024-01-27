import java.util.Scanner;

public class EvenOddNum1 {
    public static void main(String[] args) {
        try (Scanner MyNum = new Scanner (System.in)){
            int Num = MyNum.nextInt();
            if (Num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } 
    }
}
