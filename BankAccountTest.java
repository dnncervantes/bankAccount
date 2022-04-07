public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount member = new BankAccount(1000, 2000);

        member.deposit(1000, "Checking");
        member.deposit(500, "Savings");

        member.withdraw(5000, "Checking");
        member.withdraw(25, "Savings");

        // System.out.println(BankAccount.accountTotal());
        member.totalBalance();

    }
}