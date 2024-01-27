import java.util.Scanner; // import the Scanner class 

public class JavaBasic {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc .nextFloat();
            float area = 3.14f * rad * rad;
            System.out.println(area);
        }

    }
}
