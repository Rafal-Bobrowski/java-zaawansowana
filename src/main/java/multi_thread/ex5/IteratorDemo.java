package multi_thread.ex5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IteratorDemo {
    public static void main(String[] args) throws InterruptedException {
        Iterator<Integer> iterator = new Iterator<>(new
                Integer[]{1, 4, 58, 434, 78});

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                int value = iterator.next();
                System.out.println(Thread.currentThread().getName() + " " +
                        value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }, 1, 1, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            try {
                int value = iterator.prev();
                System.out.println(Thread.currentThread().getName() + " " +
                        value);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }, 1, 2, TimeUnit.SECONDS);

        Thread.sleep(10000L);
        scheduledExecutorService.shutdown();
    }
}

