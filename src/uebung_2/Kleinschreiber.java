package uebung_2;

public class Kleinschreiber extends Thread {

    int start;
    int ende;
    Quere quere;

    public Kleinschreiber(int start, int ende, Quere quere) {
        this.start = start;
        this.ende = ende;
        this.quere = quere;
    }

    public void run() {
        for (int i = start; i < ende; i++) {
            quere.getLinkedList().set(i, quere.lowCaser(quere.getLinkedList().get(i)));
        }
    }

}
