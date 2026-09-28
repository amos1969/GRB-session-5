import java.util.Arrays;

public class Main {
    static void main() {
        BankAccount bankAccount = new BankAccount(500);
        BankAccount copiedBankAccount = new BankAccount(bankAccount.balance);

        copiedBankAccount.balance = -100;

        System.out.println("BankAccount: " + bankAccount);
        System.out.println("CopiedBankAccount: " + copiedBankAccount);

//        String[] names = {"John", "Jill", "Sue"};
//        String[] copyOfNames = names.clone();
//
//        names[1] = "Dave";
//
//        System.out.println("Names: " + Arrays.toString(names));
//        System.out.println("Copy of Names: " + Arrays.toString(copyOfNames));
    }
}

