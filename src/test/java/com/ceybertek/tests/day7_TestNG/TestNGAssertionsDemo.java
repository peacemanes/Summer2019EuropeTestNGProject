package com.ceybertek.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
    @Test
    public void test1() {
        System.out.println("First Assertions");
        Assert.assertEquals("one", "oNe");

        System.out.println("Second Assertions");
        Assert.assertEquals(1, 1);
        System.out.println("After second assertion");


    }

    @Test
    public void test2() {
        System.out.println("Second Test First Assertion");
        Assert.assertEquals(23, 23);
    }

    @Test
    public void test3() {
        //verify the title starts with C
        String actualTitle = "Cybertek";
        String expectedTitleBegi = "b";
        System.out.println("First Assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBegi),"Verify the title starts with C");

    }
    @Test
    public void test4() {
        //verify email includes @ sign
        Assert.assertTrue("asdsd#asd".contains("@"), "verify @ is icluded in email");
    }
    @Test
        public void test5(){
         Assert.assertNotEquals("one","two","one should't be equal two");
        }
        @Test
    public void test6(){
        Assert.assertFalse(1<0);
        }

}

