package com.saurabhRestAssured.TestNG;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class L265 {


    @Description("TC01")
    @Test
    public void testCase(){

        //Assertion -->  Expected result = Actual result
        //200==200

        // Soft Assertion
        SoftAssert s = new SoftAssert();
        s.assertEquals("pramod", "Pramod", "Not Equal");
        s.assertEquals("Saurabh", "Pramod", "Not Equal");
        System.out.println("End of the program");
        System.out.println("End of the program2");
        s.assertAll();

//        // Hard Assertion
//        Assert.assertEquals("pramod", "pramod", "Not Equal");
//        System.out.println("End of the program");

    }


}
