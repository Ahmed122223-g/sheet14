public class Volunteer extends Employee {

    public Volunteer(String name, String address) {
        super(name, address);
    }

    public double earning() {
        return 0;
    }

    public String toString() {
        return "Volunteer\nName: " + getName() + "\nAddress: " + getAddress() + "\nThanks!";
    }
}
