import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println("n is not prime number");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= n - 1; i++) {
                    if (i % n == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                        System.out.println("n is prime Number");
                    }else{
                        System.out.println("n is not prime Number");
                    }
            }

        }
    }
}
