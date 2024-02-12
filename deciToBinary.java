public class deciToBinary {
    public static void decTobin(int n) {
        int pow = 0;
        int mynum = n;
        int binNUm=0;
        while (n > 0) {
            int rem = n % 2;
            binNUm = binNUm + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }
        System.out.println("binary form of " +mynum+" = "+binNUm);
    }

    public static void main(String[] args) {
decTobin(7);
    }
}
