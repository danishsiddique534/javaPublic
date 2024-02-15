public class AdvPattern2 {
    public static void hollow_pattern(int totlRow, int totlColm) {
        //outer loop for printing how many line or rows we have to print in this rectangle
        for (int i = 1; i <= totlRow; i++) {
            //inner loop for printing how many cells we have to print in this rectangle (coloums)
            for (int j = 1; j <= totlColm; j++) {
                // cell - i,j
                if (i == 1 || i == totlRow || j == 1 || j == totlColm) {
                    //boudry cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
hollow_pattern(4, 4);
    }
}
