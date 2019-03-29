package com.treehouse.testng.parameter;

/**
 * Created by sharan_xia on 2019-03-29.
 */
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("\n name = " + name + " age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] objects = new Object[][]{
                {"sharan", 10},
                {"lusy", 30},
                {"alina", 40}
        };
        return objects;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test111方法 name = "+name+" age = "+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test222方法 name = "+name+" age = "+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")){

        }
        return result;
    }

}
