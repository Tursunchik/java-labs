import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;

        System.err.print("Enter a positive number: ");
        int num = sc.nextInt();
        
        System.out.print("Even numbers: "); 

        for(int i = 1; i <= num; i++){
            
            if(num % 2 == 0){
                System.out.print(i + " ");
                even += i;
            }

        }
        System.out.println();
        System.out.println("Sum = " + even);
    }
}
