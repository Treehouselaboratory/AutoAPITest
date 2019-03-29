package com.treehouse.testng;

import org.testng.annotations.*;

/**
 * Created by sharan_xia on 2019/3/25.
 *
 */

public class BasicAnnotation {

    //@Test标签
    @org.testng.annotations.Test
    public void testCase1() {
        System.out.println("这是测试用例-1");
    }
    @org.testng.annotations.Test
    public void testCase2(){
        System.out.println("这是测试用例-2");
    }


    //@BeforeMethod和@AfterMethod标签
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod在每个@Test标签方法之前执行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在每个@Test标签方法之后执行的");
    }


    //@BeforeClass和AfterClass标签
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass这是在类运行之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的");
    }


    //@BeforeTest和@AfterTest标签
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest在所有@Test标签测试方法之前执行");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest在所有@Test标签测试方法之后执行");
    }


    //@BeforeSuite和AfterSuite标签
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }



}
