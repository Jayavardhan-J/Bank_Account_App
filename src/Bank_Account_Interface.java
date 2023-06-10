public interface Bank_Account_Interface {
     String fetchBalance(String password);

     String addMoney(double amount);

     String withdrawMoney(double amount);

    String changePassword(String oldPassword,String newPassword);

    String calculateInterest(int years);
}
