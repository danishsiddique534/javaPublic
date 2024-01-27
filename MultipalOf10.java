import java.util.Scanner;

public class MultipalOf10 {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
        

        do {
            System.out.print("Enter a Number: ");
            int num= sc.nextInt();
            if (num %10 == 0) {
                break;
            }
        } while (true);
      }
    }
}
