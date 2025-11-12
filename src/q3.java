import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter x and y (integers): ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    
    int sum = num1 + num2;
    int div = sum / num3;
            double result = (double)sum / num3;
    System.out.println(sum);
    if(num3 == 0){
System.out.println("Error: division by zero");
    } else {
       
        System.out.println("The sum is divisible by " + num3);
        System.out.println("Integer division sum / z = " + div);
        System.out.format("Floating division sum / z = " + result);
    }
    }
}