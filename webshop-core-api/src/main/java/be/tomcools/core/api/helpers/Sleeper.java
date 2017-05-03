package be.tomcools.core.api.helpers;

import java.util.Random;

/**
 * Created by tomco on 24/04/2017.
 */
public class Sleeper {
    private final static Random RAND = new Random();

    public static void sleepBetweenMs(int lower, int upper) {
        int sleepTime = RAND.nextInt(lower + upper) - lower;
        sleep(sleepTime);
    }

    public static void sleep(int timeInMs) {
        try {
            Thread.sleep(timeInMs);
        } catch (InterruptedException e) {
            throw new RuntimeException("Something went wrong while sleeping. ", e);
        }
    }
}
