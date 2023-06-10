import java.util.UUID;

public class HDFCAccount implements Bank_Account_Interface {


    private String name;



    private String AccountNo;
    private double balance;
    private String password;
    private final double interest=6.1;


    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.AccountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public HDFCAccount() {

    }
    //methods
    public String getAccountNo() {
        return AccountNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password))return "Your Balance is: "+this.balance+".";
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance+=amount;
        return "Your Balance is : "+balance;
    }

    @Override
    public String withdrawMoney(double amount) {
        if(balance<amount)return "Insufficient Balance";
        else {
            balance-=amount;
            return "Withdrawal Successful. Balance: "+balance;
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(password.equals(oldPassword)){
            password=newPassword;
            return "Password changed successfully";
        }
        return "Incorrect Password!!";
    }

    @Override
    public String calculateInterest(int years) {
        return "Your balance as per interest is : "+balance*interest*years;
    }
}
