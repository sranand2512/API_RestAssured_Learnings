package com.saurabhRestAssured.ex_27_july_2024.Jackson.Serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import com.saurabhRestAssured.ex_27_july_2024.Gson.Serialization.Generated.Booking;
import com.saurabhRestAssured.ex_27_july_2024.Gson.Serialization.Generated.BookingDates;

public class L295 {

@Test
public void serializationJackson() throws JsonProcessingException {
    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";

    Booking booking1 = new Booking();
    booking1.setFirstname("Saurabh");
    booking1.setLastname("Kumar");
    booking1.setTotalprice(500);
    booking1.setDepositpaid(true);

    BookingDates bookingDates1 = new BookingDates();
    bookingDates1.setCheckin("2024-02-01");
    bookingDates1.setCheckout("2024-02-10");
    booking1.setBookingdates(bookingDates1);
    booking1.setAdditionalneeds("Breakfast");

    System.out.println(booking1);

    ObjectMapper objectMapper = new ObjectMapper();
    String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking1);
    System.out.println(jsonString);
}
}
