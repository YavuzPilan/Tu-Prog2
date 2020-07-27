package uebung_3;

/*
    Konzept: Sleep & Wake, Threads vollrichten ihre Arbeite wecken den nächsten und legen sich schlafen, bis sie wieder geweckt werden
    Gewünschte Ausgabe: immer "Ping" vor "Pong"
*/
public class InterruptSleep extends Thread {
    private final static int interval = 3000;
    private String message;
    public InterruptSleep otherThread;



    public InterruptSleep(String player) {
        this.message = player;
    }

    public void run() {
        while (true) {
            try {

                System.out.println(message);

                if (this.otherThread.isAlive()) { // wir prüfen, ob der andere Thread bereits gestartet ist
                   this.otherThread.interrupt(); // wenn ja, wecken wir ihn
                } else {
                    this.otherThread.start(); // wenn nicht, starten wir ihn
                }
                sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                notify();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO: implement me
        InterruptSleep t1 = new InterruptSleep("Ping");
        InterruptSleep t2 = new InterruptSleep("Pong");
        t1.otherThread = t2;
        t2.otherThread = t1;
        t1.start();
    }
}
