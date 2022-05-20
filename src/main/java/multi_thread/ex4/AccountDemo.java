package multi_thread.ex4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AccountDemo {
    public static void main(String[] args) throws InterruptedException {
        PersonalAccount personalAccount = new PersonalAccount(0, 1);
        personalAccount.deposit(600);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleWithFixedDelay(() -> personalAccount.withdraw(500), 1, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(() -> personalAccount.deposit(100), 0, 2, TimeUnit.SECONDS);


        Thread.sleep(15000L);
        scheduledExecutorService.shutdownNow();
    }
}
