import java.util.Scanner;

public class ContinueStatment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter a Number : ");
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    continue;
                }
                System.out.println("Your Continue Number is: "+num);
            } while (true);

        }

    }
}
