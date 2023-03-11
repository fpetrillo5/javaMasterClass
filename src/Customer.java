public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(){
        this("default name", 1000.00, "default@email.com");
    }

    public Customer(String name, String emailAddress){
        this(name, 1001.00, emailAddress);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
