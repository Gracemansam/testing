public class Bankaccount {
    private String accountNumber;
    private double accountBalance;
    private String email;
    private String customerName;
    private String phoneNumber;

    public void depositAmount(double deposit){
        this.accountBalance += deposit;
        System.out.println("Deposit of "+ deposit + "made, You are doing well. New balance is" + this.accountBalance);
    }
    public void withdrawAmount(double withdraw){
        if(this.accountBalance - withdraw < 0){
            System.out.println("You do not have that amount in you account, Only " + accountBalance + " is available. Oga go work harder");
        }else {
            accountBalance -= withdraw;
            System.out.println("Withdraw of "+ withdraw + " processed. Remaining balance is "+ accountBalance);
        }
    }

    public void setAccountNumber( String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountBalance( double accountBalance){
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setCustomerName( String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setPhoneNumber( String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }


}
