public abstract class Account {
    protected long balance;

    public Account(long initialBalance) {
        this.balance = initialBalance;
    }

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}
