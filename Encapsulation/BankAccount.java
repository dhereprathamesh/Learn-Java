// Encapsulation Example: Bank Account Class

class BankAccount {
    // Private fields
    private String accountHolderName;
    private double balance;

    // Constructor 
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (provides controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Setter for balance (provides controlled access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount("Prathamesh", 1000.0);

        // Accessing account details via public getter methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());           

        // Performing deposit and withdrawal via setter methods
        account.deposit(500.0);
        account.withdraw(200.0);  

        // Accessing updated balance
        System.out.println("Updated Balance: " + account.getBalance());        
    }
}
