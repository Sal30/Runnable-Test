public class Seats {
    static final int amountOfSeats = 2;
    private boolean[] seatsBooked = new boolean[amountOfSeats];

    public synchronized void reserveSeat(String termName) throws InterruptedException {
        System.out.println(termName + " is waiting");
        while (fullyBooked()){
            wait();
        }
        for (int x = 0; x < amountOfSeats; x++) {
            System.out.println(termName + " is trying to book " + x);
            if (seatsBooked[x] == false) {
                seatsBooked[x] = true;
                System.out.println(termName + " has booked " + x);
                break;
            } else {
                System.out.println("Seat " + x + " is already booked");
            }
        }
        notifyAll();
    }

    public synchronized void releaseSeat(String termName) throws InterruptedException {
        for (int y = 0; y < amountOfSeats; y++) {
            System.out.println(termName + " is releasing " + y);
            if (seatsBooked[y] == true) {
                seatsBooked[y] = false;
                System.out.println("Seat " + y + " has been released");
                break;
            } else {
                return;
            }

        }
        notifyAll();
    }

    private boolean fullyBooked(){
        for(boolean a : seatsBooked)
            if (!a) return false;
            return true;
    }
}






