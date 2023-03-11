public class Accountcc {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int deposit(double funds){
        if(funds <= 0){
            System.out.println("You cannot deposit a non positive amount");
            return -1;
        } else{
            this.accountBalance += funds;
            System.out.println("You have deposited: " + funds + " into" +
                    " your account");
            System.out.println("Your balance is: " + this.accountBalance);
            return 1;
        }
    }

    public Accountcc(){
        this(56789, 2.50,"default name", "default address",
                "default phone");
        System.out.println("empty constructor called");
    }

    public Accountcc(int accountNumber, double accountBalance,
                     String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int withdraw(double funds){
        if(funds > this.accountBalance){
            System.out.println("You do not have sufficient funds to " +
                    "withdraw this amount");
            return -1;
        } else if(funds <= 0){
            System.out.println("you cannot withdraw a non positive" +
                    " amount from your account.");
            return -1;
        } else{
            this.accountBalance -= funds;
            System.out.println("You have withdrawn: " + funds + " from" +
                    " your account");
            System.out.println("Your balance is: " + this.accountBalance);
            return 1;
        }
    }

    public void acountSettings(){
        System.out.println("Account Settings:" +
                " Account Number: " + accountNumber
        + " Customer Name: " + customerName
        + " Email: " + email
        + " Phone Number: " + phoneNumber
        + " Account Balance: " + accountBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

