package it.zucchetti.thread;

import java.util.Scanner;

public class ParkingArea {

    public static void main(String[] args) {
        Places place = new FixedLenghtPlace();


        for (int i = 0; i < 10;i++){
            new Car(place,i).start();
        }

    }

}
