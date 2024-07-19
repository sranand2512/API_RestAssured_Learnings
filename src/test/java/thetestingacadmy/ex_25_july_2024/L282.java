package thetestingacadmy.ex_25_july_2024;

import org.testng.annotations.Test;

public class L282 {


    @Test(priority = -1)
    public void getToken(){
        System.out.println("Get Token");
    }

    @Test(priority = -2)
    public void getBookingId(){
        System.out.println("Get BookingId");
    }

    //@Test(dependsOnMethods = {"getToken","getBookingId"})
    @Test(priority = 0)
    public void a_testPutRequest(){
        System.out.println("Test Put");
    }

   // @Test(dependsOnMethods = {"getToken","getBookingId"})
    @Test(priority = 0)
    public void a_testDeleteRequest(){
        System.out.println("Test Delete");
    }
}
