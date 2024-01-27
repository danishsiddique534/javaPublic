import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int counter = 1;

            // while (counter <= 10) {
            // System.out.print(counter+" ");
            // counter++;
            // }


            
            // int n = sc.nextInt();
            // int Counter = 1;
            // while (Counter <= n) {
            // System.out.print(Counter+" ");
            // Counter++;
            // }


            int n = sc.nextInt();
            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
