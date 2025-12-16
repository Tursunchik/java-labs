import java.util.Scanner;

public class  Employee {
    String department;
    String employeeID;
    String name;
    int yearsOfExperience;
    double baseSalary;
    boolean isFullTime;
    Scanner sc = new Scanner(System.in);
    void readInformation(){
       System.out.println("Employee ID: ");
       this.employeeID = sc.nextLine();

        System.out.println("Name: " );
        this.name = sc.nextLine();

        System.out.println("Years of study: " + yearsOfExperience);
        this.yearsOfExperience = sc.nextInt();

        System.out.println("GPA: " );
        this.baseSalary = sc.nextDouble();

        System.out.println("Full-Time (Yes/No): " + isFullTime);
        this.isFullTime = sc.nextBoolean();
    }

    void predictAnnualIncome(int option){
        int TurkeyIncome = 0;
        int AbroadIncome = 0;

        if(option == 1 && isFullTime == true){
            TurkeyIncome += (baseSalary * 12) + (yearsOfExperience * 250) + 5000;
        } else if( option == 1 && isFullTime == false){
            TurkeyIncome += (baseSalary * 12) + (yearsOfExperience * 250) - 3000; 
        } else if (option == 2 && isFullTime == true){
            AbroadIncome += (baseSalary * 24) - (yearsOfExperience * 500) + 5000;
        } else {
            AbroadIncome += (baseSalary * 24) - (yearsOfExperience * 500) - 3000;
        }
        
     }
     void printInformation(){
        if(isFullTime == true){
            System.out.println(name + ", whose employee ID is  " + employeeID + ", is working in the " + department + "department as a full-time employee with " + yearsOfExperience + " years of experience. " + name + " has a base salary of " + baseSalary);
        } else {
            System.out.println(name + ", whose employee ID is  " + employeeID + ", is working in the " + department + "department as a part-time employee with " + yearsOfExperience + " years of experience. " + name + " has a base salary of " + baseSalary);
        }
        
     }
}
