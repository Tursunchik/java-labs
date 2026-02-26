
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Member ID: ");
String id = sc.nextLine();

System.out.println("Member Name: ");
String name = sc.nextLine();

System.out.println("Membership Fee: ");
double fee = sc.nextDouble();

        GymMember first = new GymMember(id, name);
        first.setMembershipFee(fee);
        System.out.println("Member ID: " + first.getMemberID());
        System.out.println("Member Name: " + first.getMemberName());
        System.out.println("Membership Fee: " + first.getMembershipFee());

    }
}