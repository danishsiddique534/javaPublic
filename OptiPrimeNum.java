import java.util.Scanner;

public class OptiPrimeNum {

    public static boolean isPrime(int n) {
        // if (a == 2) {
        //     return true;

        // }
        // for (int i = 2; i <= Math.sqrt(a); i++) {
        //     if (a % i == 0) {
        //         return false;
        //     }
        // }
        // return true;

         
             
            if (n == 2) {
                return true;

                // System.out.println("n is not prime number");
            } else {
                
                for (int i = 2; i <= n - 1; i++) {
                    if (i % n == 0) {
                        return false;
                    }
                }
                // if (true) {
                //         System.out.println("n is prime Number");
                //     }else{
                //         System.out.println("n is not prime Number");
                //     }
            }
            return true;

        
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(12));
        try(Scanner sc = new Scanner(System.in) ){

            int n= sc.nextInt();
            boolean prime=isPrime(n);
            System.out.println("n is prime Number");
             
        }
    }
}
