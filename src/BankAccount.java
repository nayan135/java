class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public String getName() {
        return name;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        boolean running = true;

        while (running) {
            System.out.println("1. Open an account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter your name: ");
                    scanner.nextLine();  // Consume newline
                    String name = scanner.nextLine();
                    account = new BankAccount(name);
                    System.out.println("Account created for " + name);
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("No account found. Please open an account first.");
                    } else {
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("No account found. Please open an account first.");
                    } else {
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("No account found. Please open an account first.");
                    } else {
                        account.checkBalance();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid number.");
                    break;
            }
        }
        scanner.close();
    }
}

    
}
