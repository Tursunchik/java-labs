import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0;
        int failed = 0;
        System.out.println("Enter class size: ");
        int classSize = sc.nextInt();
        if(classSize > 0){
            for(int i = 1; i <= classSize;i++){
                System.out.println("Enter the grade between 0 and 50 for student " + i + ": ");
                int grade = sc.nextInt();
                if(grade < 0 && grade > 50){
                    System.out.println("Grade is out of range");
                } else if (grade < 30){
                    failed++;
                    avg += grade;
                } else if (grade >= 0 && grade <= 50){
                  avg += grade;
                } 
        }
    } else{
        classSize = 1;
        System.out.println("Enter the grade between 0 and 50 for student " + 1 + ": ");
        int grade = sc.nextInt();
        if( grade < 30){
        failed++;
        avg += grade;
        } else {
            avg += grade;
        }
    }
    System.out.println("Average of the grades is: " + (avg/classSize));
    System.out.println("Number of failed students are: " + failed);
}
}