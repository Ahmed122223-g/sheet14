public abstract class PaidEmployee extends Employee {
    private String ssn;

    public PaidEmployee(String name, String address, String ssn) {
        super(name, address);
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
}
