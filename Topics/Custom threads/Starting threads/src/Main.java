
public class Main {

    public static void main(String[] args) {

        // create threads and start them using the class RunnableWorker
        Thread t1 = new Thread(new RunnableWorker(), "worker-1");
        Thread t2 = new Thread(new RunnableWorker(), "worker-2");
        Thread t3 = new Thread(new RunnableWorker(), "worker-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

// Don't change the code below       s
class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}