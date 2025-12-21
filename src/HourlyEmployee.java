public class HourlyEmployee extends PaidEmployee {
    private double wage;
    private double hours;

    public HourlyEmployee(String name, String address, String ssn, double wage, double hours) {
        super(name, address, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double earning() {
        return wage * hours;
    }

    public String toString() {
        return "Hourly Employee\nName: " + getName() + "\nAddress: " + getAddress() + "\nSSN: " + getSsn() + "\nWage per hour: " + wage + "\nHours worked: " + hours + "\nPaid: " + earning();
    }
}
