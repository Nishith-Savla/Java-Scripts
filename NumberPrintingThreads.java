public class NumberPrintingThreads {

    public static void main(String[] args) {
        Ascending a1 = new Ascending();
        Descending d1 = new Descending();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(d1);
        t1.start();
        t2.start();
    }

}


class Ascending extends Thread {

    public void run() {
        for(short i = 0;i <= 5;++i) {
            System.out.println(i);
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

class Descending extends Thread {

    public void run() {
        for(short i = 5; i >= 0; --i) {
            System.out.println(i);
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
