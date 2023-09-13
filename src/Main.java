import java.util.concurrent.ExecutorService;

class FirstStream implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Main.counter.increment();
        }
    }
}

class SecondStream implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Main.counter.increment();
        }
        System.out.println(Main.counter.getValue());
    }
}


public class Main {
    static Counter counter = new Counter();

    public static void main(String[] args) {
        Thread first = new Thread(new FirstStream());
        Thread second = new Thread(new SecondStream());
        first.start();
        second.start();

    }

}
