package thetestingacadmy.TestNG;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class L262 {
    @Description("262 - 1st")
    @Test
    public void getRequest1(){
        System.out.println("TC1");
    }
    @Description("262 -2nd")
    @Test(enabled = false)
    public void getRequest2(){
        System.out.println("TC2");
    }
    @Description("262 -3rd")
    @Test
    public void getRequest3(){
        System.out.println("TC3");
    }
}
