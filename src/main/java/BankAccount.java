public class BankAccount {
    public int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Balance: " + this.balance;
    }
}
