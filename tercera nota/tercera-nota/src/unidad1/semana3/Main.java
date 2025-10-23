package semana3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        rh employee = new rh();
        
        System.out.println("---------Menu Principal---------");
        System.out.println("1. Add Employee");
        System.out.println("2. view employee information");
        System.out.println("3. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.println("Adding Employee...");

                System.out.println("Enter Name, Salary, Role:");
                employee.setName(sc.nextLine());
                employee.setSalary(sc.nextDouble());
                sc.nextLine();  // Consume newline
                employee.setRole(sc.nextLine());

                System.out.println("🔔: Employee Added Successfully ✅");
                break;

            case "2":
                System.out.println("Viewing Employee Information...");

                if (employee.getName() == null) {
                    System.out.println("No employee data available. Please add an employee first.");
                    // break;
                }else{
                    System.out.println("Employee Information:");
                    employee.displayInfo();
                }
                break;

            case "3":
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
