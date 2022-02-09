public class Counter implements Runnable{
    private static int tally;

    public int getValue() {
        return tally;
    }

    @Override
    public void run() {
        for(int x = 0; x<10000000; x++) {
            Counter.tally = tally + 1;
            }

        }
    }

