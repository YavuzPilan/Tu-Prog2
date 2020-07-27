package uebung_2;

import java.util.LinkedList;
import java.util.Random;

public class Quere {

    private static Quere quere = null;
    private LinkedList<Character> linkedList;

    private Quere(int i) {
        linkedList = new LinkedList<>();
        for (int j = 0; j < i; j++) {
            linkedList.add((char) randomString());
        }
    }

    public static Quere getQuere(int i) {
        if (quere == null) {
            quere = new Quere(i);
        }
        return quere;
    }

    public LinkedList<Character> getLinkedList() {
        return linkedList;
    }

    private int randomString() {
        return new Random().nextInt((90 - 65) + 1) + 65;
    }

    public char lowCaser(char x){
        return String.valueOf(x).toLowerCase().charAt(0);
    }
}
