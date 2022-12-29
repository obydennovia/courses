public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount () {
        balance = 0;
    }

    public ChildBankAccount (double maxBalance) {
        balance = 0.0;
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney (double value) {
        boolean statusDepositMoney = false;
        if (balance + value <= maxBalance) {
            balance = balance + value;
            statusDepositMoney = true;
        }
        if ((balance + value > maxBalance) || (value < 0)) {
            balance = balance;
            statusDepositMoney = false;
        }
        return statusDepositMoney;
    }

    public boolean debitMoney(double value) {
        boolean statusDebitMoney = false;
        if ((value >= 0) && (balance - value >= 0)) {
            balance = balance - value;
            statusDebitMoney = true;
        } else {
            balance = balance;
            statusDebitMoney = false;
        }
        return statusDebitMoney;
    }

    public double getBalance() {
        return balance;
    }
}
