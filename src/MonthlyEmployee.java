public class MonthlyEmployee extends PaidEmployee {
    private double salary;

    public MonthlyEmployee(String name, String address, String ssn, double salary) {
        super(name, address, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double earning() {
        return salary;
    }

    public String toString() {
        return "Monthly Employee\nName: " + getName() + "\nAddress: " + getAddress() + "\nSSN: " + getSsn() + "\nSalary: " + salary + "\nPaid: " + earning();
    }
}
