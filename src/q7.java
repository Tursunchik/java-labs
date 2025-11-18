import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter signal quality (0–10): ");
        int sig = keyboard.nextInt();
        switch(sig){
            case 0:
            case 1:
            case 2:
            System.out.println("Very weak signal.");
            break;
            case 3:
            case 4:
            System.out.println("Weak signal.");
            break;
            case 5:
            case 6:
            System.out.println("Moderate signal.");
            break;
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("Strong signal.");
            break;
            default:
            System.out.println("Invalid signal level.");
            break;
        }
        
// System.out.print("Enter signal quality (0–10): ");
// sig = keyboard.nextInt();
// if (sig == 0 || sig == 1 || sig == 2) {
//  System.out.println("Very weak signal.");
// }
// else if (sig == 3 || sig == 4) {
//  System.out.println("Weak signal.");
// }
// else if (sig == 5 || sig == 6) {
//  System.out.println("Moderate signal.");
// }
// else if (sig == 7 || sig == 8 || sig == 9 || sig == 10) {
//  System.out.println("Strong signal.");
// }
// else {
//  System.out.println("Invalid signal level.");
// }

    }
}
