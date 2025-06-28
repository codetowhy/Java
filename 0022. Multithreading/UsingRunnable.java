public class UsingRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in " + Thread.currentThread().getName());
    }
}
