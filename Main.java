public class Main {
    public static void main(String[] args) throws InterruptedException {
       //test for thread.sleep without a class
        System.out.println("Sleeping");
        Thread.sleep(1000);
        System.out.println("Sleep finished");
        System.out.println();
        System.out.println("Extends thread");
        //New thread created using the thread class
        newThread x = new newThread();
        //New thread created using the runnable class
        runnableThread y = new runnableThread();
        x.run();
        System.out.println();
        System.out.println("Implements runnable");
        y.run();
        x.join();
        System.out.println();

        //Creates two instances of counter
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Thread count1 = new Thread(counter1);
        Thread count2 = new Thread(counter2);
        //Starts both threads
        count1.start();
        count2.start();
        //Join makes sure they both terminate
        //and waits for them both to complete
        count1.join();
        count2.join();
        //Print out counter values
        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());

    }

}
