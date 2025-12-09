import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter capacity of the array: ");
        int capacity = sc.nextInt();
        int [] arr = new int[capacity];
        for(int i = 0; i < capacity;i++){
            System.out.println("Please enter the element " + (i+1) +" of the array:" );
            arr[i] = sc.nextInt();
        }
    boolean isSorted = true;
        for(int i = 1; i < capacity;i++){
            
            
             if(arr[i-1] > arr[i])
                isSorted = false;
        }
        if(isSorted == true){
            System.out.println("This array is in ascending order.");
          } else {
            System.out.println("This array is not in ascending order.");
          }
    }
}
