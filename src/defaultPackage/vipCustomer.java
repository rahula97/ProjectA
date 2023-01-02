package defaultPackage;
public class vipCustomer {
    private String name,email;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public vipCustomer(String name, String email) {
        this(name,email,0.00);
    }

    public vipCustomer() {
        this("Arjen","max@gmail.com",25.00);
        System.out.println("default Constructor");
    }

    public vipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }
}
