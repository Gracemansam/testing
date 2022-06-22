public class Vipperson {
    private String name;
    private double creditLimit;
    private String email;

    public Vipperson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Vipperson(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public Vipperson() {
        this("Defaultname", 50000, "unknown@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
