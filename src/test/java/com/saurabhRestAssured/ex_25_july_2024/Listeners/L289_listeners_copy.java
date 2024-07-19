package com.saurabhRestAssured.ex_25_july_2024.Listeners;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class L289_listeners_copy {

    @Test(groups = "sanity")
    public void test1(){
        System.out.println("Test No 1");
        Assert.assertTrue(false);
    }

    @Test(groups = "sanity")
    public void test2(){
        System.out.println("Test No 2");
        Assert.assertTrue(true);
    }

    @AfterSuite
    public void emailTOQaLead(){
        System.out.println("After suite Executing...\n");
        System.out.println("After  Executing...\n");

    }
}
