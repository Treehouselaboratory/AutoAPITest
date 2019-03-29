package com.treehouse.testng;

import org.testng.annotations.Test;

/**
 * Created by sharan_xia on 2019-03-29.
 */


public class IgnoreTest {
    public IgnoreTest() {
    }

    @Test
    public void ignore1() {
        System.out.println("ignore1 执行！");
    }

    @Test(
            enabled = false
    )
    public void ignore2() {
        System.out.println("ignore2 执行");
    }

    @Test(
            enabled = true
    )
    public void ignore3() {
        System.out.println("ignore3 执行");
    }
}
