import java.util.Scanner;

public class Employee {

    String department;
    String employeeID;
    String name;
    int yearsOfExperience;
    double baseSalary;
    boolean isFullTime;

    Scanner sc = new Scanner(System.in);

    void readInformation() {
        System.out.println("Employee ID:");
        employeeID = sc.nextLine();

        System.out.println("Name:");
        name = sc.nextLine();

        System.out.println("Years of experience:");
        yearsOfExperience = sc.nextInt();

        System.out.println("Base Salary:");
        baseSalary = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Full-Time (Yes/No):");
        String fullTimeInput = sc.nextLine();

        isFullTime = fullTimeInput.equalsIgnoreCase("Yes");
    }

    void predictAnnualIncome(int option) {
        double income;

        if (option == 1) { 
            income = (baseSalary * 12) + (yearsOfExperience * 250);
            if (isFullTime) {
                income += 5000;
            }
            System.out.println(
                "This employee earns " + income + " TL as annual income in Turkey."
            );
        } else {
            income = (baseSalary * 24) - (yearsOfExperience * 500);
            if (!isFullTime) {
                income -= 3000;
            }
            System.out.println(
                "This employee earns " + income + " TL as annual income abroad."
            );
        }
    }

    void printInformation() {
        if (isFullTime) {
            System.out.println(
                name + ", whose employee ID is " + employeeID +
                ", is working in the \"" + department + "\" department as a full-time employee with " +
                yearsOfExperience + " years of experience. " +
                name + " has a base salary of " + baseSalary + " TL."
            );
        } else {
            System.out.println(
                name + ", whose employee ID is " + employeeID +
                ", is working in the \"" + department + "\" department as a part-time employee with " +
                yearsOfExperience + " years of experience. " +
                name + " has a base salary of " + baseSalary + " TL."
            );
        }
    }
}

