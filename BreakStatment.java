import java.util.Scanner;

public class BreakStatment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
             
            for (int i = 1; i <=10; i++) {
                if (i<=3) {
                    System.out.println(i);
                
                }
                
            }
            System.out.println("I'm out of the loop!");
        }

    }
}
