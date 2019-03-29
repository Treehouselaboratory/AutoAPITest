package com.treehouse.testng;

import org.testng.annotations.Test;

/**
 * Created by sharan_xia on 2019-03-29.
 */
public class ExpectedExceptionTest {
    public ExpectedExceptionTest() {
    }

    public void runTimeExceptionFailed() {
        System.out.println("这是一个运行失败的测试");
    }

    @Test(
            expectedExceptions = {RuntimeException.class}
    )
    public void runTimeExceptionSccess() {
        System.out.println("这是一个运行成功的测试");
        throw new RuntimeException();
    }
}
