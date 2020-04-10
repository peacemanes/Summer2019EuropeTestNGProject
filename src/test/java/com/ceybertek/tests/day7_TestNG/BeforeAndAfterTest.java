package com.ceybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @Test
    public void test1() {
        System.out.println("This is  the test 1 ");
    }
    @Ignore
    @Test
        public void test2(){
            System.out.println("second test");
    } @Test
    public void test3() {
        System.out.println("third test");
    }  @BeforeMethod
                public void setUpmethod() {
            System.out.println("BEFORE METHOD");
            System.out.println("OPENING THE BROWSER");
        }
        @AfterMethod
    public void teardown(){
            System.out.println("After method");
            System.out.println("CLOSE THE BROWSER");
    }
    @BeforeClass
    public void BeforeEverything(){
        System.out.println("BEFORE CLASS CODE");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
