package com.treehouse.testng.suite;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("\nBeforeSuite运行啦");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite运行啦");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest运行了");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest运行了");
    }
}
