package thetestingacadmy.ex_25_july_2024;

import org.testng.annotations.Test;

public class L278 {
    // TestNG Priority in java
    // TstNG also allow the use of negative number priority value


    @Test(priority = 1)
    public void testMethodOne(){
        System.out.println("test method ONE");
    }

    @Test(priority = 2)
    public void testMethodTwo(){
        System.out.println("test method TWO");
    }

    @Test(priority = 0)
    public void testMethodThree(){
        System.out.println("test method THREE");
    }

    @Test(priority = -1)
    public void testNegativeOne(){
        System.out.println("test method Negative");
    }





}
