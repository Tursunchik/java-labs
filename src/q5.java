import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Battery Quality Checker");

        System.out.println("Enter capacity (mAh): ");
        int capacity = sc.nextInt();

        System.out.println("Enter internal resistance (ohm): ");
        double resistance = sc.nextDouble();

        System.out.println("Enter cycle count: ");
        int cycle = sc.nextInt();

        if(capacity > 3000 && resistance < 0.07 && cycle > 800){
            System.out.println("This is grade 10 battery");
        } else if (capacity > 3000 && resistance < 0.07){
            System.out.println("This is grade 9 battery");
        } else if (resistance < 0.07 && cycle > 800){
            System.out.println("This is grade 8 battery");
        } else if (capacity > 3000 && cycle > 800){
            System.out.println("This is grade 7 battery");
        } else if(capacity > 3000 || resistance < 0.07 || cycle > 800){
            System.out.println("This is grade 6 battery");
        } else {
            System.out.println("This is grade 5 battery");
        }
}
}