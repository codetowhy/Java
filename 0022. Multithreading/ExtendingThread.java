public class ExtendingThread {
   public static void main(String[] args) {
  for (int i = 0; i < 4; i++) {
    new MyThread().start();
  }
}
}
class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("Hello from " + getName());
  }
}

