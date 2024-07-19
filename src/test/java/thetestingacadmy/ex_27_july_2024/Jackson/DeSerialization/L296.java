package thetestingacadmy.ex_27_july_2024.Jackson.DeSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import thetestingacadmy.ex_27_july_2024.Gson.Serialization.Generated.Booking;

public class L296 {

    @Test
    public void Deserialization() throws JsonProcessingException {
        String jsonString = "{\n" +
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
        ObjectMapper objectMapper=new ObjectMapper();
        Booking booking = objectMapper.readValue(jsonString, Booking.class);
        System.out.println(booking);
        System.out.println(booking.getFirstname());


    }
}
