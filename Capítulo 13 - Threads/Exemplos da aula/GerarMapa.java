package org.example;

public class GerarMapa  extends  Thread {//implements Runnable {
    public void rodar() {
        // lógica para a geração do mapa
        for (int i= 0; i < 10; i++) {
            System.out.println("Gerando região: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Mapa foi gerado com sucesso!");
    }

    @Override
    public void run() {
        this.rodar();
    }
}
