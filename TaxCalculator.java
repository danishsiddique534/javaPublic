import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        try (Scanner MyTax = new Scanner(System.in)){
            int Income = MyTax.nextInt();
            int tax;
            if (Income < 500000) {
                 tax = 0;
                
            } else if (Income >= 500000 && Income <= 1000000)  {
                 tax = (int) (Income / 0.2);
            }
            else { 
                tax = (int)(Income /0.3);
            }
            System.out.println("Your tax is :" + tax);
        }
    }
}
