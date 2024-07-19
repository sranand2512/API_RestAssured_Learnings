package com.saurabhRestAssured.ex_25_july_2024;

import org.testng.annotations.Test;

public class L283 {

    @Test(groups = {"init"}, priority =  1)
    public void getToken(){
        System.out.println("Get Token");
        System.out.println("Server Started OK");
    }

    @Test(groups = {"init"}, priority =  2)
    public void getBookingId(){
        System.out.println("Get BookingId");
        System.out.println("inti Environment Set");
    }

    //@Test(dependsOnMethods = {"getToken","getBookingId"})
    @Test(dependsOnGroups = {"init*"})
    public void testPutRequest(){
        System.out.println("Test Put");
        System.out.println("Now I will run");
    }



}
