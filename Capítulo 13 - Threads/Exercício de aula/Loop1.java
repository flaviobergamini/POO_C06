package org.example;

public class Loop1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 999; i++){
            System.out.println("Thread 1, valor: " + i);
        }
    }
}
