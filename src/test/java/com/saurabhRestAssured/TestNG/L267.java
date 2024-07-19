package com.saurabhRestAssured.TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L267 {

    //Hypothetical integration scenario
    //Create Booking, --> ID
    //Create auh --> Token
    //Put -> ID, Token
    //Delete -> ID
    //Get -> ID -- verify it should not exist


String token;
Integer bookingID;

public String getToken(){
    token = "123";
    return token;
}

@BeforeTest
    public void getTokenAndBookingID(){
    token = getToken();
    //Post req
    //Put req
    bookingID = 123;
}
@Test
    public void testPutReq(){
    System.out.println(token);
    System.out.println(bookingID);
    //Put req code
}

@Test
    public void testDeleteReq(){
    System.out.println(token);
    System.out.println(bookingID);
    //delete req code
}

@Test
    public void testGetReq(){
    System.out.println(token);
    System.out.println(bookingID);
    //get req code
}


}
