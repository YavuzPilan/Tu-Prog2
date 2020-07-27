package uebung_3;

/*
    Konzept: Sleep & Wake, Threads vollrichten ihre Arbeite wecken den nächsten und legen sich schlafen, bis sie wieder geweckt werden
    Gewünschte Ausgabe: immer "Ping" vor "Pong"
*/
public class InterruptSleep extends Thread {
    private final static int interval = 3000;

    public InterruptSleep() {
    }

    public void run() {
        while (true) {
            // TODO: print "Ping" or "Pong"
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO: implement me
    }
}
