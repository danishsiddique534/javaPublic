import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Number = sc.nextInt();

            switch (Number) {
                case 1:
                    System.out.println(" Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thusday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("Satrday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid weekNumber");
                    break;

            }
        }
    }
}
