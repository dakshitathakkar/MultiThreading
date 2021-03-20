package MultiThreading.thread.main;

public class Main {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        RunnableThread thread = new RunnableThread();
        thread.getThread().start();

        ThreadClassThread thread1 = new ThreadClassThread();
        thread1.start();
    }
}
