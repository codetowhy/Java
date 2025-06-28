public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Working... " + i);
                    Thread.sleep(500); // simulate work
                }
            } catch (InterruptedException e) {
                System.out.println("Worker interrupted!");
                return;
            }
            System.out.println("Work done.");
        });
        worker.start();
        
        // Let the worker thread run for a while
        Thread.sleep(1200);

        // Interrupt the worker thread
        System.out.println("Main interrupting worker");
        worker.interrupt();

        // Wait for the worker to finish
        worker.join();
        System.out.println("Main thread exiting.");
    }
}
