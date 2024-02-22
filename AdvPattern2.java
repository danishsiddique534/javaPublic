public class AdvPattern2 {
    public static void hollow_pattern(int totlRow, int totlColm) {
        // outer loop for printing how many line or rows we have to print in this
        // rectangle
        for (int i = 1; i <= totlRow; i++) {
            // inner loop for printing how many cells we have to print in this rectangle
            // (coloums)
            for (int j = 1; j <= totlColm; j++) {
                // cell - i,j
                if (i == 1 || i == totlRow || j == 1 || j == totlColm) {
                    // boudry cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void half_priamid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertPrimidPttrnNumb(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print(j);

            }
            System.err.println();
        }
    }

    public static void Floyid_tringle(int b) {
        int counter = 1;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.err.println();
        }
    }

    public static void zero_one_tringle(int d) {
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // upper half

        for (int i = 1; i <= n; i++) {
            // for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // lower half

        for (int i = n; i >= 1; i--) {
            // for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void diamond_pattern(int n) {
        // upper half of the diamond pattern 
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half of the diamond pattern 
        for (int i = n - 1; i >= 1; i--) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // half_priamid(5);
        // invertPrimidPttrnNumb(85);
        // Floyid_tringle(5);
        // hollow_pattern(4, 4);
        // zero_one_tringle(5);
        //solid_Rhombus(5);
        //hollow_Rhombus(5);
        //butterfly(3);
        diamond_pattern(5);
    }
}
