public class newThread extends Thread {
    public void run(){
        System.out.println("Running Thread 1");
        try {
            newThread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Sleep finished");
        return;

    }
}
