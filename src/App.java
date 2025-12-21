import java.util.Scanner;

public class App {
    static Employee[] employees = new Employee[100];
    static int count = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String choice;

        do {
            System.out.println("1. Enter new employee");
            System.out.println("2. Delete employee");
            System.out.println("3. Print all employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextLine();

            if (choice.equals("1")) {
                addEmployee();
            } else if (choice.equals("2")) {
                deleteEmployee();
            } else if (choice.equals("3")) {
                printEmployees();
            }else if (choice.equals("4")) {
                System.out.println("Goodbye!");
            }else {
                System.out.println("Invalid input!");
            }
        } while (!choice.equals("4"));
    }

    static void addEmployee() {
        System.out.println("1. Volunteer");
        System.out.println("2. Executive");
        System.out.println("3. Monthly Employee");
        System.out.println("4. Hourly Employee");
        System.out.println("5. Exit");
        System.out.print("Select category: ");
        String choice = input.nextLine();

        switch (choice) {
            case "1": {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter address: ");
                String address = input.nextLine();
                employees[count++] = new Volunteer(name, address);
                break;
            }
            case "2": {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter address: ");
                String address = input.nextLine();
                System.out.print("Enter SSN: ");
                String ssn = input.nextLine();
                System.out.print("Enter salary: ");
                double salary = input.nextDouble();
                input.nextLine();
                System.out.print("Enter bonus: ");
                double bonus = input.nextDouble();
                input.nextLine();
                employees[count++] = new Executive(name, address, ssn, salary, bonus);
                break;
            }
            case "3": {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter address: ");
                String address = input.nextLine();
                System.out.print("Enter SSN: ");
                String ssn = input.nextLine();
                System.out.print("Enter salary: ");
                double salary = input.nextDouble();
                input.nextLine();
                employees[count++] = new MonthlyEmployee(name, address, ssn, salary);
                break;
            }
            case "4": {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter address: ");
                String address = input.nextLine();
                System.out.print("Enter SSN: ");
                String ssn = input.nextLine();
                System.out.print("Enter wage per hour: ");
                double wage = input.nextDouble();
                input.nextLine();
                System.out.print("Enter hours worked: ");
                double hours = input.nextDouble();
                input.nextLine();
                employees[count++] = new HourlyEmployee(name, address, ssn, wage, hours);
                break;
            }
            case "5":{
                break;
            }
            default: {
                System.out.println("Invalid input!");
                return;
            }
        }
    }

    static void deleteEmployee() {
        if (count == 0) {
            System.out.println("No employees.");
            return;
        }
        System.out.print("Enter employee name to delete: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Deleted successfully.");
                return;
            }
        }
        System.out.println("Not found.");
    }

    static void printEmployees() {
        if (count == 0) {
            System.out.println("No employees.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].toString());
            System.out.println("-------------------");
        }
    }
}
