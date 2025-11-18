import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" I have set a temperature between -10 and 40.");
        
            int guessTemp ;
        int guess = 0;
        int temp = 27;
        do{
            guess++;
            System.out.println("Guess the temperature:");
             guessTemp = sc.nextInt();
            if(guessTemp < temp && (-10 <= guessTemp) && (guessTemp <= 40)){
                System.out.println("Increase your guess");
                
            } else if(guessTemp > temp && (-10 <= guessTemp) && (guessTemp <= 40)){
                System.out.println("Decrease your guess");
                
            } else if ((-10 > guessTemp) || (guessTemp > 40)){
                System.out.println("Invalid temperature! Please enter a value between -10 and 40. ");
                guess--;

            } else if (guess == 1) {
                System.out.println("You have found the temperature after " + guess + " guess.");
        
            } else {
               System.out.println("You have found the temperature after " + guess + " guesses."); 
            }
            
        } while(27 != guessTemp);
    }
}
