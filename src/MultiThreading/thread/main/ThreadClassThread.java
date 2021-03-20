package MultiThreading.thread.main;

public class ThreadClassThread extends Thread {

    public ThreadClassThread() {
        super("T2");
    }

    private static final int LIMIT = 20;

    @Override
    public void run(){
        System.out.println("The Thread has started");
        for (int i = 0; i < LIMIT; i++) {
            System.out.println("T2: " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("The thread has stopped.");
    }
}
