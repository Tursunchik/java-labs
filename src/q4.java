import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int front = 500;
        int middle = 300;
        int back = 100;
        double total = 0;

        System.out.println("Ticket type (front/middle/back): ");
        String type = sc.nextLine();

        System.out.println("Number of tickets: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("Discount code (STUDENT/BULK4/NONE): ");
        String disc = sc.nextLine();

        if (type.equalsIgnoreCase("front")) {
            total = front;
        } else if (type.equalsIgnoreCase("middle")) {
            total = middle;
        } else if (type.equalsIgnoreCase("back")) {
            total = back;
        } else {
            System.out.println("Invalid ticket type!");
            return;
        }

        if (count <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        total *= count;

        if (disc.equalsIgnoreCase("STUDENT")) {
            total *= 0.75;
        } else if (disc.equalsIgnoreCase("BULK4") && count >= 4) {
            total *= 0.85;
        }

        System.out.println("Total : " + Math.round(total));
    }
}
