package org.example;

public class Main {
    public static void main(String[] args) {
        Loop1 loop1 = new Loop1();
        Loop2 loop2 = new Loop2();
        Loop3 loop3 = new Loop3();

        Thread thread1 = new Thread(loop1);
        Thread thread2 = new Thread(loop2);
        Thread thread3 = new Thread(loop3);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}