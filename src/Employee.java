import java.util.Scanner;

public class Employee {

    String department;
    String employeeID;
    String name;
    int yearsOfExperience;
    double baseSalary;
    boolean isFullTime;

    void readInformation(Scanner sc) {
        System.out.println("Employee ID:");
        employeeID = sc.nextLine();

        System.out.println("Name:");
        name = sc.nextLine();

        System.out.println("Years of experinece:");
        yearsOfExperience = Integer.parseInt(sc.nextLine());

        System.out.println("Base Salary:");
        baseSalary = Double.parseDouble(sc.nextLine());

        System.out.println("Full-Time (Yes/No):");
        String fullTimeInput = sc.nextLine();
        isFullTime = fullTimeInput.equalsIgnoreCase("Yes");
    }

    void predictAnnualIncome(int option) {
        double income;
        if (option == 1) {
            income = (baseSalary * 12) + (yearsOfExperience * 250);
            if (isFullTime) income += 5000;
            System.out.println("This employee earns " + income + " TL as annual income in Turkey.");
        } else {
            income = (baseSalary * 24) - (yearsOfExperience * 500);
            if (!isFullTime) income -= 3000;
            System.out.println("This employee earns " + income + " TL as annual income abroad.");
        }
    }

    void printInformation() {
        if (department == null) department = "N/A";
        String workStatus = isFullTime ? "full-time" : "part-time";
        System.out.println(name + ", whose employee ID is " + employeeID +
                ", is working in the \"" + department + "\" department as a " + workStatus +
                " employee with " + yearsOfExperience + " years of experience. " +
                name + " has a base salary of " + baseSalary + " TL.");
    }
}

