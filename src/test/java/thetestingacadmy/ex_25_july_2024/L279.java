package thetestingacadmy.ex_25_july_2024;

import org.testng.annotations.Test;

public class L279 {

    @Test(priority = -1)
    public void testMethodB(){
        System.out.println("test method B");
    }

    @Test(priority = -1)
    public void testMethodA(){
        System.out.println("test method A");
    }

    @Test(priority = -1)
    public void testMethodC(){
        System.out.println("test method C");
    }

    @Test(priority = -1)
    public void testMethodZ(){
        System.out.println("test method F");
    }

}
