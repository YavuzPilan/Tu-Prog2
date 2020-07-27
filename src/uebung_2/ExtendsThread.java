package uebung_2;

import java.util.LinkedList;

/**
 * AUfgabe 1.1 - 1.3
 */
public class ExtendsThread extends Logger implements Runnable {

    private final String name;

    public static void main(String[] args) throws InterruptedException {
        int queueLength = 250;
        int numberOfThreads = 20;
        Quere quere = Quere.getQuere(queueLength);
        int bereiche = queueLength / numberOfThreads;

        LinkedList<Kleinschreiber> threadList = new LinkedList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            Kleinschreiber kleinschreiber =  new Kleinschreiber(i * bereiche, (i * bereiche) + bereiche, quere);
            kleinschreiber.start();
            threadList.add(kleinschreiber);
        }

        while (!threadList.isEmpty()){
            threadList.removeIf(k -> !k.isAlive());
        }

        /*
        ExtendsThread e1 = new ExtendsThread("A");
        ExtendsThread e2 = new ExtendsThread("B");
        Thread thread = new Thread(e1);
        Thread thread1 = new Thread(e2);
        thread.start();
        thread1.start();
         */
        System.out.println(quere.getLinkedList());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            log(name, i);
        }
    }

    ExtendsThread(String name) {
        this.name = name;
    }

    //Aufgabe 3: Ja, kann ich aber dann führt der Main Thread sie nur einmal aus und das nich parallel
}
