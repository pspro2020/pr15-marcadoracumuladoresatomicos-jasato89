package com.jasato.pr15;

import java.lang.invoke.VarHandle;
import java.util.concurrent.ThreadLocalRandom;

public class Dice implements Runnable{

    private Counter counter;
    private final int numTimes;
    Integer result;

    public Dice(Counter counter, int numTimes) {
        this.counter = counter;
        this.numTimes = numTimes;
    }


    @Override
    public void run() {


        for (int i = 0; i < numTimes; i++) {
            result = ThreadLocalRandom.current().nextInt(6) + 1;
            counter.storeResult(result);

        }


    }


}