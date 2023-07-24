class fd_account {
    private String nameOfDepositor;
    private int accountNumber;
    private double timePeriod;
    private double amount;

    public fd_account(String nameOfDepositor, int accountNumber, double timePeriod, double amount) {
        this.nameOfDepositor = nameOfDepositor;
        this.accountNumber = accountNumber;
        this.timePeriod = timePeriod;
        this.amount = amount;
    }

    public void withdrawMoney() {
        if (timePeriod >= timePeriod/2) {
            System.out.println("Withdrawal allowed. You can withdraw the amount: " + (((amount * 7.4 * timePeriod) / 100) +amount));
            // amount -= amount / 2;
        } else {
            System.out.println("Withdrawal not allowed. Minimum time period not reached.");
        }
    }

    public void displayDetails() {
        System.out.println("Depositor Name: " + nameOfDepositor);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Time Period: " + timePeriod + " year(s)");
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {
        fd_account[] accounts = new fd_account[2];

        accounts[0] = new fd_account("Happy Singh", 1001, 1, 5000);
        accounts[1] = new fd_account("Raj", 1002, 5, 10000);

        for (int i = 0; i < 2; i++) {
            System.out.println("Account " + (i + 1) + " details:");
            accounts[i].displayDetails();
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Account " + (i + 1) + " details after withdrawal:");
            accounts[i].displayDetails();
            accounts[i].withdrawMoney();
            System.out.println();
        }
    }
}
