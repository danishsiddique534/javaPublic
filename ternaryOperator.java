import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
      try( Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        String type = ((num % 2 ) == 0 )? "even": "odd";
        System.out.println(type);
      }
    }
}
