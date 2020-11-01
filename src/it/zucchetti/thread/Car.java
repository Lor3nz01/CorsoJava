package it.zucchetti.thread;

public class Car extends Thread{
    Places FixedLenghPlace;

    public Car(Places place, int i){
        this.FixedLenghPlace = place;
        setName("Car-"+i);
    }

    @Override
    public void run() {
        while(true){
            try{
                sleep(2000); // car aspetta 20s prima di parcheggiare
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            FixedLenghPlace.put();
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            FixedLenghPlace.get();
        }
    }
}
