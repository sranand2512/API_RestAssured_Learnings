package thetestingacadmy.ex_27_july_2024.Gson.DeSerialization;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.Booking;

public class L295 {

    @Test
    public void Deserialization(){

        String JsonString = "{\n" +
                "    \"firstname\": \"Jim\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";
        Gson gson = new Gson();
        Booking booking = gson.fromJson(JsonString, Booking.class);
        System.out.println(booking.toString());
        System.out.println(booking.getFirstname());

        Assert.assertEquals(booking.getFirstname(), "Saurabh");
    }
}
