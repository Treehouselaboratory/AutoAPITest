package com.treehouse.testng.depends;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

public class TestApp {
    public TestApp() {
    }

    @Test(
            dependsOnGroups = {"deploy", "db"}
    )
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(
            dependsOnMethods = {"method1"}
    )
    public void method2() {
        System.out.println("this is method 2");
    }
}
