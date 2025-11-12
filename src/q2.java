import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2-letter word: ");
        System.out.println("Enter padding number: ");
        String str = sc.nextLine();
        int padding = sc.nextInt();
        char ch = (char)((int)(str.charAt(0) + padding));
        char ch2 = (char)((int)(str.charAt(1) + padding));
        System.out.println("Original word: " + str);
        System.out.println("Padding: " + padding);
        System.out.println("Encrypted word: " +ch + ch2);
    }
}
