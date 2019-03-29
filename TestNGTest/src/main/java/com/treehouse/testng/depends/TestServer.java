package com.treehouse.testng.depends;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Test;

@Test(
        groups = {"deploy"}
)
public class TestServer {
    public TestServer() {
    }

    @Test
    public void deployServer() {
        System.out.println("\nDelpoying Server...");
    }

    @Test(
            dependsOnMethods = {"deployServer"}
    )
    public void deployBackUpServer() {
        System.out.println("depploy backup server ...");
    }
}
