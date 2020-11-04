package com.company;
import java.util.Random;

public class Hilos extends Thread {
    Permisos permisos;

    public Hilos(Permisos permisos) {
        this.permisos = permisos;
    }


    @Override
    public void run() {

            for (int i = 1; i <= 5; i++) {
                try {
                    Integer numAleatorio = (int) Math.floor(Math.random() * (8000 - 4 + 1000) + (4));
                    sleep(numAleatorio);
                    permisos.notificarFinHilo(numAleatorio, i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
