package com.treehouse.testng.depends;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

public class TestDatabase {
    public TestDatabase() {
    }

    @Test(
            groups = {"db"},
            dependsOnGroups = {"deploy"}
    )
    public void initDB() {
        System.out.println("this is initDB");
    }

    @Test(
            dependsOnMethods = {"initDB"},
            groups = {"db"}
    )
    public void testConnection() {
        System.out.println("This is testConnection()");
    }
}
