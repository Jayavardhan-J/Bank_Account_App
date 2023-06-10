import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        HDFCAccount acc1 = new HDFCAccount("Jay",1000,"Jay123");
        System.out.println("Congrats!, "+acc1.getName()+" Your account has been created with account number: "+acc1.getAccountNo());
        System.out.println(acc1.fetchBalance("Jay123"));
        System.out.println(acc1.addMoney(1000));
        System.out.println(acc1.withdrawMoney(500));
        System.out.println(acc1.changePassword("Jay123","Jay!??"));
        System.out.println(acc1.calculateInterest(5));
    }
}