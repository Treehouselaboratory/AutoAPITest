package com.treehouse.testng.parameter;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void paramTest1(String name, int age) {
        System.out.println("\n name = " + name + " age = " + age);
    }
}
