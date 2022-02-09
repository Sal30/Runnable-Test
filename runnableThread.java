public class runnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Thread 2 using Runnable");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Sleep finished");
        return;
    }
}
