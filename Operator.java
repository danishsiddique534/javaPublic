import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            // int A = 10;
            // int B = 5;
            // System.out.println("Add = "  + (A+B));
            // System.out.println("Sub = "  + (A-B));
            // System.out.println("div = "  + (A/B));
            // System.out.println("Mul = "  + (A*B));
            // System.out.println("Mod = "  + (A%B));
            int a = 10;
           // System.out.println(a);
            int b = ++ a ;
            System.out.println(b);
            System.out.println(a);
        }
    }
}
