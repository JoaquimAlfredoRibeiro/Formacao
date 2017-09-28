package exemplos;

import singleton.SingleObject;

public class Ex1Contador { // Contador Singleton

    private int cnt;

    private static Ex1Contador instance = new Ex1Contador();

    public Ex1Contador() {
        cnt = 0;
    }

    public int increment() {
        cnt++;
        return cnt;

    }

    public int getCnt() {
        return cnt;
    }

    public static Ex1Contador getInstance() {
        return instance;
    }

}
