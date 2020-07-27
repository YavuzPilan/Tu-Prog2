package uebung_3;

/*
    Konzept: Time-partioning zur Orchestrierung von Threads, d.h. Threads arbeiten nur zu bestimmten Zeiten
    Gewünschte Ausgabe: immer "Ping" vor "Pong"
*/
public class PingPong implements Runnable {
    private final static int interval = 3000; // vordefiniertes Intervall

    public PingPong() {
    }

    public void run() {
        while (true) {
            // TODO: print "Ping" or "Pong"
        }
    }

    public static void main(String[] args) {
        // TODO: implement me
    }
}