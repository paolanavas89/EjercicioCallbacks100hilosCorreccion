package com.company;
import java.util.ArrayList;
interface Permisos{
    public void notificarFinHilo(Integer duracionHilo,int numHilo);
}
public class PrincipalHilos implements Permisos {

    ArrayList<Integer> tiemposDeEspera = new ArrayList<>();
     Integer aux=0;
    int contador =1;
    public PrincipalHilos() throws InterruptedException {
            Hilos hilo = new Hilos(this);
            hilo.start();
    }
    public void notificarFinHilo(Integer duracionHilo,int numHilo){

        tiemposDeEspera.add(duracionHilo);
        if (numHilo == 1){
            System.out.println("Iteracion  "+ contador);
        }
        System.out.println("El hilo "+numHilo+" a dormido por "+ duracionHilo+" milisegundos.");

        if (numHilo == 5){
            if(contador<100){
                contador++;
                Hilos hilo = new Hilos(this);
                hilo.start();
            }
        }
    }




}