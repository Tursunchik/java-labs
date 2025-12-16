import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee firstEmployee = new Employee();
        Employee secondEmployee = new Employee();

        firstEmployee.department = "IT";
        secondEmployee.department = "HR";

        firstEmployee.employeeID = "E123";
        firstEmployee.name = "Burak";
        firstEmployee.yearsOfExperience = 6;
        firstEmployee.baseSalary = 33000.0;
        firstEmployee.isFullTime = true;

        firstEmployee.printInformation();
        firstEmployee.predictAnnualIncome(1);

        System.out.println("Enter information of the second employee:");
        sc.nextLine();
        secondEmployee.readInformation(sc);

        secondEmployee.printInformation();
        secondEmployee.predictAnnualIncome(2);

        sc.close();
    }
}
