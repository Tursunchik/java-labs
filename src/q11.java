import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for(int i = 1; i <= 10;i++){
            System.out.println( i +". number: ");
            int num = sc.nextInt();
            if(max < num)
            max = num;
            
        }
        System.out.println("The largest number is: " + max);
    }
}
