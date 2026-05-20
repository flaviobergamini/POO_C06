package org.example;

public class GerarBarraDeProgresso implements Runnable {
    public void rodar() {
        // lógica para gerar a barra de processo
        for (int i= 0; i < 100; i+=10) {
            System.out.println("Barra de Progresso: " + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Barra de progresso finalizada!!!");
    }

    @Override
    public void run() {
        this.rodar();
    }
}












