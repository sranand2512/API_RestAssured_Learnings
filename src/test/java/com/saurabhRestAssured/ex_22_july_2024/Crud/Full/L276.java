package com.saurabhRestAssured.ex_22_july_2024.Crud.Full;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L276 {

    @BeforeTest
    public void GetToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void GetBookingID(){
        System.out.println("2");
    }
    @Test
    public void t3(){
        //Before this we need token and booking ID
        System.out.println("3");
    }
}
