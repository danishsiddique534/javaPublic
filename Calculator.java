import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a :");
            int a = sc.nextInt();
            System.out.println("enter b :");
            int b = sc.nextInt();
            System.out.println("Operator");
            char Operator = sc.next().charAt(0);
            switch (Operator) {
                case '+':
                    System.out.println(a + b);

                    break;
                case '-':
                    System.out.println(a - b);

                    break;
                case '*':
                    System.out.println(a * b);

                    break;
                case '/':
                    System.out.println(a / b);

                    break;
                case '%':
                    System.out.println(a % b);

                    break;
                default: System.out.println("wrong Operator");
                    break;
            }
        }
    }
}
