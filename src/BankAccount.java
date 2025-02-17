public class BankAccount {
    private double amount;

    public BankAccount() {
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
        }
    }

    public void withDraw(int sum) throws LimitException{
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма превышает текущий баланс.", amount);
        }
        amount -= sum;
    }
}
