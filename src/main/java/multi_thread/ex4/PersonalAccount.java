package multi_thread.ex4;

import java.util.concurrent.atomic.AtomicInteger;

public class PersonalAccount {

    private final int accountID;
    private final AtomicInteger balance;

    public PersonalAccount(int balance, int accountID) {
        this.balance = new AtomicInteger(balance);
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance.get();
    }

    public int getAccountID() {
        return accountID;
    }

    public synchronized void deposit(int money) {
        balance.getAndAdd(Math.max(0, money));
        System.out.printf("Deposited %d, actual balance: %d.\n", money, balance.get());
        notify();
    }

    public synchronized void withdraw(int money) {
        try {
            while (money > balance.get()) {
                System.out.println("Not enough money. Transaction will be continue after deposit.");
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Stopped withdraw process.");
            return;
        }
        balance.getAndAdd(-money);
        System.out.printf("Withdrawn %d, actual balance: %d.\n", money, balance.get());
    }
}
