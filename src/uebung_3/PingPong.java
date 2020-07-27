package uebung_3;

/*
    Konzept: Time-partioning zur Orchestrierung von Threads, d.h. Threads arbeiten nur zu bestimmten Zeiten
    Gewünschte Ausgabe: immer "Ping" vor "Pong"
*/
public class PingPong implements Runnable {
    private final static int interval = 3000; // vordefiniertes Intervall
    private boolean player;

    public PingPong(boolean player) {
        this.player = player;
    }

    public void run() {
        while (true) {
            // TODO: print "Ping" or "Pong"
            try {

                Thread.sleep(interval);
                if (player) {
                    System.out.println("Ping");
                } else {
                    System.out.println("Pong");
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // TODO: implement me
        new Thread(new PingPong(true)).start();
        new Thread(new PingPong(false)).start();

    }
}