package fr.dawan.consolidation.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainExecutor {
    public static void main(String[] args) {
//      ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(() -> job1());
        executor.execute(() -> job2());

        executor.shutdown();

        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);
        scheduled.scheduleAtFixedRate(() -> System.out.println("beep"), 3, 2, TimeUnit.SECONDS);
//      scheduled.scheduleWithFixedDelay(() -> System.out.println("hey"), 0, 1, TimeUnit.SECONDS);
    }

    public static void job1() {
        for (int i = 0; i < 100; i++) {
            System.out.println("job1 " + i);
        }
    }
    public static void job2() {
        for (int i = 0; i < 100; i++) {
            System.out.println("job2 " + i);
        }
    }
}
