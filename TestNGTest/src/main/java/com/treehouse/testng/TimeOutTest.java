package com.treehouse.testng;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

public class TimeOutTest {
    public TimeOutTest() {
    }

    @Test(
            timeOut = 3000L
    )
    public void timeSuccess() throws InterruptedException {
        Thread.sleep(2000L);
    }

    @Test(
            timeOut = 3000L
    )
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000L);
    }
}
