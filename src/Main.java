public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(15000);

        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Успешно сняты 6000 сом. Текущий остаток на счете: " + account.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage() + " Вывод оставшейся суммы: " + e.getRemainingAmount());
                try {
                    account.withDraw((int) e.getRemainingAmount());
                    System.out.println("Успешно сняты оставшиеся средства. Текущий остаток на счете: " + account.getAmount());
                } catch (LimitException ex) {
                    
                }
                break;
            }
        }
    }
}
