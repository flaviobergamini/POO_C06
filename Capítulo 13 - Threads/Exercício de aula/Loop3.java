package org.example;

public class Loop3 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 999; i++){
            System.out.println("Thread 3, valor: " + i);
        }
    }
}
