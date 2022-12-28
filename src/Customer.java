public class Customer {
    String name,email;
    double creditLimit;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public Customer() {
        this("Adam","Black@gmail.com",25000.00);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer(String name, String email) {
        this(name, email,65000.00);
    }
}
