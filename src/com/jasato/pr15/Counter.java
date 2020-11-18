package com.jasato.pr15;


import java.util.concurrent.atomic.LongAdder;

public class Counter {

    private final LongAdder counterOne = new LongAdder();
    private final LongAdder counterTwo = new LongAdder();
    private final LongAdder counterThree = new LongAdder();
    private final LongAdder counterFour = new LongAdder();
    private final LongAdder counterFive = new LongAdder();
    private final LongAdder counterSix = new LongAdder();

    public int getCount() {
        return counterOne.intValue() + counterTwo.intValue() + counterThree.intValue() + counterFour.intValue() + counterFive.intValue() + counterSix.intValue();

    }

    public void getData() {

        System.out.printf(
                "Número 1: %d\n" +
                "Número 2: %d\n" +
                "Número 3: %d\n" +
                "Número 4: %d\n" +
                "Número 5: %d\n" +
                "Número 6: %d\n" +
                "Total: %d\n", counterOne.intValue(), counterTwo.intValue(), counterThree.intValue(), counterFour.intValue(), counterFive.intValue(), counterSix.intValue(), getCount());
    }

    protected void storeResult(Integer result) {

        switch (result) {
            case 1:
                counterOne.increment();
                break;
            case 2:
                counterTwo.increment();
                break;
            case 3:
                counterThree.increment();
                break;
            case 4:
                counterFour.increment();
                break;
            case 5:
                counterFive.increment();
                break;
            case 6:
                counterSix.increment();
                break;
        }
    }

}
