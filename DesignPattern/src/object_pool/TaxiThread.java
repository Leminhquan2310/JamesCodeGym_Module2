package object_pool;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable{
    private TaxiPool taxiPool;

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeATaxi();
    }

    private void takeATaxi() {
        try {
            System.out.println("New client" + Thread.currentThread().getName());
            Taxi taxi = taxiPool.getTaxi();
            System.out.println("Client " + Thread.currentThread().getName() + " got it " + taxi.getName());
            TimeUnit.MILLISECONDS.sleep(randInt(1000, 2500));
            taxiPool.release(taxi);
            System.out.println("Served the client: " + Thread.currentThread().getName());
        } catch (InterruptedException | TaxiNotFoundException e ){
            System.out.println(">>>Rejected the client: " + Thread.currentThread().getName());
        }
    }

    private int randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
