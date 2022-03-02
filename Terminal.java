public class Terminal implements Runnable {
    private Seats seat;
    private String termNum;
    private int sleepTime = 10000;

    public Terminal(Seats seat, String termNum) {
        this.seat = seat;
        this.termNum = termNum;
    }

    @Override
        public void run() {
            try {
                System.out.println("I am "+ termNum);
                double longTime = Math.round(((Math.random())*sleepTime));
                System.out.println(termNum + " will sleep for: " + longTime);
                Thread.sleep((long) longTime);
                System.out.println(termNum + " has finished sleeping");
                seat.reserveSeat(termNum);
                double holdTime = Math.round(((Math.random())*sleepTime));
                System.out.println(termNum + " will hold this seat for " + holdTime);
                Thread.sleep((long) holdTime);
                seat.releaseSeat(termNum);

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                return;
            }
            }

    }

