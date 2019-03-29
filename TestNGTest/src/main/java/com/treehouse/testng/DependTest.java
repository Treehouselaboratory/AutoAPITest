package com.treehouse.testng;

import org.testng.annotations.Test;

/**
 * Created by sharan_xia on 2019-03-29.
 */

public class DependTest {
    public DependTest() {
    }

    @Test
    public void test1() {
        System.out.println("这是test1方法");
    }

    @Test(
            dependsOnMethods = {"test1"}
    )
    public void test2() {
        System.out.println("这是test2测试方法，依赖于test1");
    }
}
