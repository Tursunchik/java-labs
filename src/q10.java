import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        
        int num = sc.nextInt(); 
        System.out.println("*"); 
        if (num == 5){
            num = 2;
          
        }
        for(int i = num; i > 1; i--) { 
            System.out.print("*");
            for(int j = i; j <= num; j++) {
                System.out.print(" " + (j - 1));
            }
            System.out.println();
        }

    }
}
