package it.zucchetti.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FixedLenghtPlace implements Places{
    private final static int BUFFER_SIZE = 5; // indica il numero posti disponibile
    private int car; // indica il numero di car parcheggiate
    private int carWaiting; // indica il numero di car in wait
    private Lock key;
    private Condition carTurn; //monitor

    public FixedLenghtPlace(){
        car = 0;
        carWaiting = 0;
        key = new ReentrantLock();
        carTurn = key.newCondition();
    }


    @Override
    public void put() {
        key.lock();
        try{
            while(car == BUFFER_SIZE){
                carWaiting++;
                carTurn.await();
            }
            car++;
            System.out.println("[" + Thread.currentThread().getName()+"] sta entrando. | car: "+car+" | carWaiting: "+carWaiting);
            if (carWaiting > 0){
                carWaiting--;
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            key.unlock();
        }
    }



    @Override
    public void get() {
        key.lock();
        try{
            car--;
            System.out.println("[" + Thread.currentThread().getName()+"] sta uscendo. | car: "+car+" | carWaiting: "+carWaiting);
            carTurn.signal(); // risveglia un thread -> uguale notify()
        }finally {
            key.unlock();
        }
    }
}
