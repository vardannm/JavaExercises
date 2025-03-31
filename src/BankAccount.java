public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(int accountNumber,String ownerName,int balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("Current balance is " + balance + "$");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1010,"Vardan",2000);
        account.deposit(3000);
        account.withdraw(200);
        account.showBalance();
    }
}
