public class EvenOddThreads {

    public static void main(String[] args) {
        EvenPrinter ep = new EvenPrinter(10);
        OddPrinter op = new OddPrinter(10);
        Thread t1 = new Thread(ep);
        Thread t2 = new Thread(op);
        t1.start();
        t2.start();

    }

}

class OddPrinter implements Runnable {
    private int limit;

    public OddPrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        for(int i = 1;i <= limit; i += 2) {
            System.out.println(i + " is odd");
            try {
                Thread.sleep((long)(Math.random() * 500));
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

class EvenPrinter implements Runnable {
    private int limit;

    public EvenPrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        for(int i = 0;i <= limit; i += 2) {
            System.out.println(i + " is Even");
            try {
                Thread.sleep((long)(Math.random() * 500));
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
