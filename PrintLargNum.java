import java.util.Scanner;

public class PrintLargNum {
    public static void main(String[] args) {
        try (Scanner myNum = new Scanner(System.in)) {
            int a = myNum.nextInt();
            int b = myNum.nextInt();
            if (a>=b) {
                System.out.println("A is the largest Number"                                                                                                           );
            } else {
                System.out.println("B is the largest Number");
            }
        }
    }
}
