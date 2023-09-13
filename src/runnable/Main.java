package runnable;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("RUNNABLE " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("MAIN " + i);
        }
    }
}
