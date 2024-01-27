import java.util.Scanner;

public class conditionStatment {
    public static void main(String[] args) {
        try (Scanner myAge = new Scanner(System.in)) {
            int age = myAge.nextInt();
            if (age >=18) {
                System.out.println("Congratualation! 'Now your adult'!! ");
            } 
            if (age >=13 && age <18) {
                System.out.println("you are teen :)");
            }else {
                System.out.println("Oops!, Your not adult");
            }
        }
    }
}