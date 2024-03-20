package fr.dawan.consolidation.thread;

public class MainThread {
    public static void main(String[] args) {
        String mainName = Thread.currentThread().getName();

        Thread t1 = new Thread(() -> {
            String name = Thread.currentThread().getName();
            for(int i = 0; i < 100; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            String name = Thread.currentThread().getName();
            for(int i = 0; i < 100; i++) {
                System.out.println(name + ": " + i);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.setName("t1");
        t1.setDaemon(true);
//      t1.setPriority(Thread.MIN_PRIORITY);
        t2.setName("t2");
//      t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(mainName + ": " + i);
        }

        System.out.println("Fin du main");
    }
}
