public class Executive extends PaidEmployee {
    private double salary;
    private double bonus;

    public Executive(String name, String address, String ssn, double salary, double bonus) {
        super(name, address, ssn);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double earning() {
        return salary + bonus;
    }

    public String toString() {
        return "Executive\nName: " + getName() + "\nAddress: " + getAddress() + "\nSSN: " + getSsn() + "\nSalary: " + salary + "\nBonus: " + bonus + "\nPaid: " + earning();
    }
}
