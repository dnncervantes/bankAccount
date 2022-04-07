public class BankAccount {
    //member variables
    private double checking;
    private double savings;
    private static int numberOfAccounts = 0;
    private static double totalCheckings = 0;
    private static double totalSavings = 0;

//Constructor
    public BankAccount(double checkBal, double savBal) {
        checking = checkBal;
        savings = savBal;
        numberOfAccounts++;
        totalCheckings += checkBal;
        totalSavings += savBal;
    }

//getter/setters
    public static double getTotalCheckings(){
        return totalCheckings;
    }
    public static double getTotalSavings(){
        return totalSavings;
    }

//methods
    public static int accountTotal() {
        return numberOfAccounts;
    }

    public void deposit(double amount, String acctType){
        if(acctType == "Checking"){
            checking += amount;
            totalCheckings += amount;
        }
        if(acctType == "Savings"){
            savings += amount;
            totalSavings += amount;
        }
    }

    public void withdraw(double amount, String acctType){
        if(acctType == "Checking"){
            if(totalCheckings <= checking){
                System.out.println("Not enough funds in Checking.");
            }
            else{
                checking -= amount;
                totalCheckings -= amount;
            }
        }
        if(acctType == "Savings"){
            if(totalSavings < savings){
                System.out.println("Not enough funds in Savings.");
            }
            else{
                savings -= amount;
                totalSavings -= amount;
            }
        }
    }

    // Balance from checking and savings
    public void totalBalance(){
        System.out.println("Checking: " + BankAccount.getTotalCheckings());
        System.out.println("Savings: " + BankAccount.getTotalSavings());
    }
}