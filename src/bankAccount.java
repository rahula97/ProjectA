public class bankAccount {
    private int accountNumber, balance, phoneNumber;
    private String email, customerName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int depositFunds(){
        return 0;

        //System.out.println("Your new funds are");
    }

    public int withdrawFunds(int funds){
        if(funds<=balance){
            return 0;
        }
        System.out.println("Your new funds are");
        return 1;
    }
}
