public class ConcertHall {
    public static void main(String[] args) throws InterruptedException {
        Seats seatSet = new Seats();
        Terminal term1 = new Terminal(seatSet, "t1");
        Terminal term2 = new Terminal(seatSet, "t2");
        Terminal term3 = new Terminal(seatSet, "t3");

        Thread t1 = new Thread(term1);
        Thread t2 = new Thread(term2);
        Thread t3 = new Thread(term3);


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

    }
}
