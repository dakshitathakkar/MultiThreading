package MultiThreading.thread.main;

public class RunnableThread implements Runnable{

    private final Thread thread;

    public RunnableThread() {
        thread = new Thread(this,"T1");
    }

    public Thread getThread() {
        return thread;
    }

    private static final int LIMIT = 10;

    @Override
    public void run() {
        System.out.println("The thread " + thread.getName() +" is running");
        for (int i = 0; i < LIMIT; i++) {
            System.out.println(thread.getName() + " = " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("The thread " + thread.getName() + " has stopped");
    }
}
